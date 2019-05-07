<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class BillDetail extends Model
{
    protected $table = 'bill_details';
    protected $fillable = ['id_bill','id_product','quantity', 'price', 'discount'];
    public $timestamps = false;

    public function bill()
    {
        return $this->belongsTo('App\Bill', 'id_bill', 'id');
    }

    public function product()
    {
        return $this->belongsTo('App\Product', 'id_product', 'id');
    }
}
