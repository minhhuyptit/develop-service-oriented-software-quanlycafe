<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Product extends Model
{
    protected $table = 'products';
    protected $fillable = ['id','name','price','description','id_category'];
    protected $keyType = 'string';
    public $timestamps = false;

    public function category()
    {
        return $this->belongsTo('App\Category', 'id_category', 'id');
    }

    public function bill_detail()
    {
        return $this->hasMany('App\BillDetail', 'id_product', 'id');
    }

}
