<%-- 
    Document   : nhapthongtin
    Created on : Oct 16, 2018, 4:54:35 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            <%@include file="./css/thongtin.css" %>
        </style>

        <script>
            xmlhttp = new XMLHttpRequest();
            function Submit() {
                var input = document.getElementsByTagName("input");

                for (var i = 0; i < input.length; i++) {
                    if (input[i].value === "") {
                        alert("Bạn chưa nhập đủ thông tin");
                        return;
                    }
                }
                var thamso = "";
                for (var i = 0; i < input.length; i++)
                    thamso += "&" + i + "=" + input[i].value;
                xmlhttp.open("get", "./jsp/nhapthongtin.jsp?command=nhapthongtin" + thamso, false);
                xmlhttp.send();
                var thongbao = xmlhttp.responseText.trim();
                alert(thongbao);
                if (thongbao !== "Tên không hợp lệ") {
                    setTimeout(function ChuyenTrang() {
                        window.location = "/SalaCoffee_2/hoadon.jsp";
                    }, 2000);
                }

            }

        </script>
    </head>
    <body>
        <div class="quyen">
            <h2>THÔNG TIN TÀI KHOẢN</h2>
        </div>
        <div class="form">
            <div class="form1">
                Họ Tên
                <input type="text" name="ten">
                <br>
                <br> Địa chỉ
                <input type="text" name="diachi">
                <br>
                <br> Ngày sinh
                <input class="date" type="date" name="ngaysinh">
                <br>
                <br> Điện thoại
                <input class="sdt" type="text" name="sdt">
                <br>
                <br> Mức lương
                <input class="luong" type="number" name="luong">
                <br>
                <br>
                <button onclick="Submit()">Đồng ý</button>
            </div>
        </div>
    </body>
</html>
