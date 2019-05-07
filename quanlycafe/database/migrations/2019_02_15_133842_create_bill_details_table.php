<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateBillDetailsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('bill_details', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->bigInteger('id_bill')->unsigned();
            $table->string('id_product',20);
            $table->integer('quantity')->unsigned();
            $table->double('price')->unsigned();
            $table->unsignedTinyInteger('discount');
            $table->foreign('id_bill')->references('id')->on('bills')
            ->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('id_product')->references('id')->on('products')
            ->onUpdate('cascade')->onDelete('cascade');
            // $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('bill_details');
    }
}
