<%-- 
    Document   : login
    Created on : Sep 23, 2018, 10:29:10 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng ký</title>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var x_timer;
                $("#username").keyup(function (e) {
                    clearTimeout(x_timer);
                    var user_name = $(this).val();
                    x_timer = setTimeout(function () {
                        check_username_ajax(user_name);
                    }, 1000);
                });

                function check_username_ajax(username) {
                    $("#user-result").html('<img src="img/ajax-loader.gif" />');
                    $.post('CheckUsersServlet', {'username': username}, function (data) {
                        $("#user-result").html(data);
                    });
                }
            });

            function dangky() {
                var input = document.getElementsByTagName("input");
                for (var i = 1; i < input.length; i++) {
                    if (input[i].value === "") {
                        alert("Bạn chưa nhập đủ thông tin");
                        return;
                    }
                }
                var quyen = document.getElementsByTagName("select")[0].value;
                var thamso = "username=" + input[1].value + "&password=" + input[2].value + "&quyen=" + quyen;
                var xmlhttp = new XMLHttpRequest();
                xmlhttp.open("get", "./jsp/dangky.jsp?" + thamso, false);
                xmlhttp.send();
                var thongbao = xmlhttp.responseText.trim();
                if (thongbao === "true") {
                    thongbao = "Đăng ký thành công. Vui lòng bổ sung thông tin";
                    setTimeout(function ChuyenTrang() {
                        window.location = "/SalaCoffee_2/nhapthongtin.jsp";
                    }, 3000);
                } else {
                    thongbao = "Đăng ký không thành công.";
                }
                document.getElementById("error").innerHTML = thongbao;
            }

        </script>
        <style>
            <%@include file="./css/login.css" %>
        </style>
    </head>
    <body>
        <jsp:include page="banner.jsp"></jsp:include>
        
        <div class="login">
            <div class="login1" >
                <p style="font-weight:bold; text-shadow: 0 0 3px white;">ĐĂNG KÝ</p>
                <p id="error" style="font-size: 15px; margin: 5px; font-style: italic; color: red;"></p>

                <div class="bt">

                    <p class="tk">Tài khoản:</p>
                    <input class="ip" id="username" type="text" name="user_name">
                    <div id="user-result" style="position: absolute; top: 35%; right: 23px;"></div>
                    <p class="mk">Mật khẩu:</p>
                    <input class="ip1" type="password" name="user_pass" id="password">

                    <p class="quyen">Quyền:</p>
                    <select class="ip2">
                        <option value="0">Nhân viên</option>;
                        <option value="1">Quản trị viên</option>;
                    </select>
                    <button class="dangnhap" style="font-size: 18px;
    position: absolute;
    left: 205px;
    background-color: red;" onclick="dangky()"> ĐĂNG KÝ </button>

                </div>  
                <hr>

                <div class="dangky">
                    <p>Đã có tài khoản? <a href="login.jsp">Đăng nhập</a></p>
                </div>
            </div>
        </div>
        <div id="footer">
            <p style="margin: 8px">Copyright&copy; 2018 SalaCoffee</p>
        </div>
    </body>
</html>
