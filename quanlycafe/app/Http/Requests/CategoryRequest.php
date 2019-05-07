<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Contracts\Validation\Validator;

class CategoryRequest extends FormRequest {
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
            'id'   => 'required|unique:categories,id',
            'name' => 'required|unique:categories,name'
        ];
    }

    public function messages() {
        return [
            'id.required'   => EMPTY_ID,
            'id.unique'     => IDENTICAL_ID,
            'name.required' => EMPTY_NAME,
            'name.unique'   => IDENTICAL_NAME
        ];
    }

    protected function failedValidation(Validator $validator) //Chú ý nhớ import thư viện Illuminate\Contracts\Validation\Validator;
    {
        echo $validator->errors()->first();
        die();
    }

}
