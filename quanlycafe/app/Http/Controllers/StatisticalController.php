<?php

namespace App\Http\Controllers;
use Illuminate\Http\Request;
use DB;

class StatisticalController extends Controller {
    public function productSales(Request $request) {
        $query = "SELECT bill_details.id_product, products.name, products.price,
                            SUM( bill_details.quantity) as quantity, bill_details.discount
                FROM(SELECT id, time_out FROM bills WHERE time_out 
                BETWEEN ".$request->start_day." AND ".$request->end_day.") as bills 
                JOIN bill_details ON bills.id = bill_details.id_bill 
                LEFT JOIN products ON products.id = bill_details.id_product
                GROUP BY bill_details.id_product, products.name, products.price, bill_details.discount";
        $result = DB::select($query);
        return $result;    
    }
}
