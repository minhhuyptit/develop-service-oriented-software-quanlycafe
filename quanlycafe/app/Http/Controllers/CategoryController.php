<?php

namespace App\Http\Controllers;

use App\Category;
use App\Http\Requests\CategoryRequest;
use Illuminate\Http\Request;
use Validator;

class CategoryController extends Controller {
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index() {
        return Category::all();
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
    public function store(CategoryRequest $request) {
        $category = new Category();
        $category->id = $request->id;
        $category->name = $request->name;
        try {
            $category->save();
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
        $result = Category::find($id);
        return ($result == null) ? CATEGORY_NOT_FOUND : $result->product;
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
            'name' => 'required|unique:categories,name,' . $id,
        ],
            [
                'name.required' => EMPTY_NAME,
                'name.unique' => IDENTICAL_NAME,
            ]);

        if ($validator->fails()) {
            return $validator->errors()->first();
        } else {
            $category = Category::find($id);
            if ($category == null) {
                return CATEGORY_NOT_FOUND;
            } else {
                try {
                    $category->update(['name' => $request->name]);
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
        $result = Category::find($id);
        if ($result == null) {
            return CATEGORY_NOT_FOUND;
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
