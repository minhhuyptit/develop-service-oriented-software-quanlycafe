<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migrations\Migration;

class CreateBillsTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('bills', function (Blueprint $table) {
            $table->bigIncrements('id');
            $table->dateTime('time_in');
            $table->dateTime('time_out')->nullable();
            $table->double('total')->unsigned();;
            $table->bigInteger('id_user_in')->unsigned();
            $table->bigInteger('id_user_out')->unsigned()->nullable();
            $table->integer('id_table')->unsigned();
            $table->foreign('id_user_in')->references('id')->on('users')
            ->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('id_user_out')->references('id')->on('users')
            ->onUpdate('cascade')->onDelete('cascade');
            $table->foreign('id_table')->references('id')->on('tables')
            ->onUpdate('cascade');
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
        Schema::dropIfExists('bills');
    }
}
