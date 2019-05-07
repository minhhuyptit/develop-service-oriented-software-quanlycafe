<?php

use Illuminate\Http\Request;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
 */

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});

Route::post('login', 'UserController@login');
Route::resource('area', 'AreaController');
Route::resource('bill', 'BillController');
Route::resource('category', 'CategoryController');
Route::resource('table', 'TableController');
Route::resource('product', 'ProductController');
Route::post('statistic/products', 'StatisticalController@productSales');