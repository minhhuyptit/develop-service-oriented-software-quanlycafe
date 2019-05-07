<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Area extends Model
{
    protected $table = 'areas';
    protected $fillable = ['name'];
    public $timestamps = false;

    public function table()
    {
        return $this->hasMany('App\Table','id_area','id');
    }
}
