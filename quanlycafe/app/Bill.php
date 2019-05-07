<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Bill extends Model
{
    protected $table = 'bills';
    protected $fillable = ['time_in','time_out','total','id_user_in','id_user_out','id_table'];
    public $timestamps = false;

    public function table()
    {
        return $this->belongsTo('App\Table','id_table','id');
    }

    public function bill_detail()
    {
        return $this->hasMany('App\BillDetail','id_bill','id');
    }

    public function user_in()
    {
        return $this->belongsTo('App\User','id_user_in','id');
    }

    public function user_out()
    {
        return $this->belongsTo('App\User','id_user_out','id');
    }

}
