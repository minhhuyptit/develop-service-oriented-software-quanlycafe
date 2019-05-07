*Khởi chạy Laravel(Service)
	Bước 1: Cài đặt server ảo Wamp or Xampp (recommended PHP >= 7. port 7777)
	Bước 2: Cài đặt Composer (Đọc file báo cáo)
	Bước 3: Cài đặt Mysql (recommended 10.1.37-MariaDB port 3306)
	Bước 4: Tạo database đặt tên quanlycafe
	Bước 5: Đặt thư mục quanlycafe vào host để chạy www(WampServer) or htdoc(Xampp)
	Bước 6: Di chuyển vào folder quanlycafe, mở powershell or cmd or git bash
	Bước 7: Dùng composer chạy "php artisan migrate" sau đó chạy tiếp "php artisan db:seed" 
	để chạy cấu trúc và dữ liệu mẫu. (Nếu không dùng migrate chỉ cần import file quanlycafe.sql)
	Bước 8: Vào browser chạy thử localhost:7777/quanlycafe/public/api/area (Danh sách các API có trong file báo cáo)



	