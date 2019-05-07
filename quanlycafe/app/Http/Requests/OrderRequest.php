<?php

namespace App\Http\Requests;

use Illuminate\Foundation\Http\FormRequest;
use Illuminate\Contracts\Validation\Validator;
use App\Http\Requests\ValidationException;
use Illuminate\Http\JsonResponse;
use Illuminate\Http\Exceptions\HttpResponseException;

class OrderRequest extends FormRequest
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
            'id_table' => 'required',
            'id_user' => 'required',
            'cart' => 'required'
        ];
    }

    public function messages(){
        return [
            'id_table.required' => EMPTY_ID_TABLE,
            'id_user.required' => EMPTY_ID_USER,
            'cart.required' => EMPTY_CART
        ];
    }
    protected function failedValidation(Validator $validator)   //Chú ý nhớ import thư viện Illuminate\Contracts\Validation\Validator;
    {
        echo $validator->errors()->first();
        die();
    }
}
