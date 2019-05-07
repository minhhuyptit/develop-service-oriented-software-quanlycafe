<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Contracts\Validation\Validator;

class TableRequest extends FormRequest
{
    /**
     * Determine if the user is authorized to make this request.
     *
     * @return bool
     */
    public function authorize()
    {
        return true;
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array
     */
    public function rules()
    {
        return [
            'name'      => 'required|unique:tables,name',
            'seat'      => 'required|integer',
            'id_area'   => 'required|exists:areas,id|integer'
        ];
    }

    public function messages(){
        return [
            'name.required'     => EMPTY_NAME,
            'seat.required'     => EMPTY_SEAT,
            'id_area.required'  => EMPTY_AREA,
            'name.unique'       => IDENTICAL_NAME,
            'seat.integer'      => NOT_NUMBER_SEAT,
            'id_area.exists'    => NOT_EXISTS_AREA,
            'id_area.integer'   => NOT_NUMBER_ID_AREA
        ];
    }
    
    protected function failedValidation(Validator $validator)   //Chú ý nhớ import thư viện Illuminate\Contracts\Validation\Validator;
    {
        echo $validator->errors()->first();
        die();
    }

}
