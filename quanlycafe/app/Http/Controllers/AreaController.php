<?php

namespace App\Http\Controllers;

use App\Area;
use Illuminate\Http\Request;
use App\Http\Requests\AreaRequest;
use Validator;

class AreaController extends Controller {
    public function index() {
        return Area::orderBy('id')->get();
    }
    public function create() {

    }
    public function store(AreaRequest $request) {
        $area = new Area();
        $area->name = $request->name;
        try {
            $area->save();
            return SUCCESS;
        } catch (\Exception $e) {
            return FAIL;
        }
    }
    public function show($id) {
        $result = Area::find($id);
        return ($result == null) ? AREA_NOT_FOUND : $result->table;
    }

    public function edit($id) {

    }
    public function update(Request $request, $id) {
        $validator = Validator::make($request->all(), [
            'name' => 'required|unique:areas,name,' . $id,
        ],
        [
            'name.required' => EMPTY_NAME,
            'name.unique' => IDENTICAL_NAME,
        ]);

        if ($validator->fails()) {
            return $validator->errors()->first();
        } else {
            $area = Area::find($id);
            if ($area == null) {
                return AREA_NOT_FOUND;
            } else {
                try {
                    $area->update(['name' => $request->name]);
                    return SUCCESS;
                } catch (\Exception $e) {
                    return FAIL;
                }
            }
        }
    }
    public function destroy($id) {
        $result = Area::find($id);
        if ($result == null) {
            return AREA_NOT_FOUND;
        } else {
            try {
                $result->delete();
                return SUCCESS;
            } catch (\Exception $e) {
                $error = $e->getMessage();
                $keyword_error = 'CONSTRAINT';
                if(stripos($error,$keyword_error) != ''){
                    return FK_EXIST_ANOTHER_TABLE;
                }else{
                    return FAIL;
                }
            }
        }
    }
}
