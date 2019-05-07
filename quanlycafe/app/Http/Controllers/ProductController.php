<?php

namespace App\Http\Controllers;
use App\Http\Requests\ProductRequest;
use App\Product;
use Illuminate\Http\Request;
use Validator;

class ProductController extends Controller {
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index() {
        return Product::all('id','name','price');
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
    public function store(ProductRequest $request) {
        $product = new Product();
        $product->id = $request->id;
        $product->name = $request->name;
        $product->price = $request->price;
        $product->description = $request->description;
        $product->id_category = $request->id_category;
        try {
            $product->save();
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
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id) {
        //
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
            'name' => 'required|unique:products,name,' . $id,
            'price' => 'required|regex:/^[0-9]+(\.[0-9]{0,3}?)?$/'
        ],
            [
                'name.required'  => EMPTY_NAME,
                'name.unique'    => IDENTICAL_NAME,
                'price.required' => EMPTY_PRICE,
                'price.regex'    => FORMAT_INVALID_PRICE
            ]);

        if ($validator->fails()) {
            return $validator->errors()->first();
        } else {
            $product = Product::find($id);
            if ($product == null) {
                return PRODUCT_NOT_FOUND;
            } else {
                try {
                    $product->update([
                        'name' => $request->name,
                        'price' => $request->price,
                        'description' => $request->description,
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
        $result = Product::find($id);
        if ($result == null) {
            return PRODUCT_NOT_FOUND;
        } else {
            try {
                $result->delete();
                return SUCCESS;
            } catch (\Exception $e) {
                return FAIL;
            }
        }
    }
}
