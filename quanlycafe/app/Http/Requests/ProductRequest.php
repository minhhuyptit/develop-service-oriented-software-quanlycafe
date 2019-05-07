<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Contracts\Validation\Validator;

class ProductRequest extends FormRequest {
    /**
     * Determine if the user is authorized to make this request.
     *
     * @return bool
     */
    public function authorize() {
        return true;
    }

    /**
     * Get the validation rules that apply to the request.
     *
     * @return array
     */
    public function rules() {
        return [
            'id'            => 'required|unique:products,id',
            'name'          => 'required|unique:products,name',
            'price'         => 'required|regex:/^[0-9]+(\.[0-9]{0,3}?)?$/',
            'id_category'   => 'required|exists:categories,id'
        ];
    }
    public function messages() {
        return [
            'id.required'       => EMPTY_ID,
            'id.unique'         => IDENTICAL_ID,
            'name.required'     => EMPTY_NAME,
            'name.unique'       => IDENTICAL_NAME,
            'price.required'    => EMPTY_PRICE,
            'price.regex'       => FORMAT_INVALID_PRICE, 
            'id_category.required' => EMPTY_CATEGORY,
            'id_category.exists'=> NOT_EXISTS_CATEGORY
        ];
    }

    protected function failedValidation(Validator $validator) //Chú ý nhớ import thư viện Illuminate\Contracts\Validation\Validator;
    {
        echo $validator->errors()->first();
        die();
    }
}
