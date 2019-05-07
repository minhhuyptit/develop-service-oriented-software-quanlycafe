<?php

namespace App\Http\Controllers;

use App\Bill;
use App\BillDetail;
use App\Http\Requests\OrderRequest;
use App\Table;
use Carbon\Carbon;
use DB;
use Log;
use Illuminate\Http\Request;
use Validator;

class BillController extends Controller {
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index() {
        // echo 'zo day ne';
        // $json = '{"cartItem":{"st2":{"sanpham":{"id":"st2","name":"Sinh tố Mãn Cầu","price":60000.0,"description":"","id_category":"st"},"soluong":1,"chietkhau":0},"st1":{"sanpham":{"id":"st1","name":"Sinh tố bơ","price":20000.0,"description":"","id_category":"st"},"soluong":1,"chietkhau":0},"ngk3":{"sanpham":{"id":"ngk3","name":"Nước suối","price":10000.0,"description":"","id_category":"ngk"},"soluong":1,"chietkhau":0},"ts2":{"sanpham":{"id":"ts2","name":"Trà sữa Trân Châu","price":20000.0,"description":"","id_category":"ts"},"soluong":1,"chietkhau":0},"ts1":{"sanpham":{"id":"ts1","name":"Trà sữa Socola","price":20000.0,"description":"","id_category":"ts"},"soluong":2,"chietkhau":0},"k1":{"sanpham":{"id":"k1","name":"Kem dâu","price":20000.0,"description":"","id_category":"k"},"soluong":1,"chietkhau":0},"cf1":{"sanpham":{"id":"cf1","name":"Cà phê sữa","price":15000.0,"description":"","id_category":"cf"},"soluong":2,"chietkhau":0}}}';
        // $json = '{"cartItem":{"stmc":{"product":{"id":"stmc","name":"Sinh tố Mãng Cầu","price":60000.0,"description":"","id_category":"st"},"quantity":1,"discount":0},"stb":{"product":{"id":"stb","name":"Sinh tố bơ","price":20000.0,"description":"","id_category":"st"},"quantity":1,"discount":0},"aqfn":{"product":{"id":"aqfn","name":"Nước suối","price":10000.0,"description":"","id_category":"ngk"},"quantity":1,"discount":0},"aqfn":{"product":{"id":"aqfn","name":"Trà sữa Trân Châu","price":20000.0,"description":"","id_category":"ts"},"quantity":1,"discount":0},"tsv":{"product":{"id":"tsv","name":"Trà sữa Socola","price":20000.0,"description":"","id_category":"ts"},"quantity":2,"discount":0},"tsv":{"product":{"id":"tsv","name":"Kem dâu","price":20000.0,"description":"","id_category":"k"},"quantity":1,"discount":0},"tsv":{"product":{"id":"tsv","name":"Cà phê sữa","price":15000.0,"description":"","id_category":"cf"},"quantity":2,"discount":0}}}';
        // $x ='{"cartItem":{"stmc":{"product":{"id":"stmc","name":"Sinh tố Mãng Cầu","price":60000.0,"description":"","id_category":"st"},"quantity":1,"discount":0},"stb":{"product":{"id":"stb","name":"Sinh tố bơ","price":20000.0,"description":"","id_category":"st"},"quantity":2,"discount":0},"aqfn":{"product":{"id":"aqfn","name":"Nước suối Aquafina","price":10000.0,"description":"","id_category":"bc"},"quantity":3,"discount":0},"bbws":{"product":{"id":"bbws","name":"Bia Budweiser","price":19000.0,"description":"","id_category":"bc"},"quantity":2,"discount":0}}}';

        // $json = json_decode($x, true);

        // echo "<pre>";
        // print_r($json);
        // echo "</pre>";

    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create() {

    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */

    public function store(OrderRequest $request) {
        $idUser = $request->id_user;
        $idTable = $request->id_table;
        $table = Table::find($idTable);
        $idUser = $request->id_user;
     
        $cart = json_decode($request->cart)->cartItem;   

        if ($table->status == 1) { //===== EDIT =====
            if ($this->editOrder($idTable, $idUser, $cart) == true) {
                return ORDER_SUCCESS;
            } else {
                return ORDER_FAIL;
            }
        } else { //===== ADD =====
            if ($this->addOrder($table, $idTable, $idUser, $cart) == true) {
                return ORDER_SUCCESS;
            } else {
                return ORDER_FAIL;
            }
        }
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id) {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id) {

    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id) { //Thanh toán
        $validator = Validator::make($request->all(), [
            'id_user' => 'required',
        ],
            [
                'id_user.required' => EMPTY_ID_USER,
            ]);

        if ($validator->fails()) {
            return $validator->errors()->first();
        } else {
            $table = Table::find($id);
            if ($table->status == 0) { //Trường hợp tính tiền mà bàn có trạng thái rỗng là sai
                return TABLE_AVALIABLE;
            } else {
                $result = $this->payment($table, $request);
                return ($result == false) ? PAYMENT_FAIL : $result;
            }
        }
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id) {
        //
    }

    private function payment($table, $request) {
        $bill = $table->bill->last();
        $total = 0;
        foreach ($bill->bill_detail as $val) {
            $total += ($val->quantity * $val->price);
        }
        try {
            DB::transaction(function () use ($bill, $request, $table, $total) {
                $bill->update([
                    'id_user_out' => $request->id_user,
                    'time_out' => Carbon::now('Asia/Ho_Chi_Minh'),
                    'total' => $total,
                ]);
                $table->update(['status' => 0]);
            });
            return $total;
        } catch (\Exception $e) {
            return false;
        }
    }

    private function addOrder($table, $idTable, $idUser, $cart) {
        $bill = new Bill();
        $bill->time_in = Carbon::now('Asia/Ho_Chi_Minh');
        $bill->time_out = null;
        $bill->total = 0;
        $bill->id_user_in = $idUser;
        $bill->id_user_out = null;
        $bill->id_table = $idTable;

        try {
            if ($bill->save()) {
                DB::transaction(function () use ($table, $bill, $cart) {
                    $table->update(['status' => 1]); //Bật trạng thái bàn đã sử dụng
                    $this->addBillDetail($bill->id, $cart);
                });
                return true;
            }
        } catch (\Exception $e) {
            return false;
        }
    }

    private function editOrder($idTable, $idUser, $cart) {
        $lastBill = Table::find($idTable)->bill->last();
        //Xóa các BillDetail của Bill cuối cùng của bàn này đang sử dụng
        DB::table('bill_details')->where('id_bill', $lastBill->id)->delete();

        //Cập nhật lại user edit lại Order
        $lastBill->update(['id_user_in' => $idUser]);

        //Thêm lại vào BillDetail
        try {
            DB::transaction(function () use ($lastBill, $cart) {
                $this->addBillDetail($lastBill->id, $cart);
            });
            return true;
        } catch (\Exception $e) {
            return false;
        }
    }

    private function addBillDetail($id_bill, $cartItem) {
        foreach ($cartItem as $key => $val) {
            $billDetail = new BillDetail();
            $billDetail->id_bill = $id_bill;
            $billDetail->id_product = $val->product->id;
            $billDetail->quantity = $val->quantity;
            $billDetail->price = $val->product->price;
            $billDetail->discount = $val->discount;
            $billDetail->save();
        }
    }
}