<?php

use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    public function run()
    {
        $this->call(AreaTableSeeder::class);
        $this->call(TableTableSeeder::class);
        $this->call(UserTableSeeder::class);
        $this->call(BillTableSeeder::class);
        $this->call(CategoryTableSeeder::class);
        $this->call(ProductTableSeeder::class);
        $this->call(BillDetailTableSeeder::class);
    }
}

class AreaTableSeeder extends Seeder
{
    public function run()
    {
        DB::table('areas')->insert([
            array('name'=>'Khu A'),
            array('name'=>'Khu B'),
            array('name'=>'Khu C')
        ]);
    }
}
class TableTableSeeder extends Seeder
{
    public function run()
    {
        DB::table('tables')->insert([
            array('name'=>'Bàn A1', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A2', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A3', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A4', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A5', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A6', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A7', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A8', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A9', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A10', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A11', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A12', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A13', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A14', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn A15', 'seat'=>10, 'status'=>0, 'id_area'=>1),
            array('name'=>'Bàn B1', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B2', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B3', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B4', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B5', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B6', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B7', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B8', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B9', 'seat'=>10, 'status'=>0, 'id_area'=>2),
            array('name'=>'Bàn B10', 'seat'=>10, 'status'=>0, 'id_area'=>3),
            array('name'=>'Bàn C1', 'seat'=>10, 'status'=>0, 'id_area'=>3),
            array('name'=>'Bàn C2', 'seat'=>10, 'status'=>0, 'id_area'=>3),
            array('name'=>'Bàn C3', 'seat'=>10, 'status'=>0, 'id_area'=>3),
            array('name'=>'Bàn C4', 'seat'=>10, 'status'=>0, 'id_area'=>3),
            array('name'=>'Bàn C5', 'seat'=>10, 'status'=>0, 'id_area'=>3),
            array('name'=>'Bàn C6', 'seat'=>10, 'status'=>0, 'id_area'=>3),
            array('name'=>'Bàn C7', 'seat'=>10, 'status'=>0, 'id_area'=>3),
            array('name'=>'Bàn C8', 'seat'=>10, 'status'=>0, 'id_area'=>3),
        ]);
    }
}
class UserTableSeeder extends Seeder
{
    public function run()
    {
        DB::table('users')->insert([
            array('username'=>'admin1', 'password'=>md5('Akai123456'), 'fullname'=>'Nguyễn Hà Minh Huy', 'phone'=>'0523939339', 'image'=>'image_1.png', 'salary'=>15000000, 'access_level'=>1),
            array('username'=>'admin2', 'password'=>md5('Akai123456'), 'fullname'=>'Đặng Hoàng Khang', 'phone'=>'0523939139', 'image'=>'image_2.jpg', 'salary'=>25000000, 'access_level'=>1),
            array('username'=>'admin3', 'password'=>md5('Akai123456'), 'fullname'=>'Nguyễn Tấn Luông', 'phone'=>'0899167379', 'image'=>'image_3.jpg', 'salary'=>35000000, 'access_level'=>1),
            array('username'=>'member1', 'password'=>md5('Akai123456'), 'fullname'=>'Alan Turing', 'phone'=>'0945335379', 'image'=>'image_4.jpg', 'salary'=>45000000, 'access_level'=>0),
            array('username'=>'member2', 'password'=>md5('Akai123456'), 'fullname'=>'Dennis Ritchie', 'phone'=>'0886494579', 'image'=>'image_5.jpg', 'salary'=>55000000, 'access_level'=>0),
            array('username'=>'member3', 'password'=>md5('Akai123456'), 'fullname'=>'Linus Torvalds', 'phone'=>'0898083079', 'image'=>'image_6.png', 'salary'=>50000000, 'access_level'=>0),
            array('username'=>'member4', 'password'=>md5('Akai123456'), 'fullname'=>'Mark Zuckerberg', 'phone'=>'0942460579', 'image'=>'image_7.png', 'salary'=>40000000, 'access_level'=>0),
            array('username'=>'member5', 'password'=>md5('Akai123456'), 'fullname'=>'Larry Page', 'phone'=>'0868641232', 'image'=>'image_8.jpg', 'salary'=>30000000, 'access_level'=>0),
            array('username'=>'member6', 'password'=>md5('Akai123456'), 'fullname'=>'Steve Jobs', 'phone'=>'0868324272', 'image'=>'image_9.jpg', 'salary'=>20000000, 'access_level'=>0),
        ]);
    }
}
class BillTableSeeder extends Seeder
{
    public function run()
    {
        DB::table('bills')->insert([
            array('time_in'=>'2019-02-16 16:48:50', 'time_out'=>'2019-02-16 17:14:35', 'total'=>295000, 'id_user_in'=>1, 'id_user_out'=>1, 'id_table'=>1),
            array('time_in'=>'2019-02-16 12:48:45', 'time_out'=>'2019-02-16 13:24:35', 'total'=>428000, 'id_user_in'=>1, 'id_user_out'=>2, 'id_table'=>2),
            array('time_in'=>'2019-02-16 09:48:50', 'time_out'=>'2019-02-16 10:14:35', 'total'=>409000, 'id_user_in'=>2, 'id_user_out'=>3, 'id_table'=>3),
            array('time_in'=>'2019-02-16 09:28:50', 'time_out'=>'2019-02-16 11:15:55', 'total'=>769000, 'id_user_in'=>1, 'id_user_out'=>3, 'id_table'=>4),
            array('time_in'=>'2019-02-17 16:48:50', 'time_out'=>'2019-02-17 17:14:35', 'total'=>295000, 'id_user_in'=>2, 'id_user_out'=>2, 'id_table'=>5),
            array('time_in'=>'2019-02-17 12:48:45', 'time_out'=>'2019-02-17 13:24:35', 'total'=>428000, 'id_user_in'=>2, 'id_user_out'=>3, 'id_table'=>6),
            array('time_in'=>'2019-02-17 09:48:50', 'time_out'=>'2019-02-17 10:14:35', 'total'=>409000, 'id_user_in'=>3, 'id_user_out'=>2, 'id_table'=>7),
            array('time_in'=>'2019-02-17 09:28:50', 'time_out'=>'2019-02-17 11:15:55', 'total'=>769000, 'id_user_in'=>1, 'id_user_out'=>2, 'id_table'=>8),
            array('time_in'=>'2019-02-18 16:48:50', 'time_out'=>'2019-02-18 17:14:35', 'total'=>295000, 'id_user_in'=>3, 'id_user_out'=>3, 'id_table'=>9),
            array('time_in'=>'2019-02-18 12:48:45', 'time_out'=>'2019-02-18 13:24:35', 'total'=>428000, 'id_user_in'=>3, 'id_user_out'=>3, 'id_table'=>10),
            array('time_in'=>'2019-02-18 09:48:50', 'time_out'=>'2019-02-18 10:14:35', 'total'=>409000, 'id_user_in'=>3, 'id_user_out'=>2, 'id_table'=>11),
            array('time_in'=>'2019-02-18 09:28:50', 'time_out'=>'2019-02-18 11:15:55', 'total'=>769000, 'id_user_in'=>2, 'id_user_out'=>1, 'id_table'=>12)
        ]);
    }
}
class CategoryTableSeeder extends Seeder
{
    public function run()
    {
        DB::table('categories')->insert([
            array('id'=>'tcf', 'name'=>'Trà - Cafe'),
            array('id'=>'ts', 'name'=>'Trà sữa'),
            array('id'=>'ht', 'name'=>'Hồng trà'),
            array('id'=>'st', 'name'=>'Sinh tố'),
            array('id'=>'netc', 'name'=>'Nước ép trái cây'),
            array('id'=>'bc', 'name'=>'Bia - Coke'),
            array('id'=>'ksc', 'name'=>'Kem - Sữa chua'),
            array('id'=>'ta', 'name'=>'Thức ăn')
        ]);
    }
}
class ProductTableSeeder extends Seeder
{
    public function run()
    {
        DB::table('products')->insert([
            array('id'=>'cfd', 'name'=>'Cafe Đen', 'price'=>15000, 'description'=>'', 'id_category'=>'tcf'),
            array('id'=>'cfs', 'name'=>'Cafe Sữa', 'price'=>22000, 'description'=>'', 'id_category'=>'tcf'),
            array('id'=>'cc', 'name'=>'Cacao', 'price'=>20000, 'description'=>'', 'id_category'=>'tcf'),
            array('id'=>'cpcn', 'name'=>'Cappuccino', 'price'=>45000, 'description'=>'', 'id_category'=>'tcf'),
            array('id'=>'eps', 'name'=>'Espresso', 'price'=>35000, 'description'=>'', 'id_category'=>'tcf'),
            array('id'=>'mch', 'name'=>'Mocha', 'price'=>17000, 'description'=>'', 'id_category'=>'tcf'),
            array('id'=>'lt', 'name'=>'Latte', 'price'=>25000, 'description'=>'', 'id_category'=>'tcf'),
            array('id'=>'tlt', 'name'=>'Trà Lipton', 'price'=>20000, 'description'=>'', 'id_category'=>'tcf'),
            array('id'=>'tsph', 'name'=>'Trà sữa Phượng Hoàng', 'price'=>18000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tstc', 'name'=>'Trà sữa Trân Châu', 'price'=>18000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tshn', 'name'=>'Trà sữa Honny', 'price'=>19000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tsbh', 'name'=>'Trà sữa Bạc Hà', 'price'=>19000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tskw', 'name'=>'Trà sữa Kiwi', 'price'=>21000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tsd', 'name'=>'Trà sữa Dâu', 'price'=>22000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tsn', 'name'=>'Trà sữa Nho', 'price'=>23000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tst', 'name'=>'Trà sữa Táo', 'price'=>25000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tsda', 'name'=>'Trà sữa Đào', 'price'=>22000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tsv', 'name'=>'Trà sữa Vải', 'price'=>17000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tsscl', 'name'=>'Trà sữa Socola', 'price'=>16000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tscrm', 'name'=>'Trà sữa Caramen', 'price'=>19000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tssr', 'name'=>'Trà sữa Sầu Riêng', 'price'=>24000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'tscd', 'name'=>'Trà sữa Chanh Dây', 'price'=>23000, 'description'=>'', 'id_category'=>'ts'),
            array('id'=>'htdl', 'name'=>'Hồng trà Dưa Lưới' , 'price'=>23000, 'description'=>'', 'id_category'=>'ht'),
            array('id'=>'htlh', 'name'=>'Hồng trà Lô Hội', 'price'=>23000, 'description'=>'', 'id_category'=>'ht'),
            array('id'=>'htss', 'name'=>'Hồng trà Sương Sáo', 'price'=>23000, 'description'=>'', 'id_category'=>'ht'),
            array('id'=>'hthtc', 'name'=>'Hồng trà Hạt Trái Cây', 'price'=>23000, 'description'=>'', 'id_category'=>'ht'),
            array('id'=>'htbh', 'name'=>'Hồng trà Bạc Hà', 'price'=>23000, 'description'=>'', 'id_category'=>'ht'),
            array('id'=>'htd', 'name'=>'Hồng trà Dâu', 'price'=>23000, 'description'=>'', 'id_category'=>'ht'),
            array('id'=>'htmo', 'name'=>'Hồng trà Mật Ong', 'price'=>23000, 'description'=>'', 'id_category'=>'ht'),
            array('id'=>'stx', 'name'=>'Sinh tố Xoài', 'price'=>22000, 'description'=>'', 'id_category'=>'st'),
            array('id'=>'stb', 'name'=>'Sinh tố Bơ', 'price'=>30000, 'description'=>'', 'id_category'=>'st'),
            array('id'=>'stmc', 'name'=>'Sinh tố Mãng Cầu', 'price'=>25000, 'description'=>'', 'id_category'=>'st'),
            array('id'=>'stcc', 'name'=>'Sinh tố Cà Chua', 'price'=>20000, 'description'=>'', 'id_category'=>'st'),
            array('id'=>'std', 'name'=>'Sinh tố Dâu', 'price'=>22000, 'description'=>'', 'id_category'=>'st'),
            array('id'=>'stdu', 'name'=>'Sinh tố Dừa', 'price'=>20000, 'description'=>'', 'id_category'=>'st'),
            array('id'=>'stcr', 'name'=>'Sinh tố Cà Rốt', 'price'=>20000, 'description'=>'', 'id_category'=>'st'),
            array('id'=>'stspc', 'name'=>'Sinh tố Sapochê', 'price'=>24000, 'description'=>'', 'id_category'=>'st'),
            array('id'=>'net', 'name'=>'Nước ép Táo', 'price'=>24000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'necr', 'name'=>'Nước ép Cà Rốt', 'price'=>24000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'necc', 'name'=>'Nước ép Cà Chua', 'price'=>24000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'nedh', 'name'=>'Nước ép Dưa Hấu', 'price'=>22000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'neo', 'name'=>'Nước ép Ổi', 'price'=>22000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'nec', 'name'=>'Nước ép Cam', 'price'=>26000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'dm', 'name'=>'Đá me', 'price'=>18000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'cm', 'name'=>'Chanh muối', 'price'=>19000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'dc', 'name'=>'Đá chanh', 'price'=>15000, 'description'=>'', 'id_category'=>'netc'),
            array('id'=>'btg', 'name'=>'Bia Tiger', 'price'=>15000, 'description'=>'', 'id_category'=>'bc'),
            array('id'=>'bhnk', 'name'=>'Bia Heineken', 'price'=>18000, 'description'=>'', 'id_category'=>'bc'),
            array('id'=>'bbws', 'name'=>'Bia Budweiser', 'price'=>19000, 'description'=>'', 'id_category'=>'bc'),
            array('id'=>'cccl', 'name'=>'Coca Cola', 'price'=>15000, 'description'=>'', 'id_category'=>'bc'),
            array('id'=>'ps', 'name'=>'Pepsi', 'price'=>15000, 'description'=>'', 'id_category'=>'bc'),
            array('id'=>'lv', 'name'=>'Nước suối Lavie', 'price'=>10000, 'description'=>'', 'id_category'=>'bc'),
            array('id'=>'aqfn', 'name'=>'Nước suối Aquafina', 'price'=>10000, 'description'=>'', 'id_category'=>'bc'),
            array('id'=>'st', 'name'=>'Sting', 'price'=>12000, 'description'=>'', 'id_category'=>'bc'),
            array('id'=>'scvq', 'name'=>'Sữa chua Việt Quất', 'price'=>25000, 'description'=>'', 'id_category'=>'ksc'),
            array('id'=>'scnc', 'name'=>'Sữa chua Nếp Cẩm', 'price'=>22000, 'description'=>'', 'id_category'=>'ksc'),
            array('id'=>'schq', 'name'=>'Sữa chua Hoa Quả', 'price'=>24000, 'description'=>'', 'id_category'=>'ksc'),
            array('id'=>'sccc', 'name'=>'Sữa chua Ca Cao', 'price'=>23000, 'description'=>'', 'id_category'=>'ksc'),
            array('id'=>'sctc', 'name'=>'Sữa chua Thập Cẩm', 'price'=>28000, 'description'=>'', 'id_category'=>'ksc'),
            array('id'=>'kvn', 'name'=>'Kem Vani', 'price'=>30000, 'description'=>'', 'id_category'=>'ksc'),
            array('id'=>'kscl', 'name'=>'Kem Socola', 'price'=>35000, 'description'=>'', 'id_category'=>'ksc'),
            array('id'=>'ksr', 'name'=>'Kem Sầu Riêng', 'price'=>28000, 'description'=>'', 'id_category'=>'ksc'),
            array('id'=>'ktc', 'name'=>'Khoai Tây Chiên', 'price'=>20000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'cvc', 'name'=>'Cá Viên Chiên', 'price'=>15000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'bvc', 'name'=>'Bò Viên Chiên', 'price'=>15000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'btt', 'name'=>'Bánh Tráng Trộn', 'price'=>18000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'xxd', 'name'=>'Xúc xích Đức', 'price'=>24000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'mc', 'name'=>'Mì cay', 'price'=>40000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'kb', 'name'=>'Kimbap', 'price'=>35000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'bwy', 'name'=>'Bò Wagyu', 'price'=>1250000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'bn', 'name'=>'Bào Ngư', 'price'=>400000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'vc', 'name'=>'Vi Cá', 'price'=>35000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'gtx', 'name'=>'Đùi gà Texas', 'price'=>128000, 'description'=>'', 'id_category'=>'ta'),
            array('id'=>'kc', 'name'=>'King Crab', 'price'=>2800000, 'description'=>'', 'id_category'=>'ta')
        ]);
    }
}
class BillDetailTableSeeder extends Seeder
{
    public function run()
    {
        DB::table('bill_details')->insert([
            array('id_bill'=>'1', 'id_product'=>'cm', 'quantity'=>1, 'price'=>19000, 'discount'=>0),    
            array('id_bill'=>'1', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'1', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'1', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'1', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'1', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'1', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'2', 'id_product'=>'cm', 'quantity'=>1, 'price'=>19000, 'discount'=>0),    
            array('id_bill'=>'2', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'2', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'2', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'2', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'2', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'2', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'2', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'2', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'2', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'2', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'3', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'3', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'3', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'3', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'3', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'3', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'3', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'3', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'3', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'3', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'4', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'4', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'4', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'4', 'id_product'=>'stx', 'quantity'=>2, 'price'=>22000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'aqfn', 'quantity'=>3, 'price'=>10000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'gtx', 'quantity'=>2, 'price'=>128000, 'discount'=>0), 
            array('id_bill'=>'4', 'id_product'=>'kvn', 'quantity'=>1, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'5', 'id_product'=>'cm', 'quantity'=>1, 'price'=>19000, 'discount'=>0),    
            array('id_bill'=>'5', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'5', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'5', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'5', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'5', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'5', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'6', 'id_product'=>'cm', 'quantity'=>1, 'price'=>19000, 'discount'=>0),    
            array('id_bill'=>'6', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'6', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'6', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'6', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'6', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'6', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'6', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'6', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'6', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'6', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'7', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'7', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'7', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'7', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'7', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'7', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'7', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'7', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'7', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'7', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'8', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'8', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'8', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'8', 'id_product'=>'stx', 'quantity'=>2, 'price'=>22000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'aqfn', 'quantity'=>3, 'price'=>10000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'gtx', 'quantity'=>2, 'price'=>128000, 'discount'=>0), 
            array('id_bill'=>'8', 'id_product'=>'kvn', 'quantity'=>1, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'9', 'id_product'=>'cm', 'quantity'=>1, 'price'=>19000, 'discount'=>0),    
            array('id_bill'=>'9', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'9', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'9', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'9', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'9', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'9', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'10', 'id_product'=>'cm', 'quantity'=>1, 'price'=>19000, 'discount'=>0),    
            array('id_bill'=>'10', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'10', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'10', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'10', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'10', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'10', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'10', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'10', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'10', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'10', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'11', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'11', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'11', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'11', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'11', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'11', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'11', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'11', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'11', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'11', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'12', 'id_product'=>'necr', 'quantity'=>3, 'price'=>24000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'btg', 'quantity'=>2, 'price'=>15000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'cvc', 'quantity'=>4, 'price'=>15000, 'discount'=>0),
            array('id_bill'=>'12', 'id_product'=>'stb', 'quantity'=>2, 'price'=>30000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'tscrm', 'quantity'=>1, 'price'=>19000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'kb', 'quantity'=>2, 'price'=>35000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'tsn', 'quantity'=>1, 'price'=>23000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'tskw', 'quantity'=>1, 'price'=>21000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'tshn', 'quantity'=>1, 'price'=>19000, 'discount'=>0),
            array('id_bill'=>'12', 'id_product'=>'kscl', 'quantity'=>1, 'price'=>35000, 'discount'=>0),
            array('id_bill'=>'12', 'id_product'=>'stx', 'quantity'=>2, 'price'=>22000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'aqfn', 'quantity'=>3, 'price'=>10000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'gtx', 'quantity'=>2, 'price'=>128000, 'discount'=>0), 
            array('id_bill'=>'12', 'id_product'=>'kvn', 'quantity'=>1, 'price'=>30000, 'discount'=>0), 
        ]);
    }
}