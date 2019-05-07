<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Table extends Model
{
    protected $table = 'tables';
    protected $fillable = ['name','seat','status','id_area'];
    public $timestamps = false;

    public function area()
    {
        return $this->belongsTo('App\Area','id_area','id');
    }

    public function bill()
    {
        return $this->hasMany('App\Bill','id_table','id');
    }
}
