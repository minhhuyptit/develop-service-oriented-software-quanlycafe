<?php

namespace App;

use Illuminate\Notifications\Notifiable;
use Illuminate\Contracts\Auth\MustVerifyEmail;
use Illuminate\Foundation\Auth\User as Authenticatable;
use DB;

class User extends Authenticatable
{
    use Notifiable;

    protected $fillable = ['id','username', 'password', 'fullname','phone','image','salary','access_level'];

    protected $hidden = [
        'password', 'remember_token',
    ];

    public function bill_in()
    {
        return $this->hasMany('App\Bill', 'id_user_in', 'id');
    }

    public function bill_out()
    {
        return $this->hasMany('App\Bill', 'id_user_out', 'id');
    }

    public function login($username, $password){
        $user = \App\User::select('id','username','password','fullname','phone','image','salary','access_level')->where(['username' => $username, 'password' => md5($password)])->first();
        return $user;
    }

}
