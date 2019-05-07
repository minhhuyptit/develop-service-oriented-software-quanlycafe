<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Contracts\Validation\Validator;


class AreaRequest extends FormRequest
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
            'name' => 'required|unique:areas,name'
        ];
    }

    public function messages(){
        return [
            'name.required' => EMPTY_NAME,
            'name.unique' => IDENTICAL_NAME
        ];
    }
    
    protected function failedValidation(Validator $validator)   //Chú ý nhớ import thư viện Illuminate\Contracts\Validation\Validator;
    {
        echo $validator->errors()->first();
        die();
    }
}
