<?php

namespace App\Http\Controllers;

use App\Http\Requests\TableRequest;
use App\Table;
use Illuminate\Http\Request;
use Validator;

class TableController extends Controller {
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index() {
        //
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create() {
        //
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(TableRequest $request) {
        $table = new Table();
        $table->name = $request->name;
        $table->seat = $request->seat;
        $table->status = 0;
        $table->id_area = $request->id_area;
        try {
            $table->save();
            return SUCCESS;
        } catch (\Exception $e) {
            return FAIL;
        }
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id) {
        $table = Table::find($id);
        if ($table->status == 1) {
            $lastBill = $table->bill->last(); //Lấy ra thông tin bill cuối cùng nếu bàn đang sử dụng
            $cartItem = array();
            foreach ($lastBill->bill_detail as $key => $val) {
                $itemDetail = array(
                    'product' => $val->product,
                    'quantity' => $val->quantity,
                    'discount' => $val->discount,
                );
                $cartItem[$val->id_product] = $itemDetail;
            }
            return array('cartItem' => $cartItem);
        } else {
            return TABLE_AVALIABLE;
        }
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id) {
        // return 'zo day';
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id) {
        $validator = Validator::make($request->all(), [
            'name' => 'required|unique:tables,name,' . $id
        ],
            [
                'name.required' => EMPTY_NAME,
                'name.unique' => IDENTICAL_NAME
            ]);

        if ($validator->fails()) {
            return $validator->errors()->first();
        } else {
            $table = Table::find($id);
            if ($table == null) {
                return TABLE_NOT_FOUND;
            } else {
                try {
                    $table->update([
                        'name' => $request->name
                        // 'seat' => $request->seat,
                    ]);
                    return SUCCESS;
                } catch (\Exception $e) {
                    return FAIL;
                }
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
        $result = Table::find($id);
        if ($result == null) {
            return TABLE_NOT_FOUND;
        } else {
            try {
                $result->delete();
                return SUCCESS;
            } catch (\Exception $e) {
                $error = $e->getMessage();
                $keyword_error = 'CONSTRAINT';
                if (stripos($error, $keyword_error) != '') {
                    return FK_EXIST_ANOTHER_TABLE;
                } else {
                    return FAIL;
                }
            }
        }
    }
}
