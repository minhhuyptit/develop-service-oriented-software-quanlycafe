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
        <title>Đăng nhập</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz"
              crossorigin="anonymous">
        <style>
            <%@include file="./css/login.css" %>
        </style>
    </head>

    <body>
        <section class="container">
            <div class="header">
                <div class="img0">
                    <a href="home.html">
                        <img src="./img/salalogo.png" alt="">
                    </a>
                </div>
                <p>
                    <a href="gioithieu.html">GIỚI THIỆU</a>
                    <a href="./Blog/blog.html">BLOG</a>
                    <input type="text">
                    <i class="fas fa-search"></i>

                </p>
                <a href="login.jsp"><button>ĐĂNG NHẬP</button></a>

            </div>

        </section>

        <div class="login">
            <div class="login1" >
                <p style="font-weight:bold; text-shadow: 0 0 3px white;">ĐĂNG NHẬP</p>
                <%if(request.getAttribute("error")!=null){%>
                <p style="font-size: 15px; margin: 5px; font-style: italic; color: red;"><%=request.getAttribute("error")%></p>
                <%}%>

                <form action="login" method="POST" class="bt">
                    <p class="tk">Tài khoản:</p>
                    <input class="ip" type="text" name ="user_name" id="username">
                    <p class="mk">Mật khẩu:</p>
                    <input class="ip1" type="password" name="user_pass" id="password">
                    <input type="hidden" name="command" value="login">
                    <input type="submit" class="dangnhap" style="font-size: 18px;
                            position: absolute;
                            left: 205px;
                            background-color: red;" value = "ĐĂNG NHẬP">
                </form>
                    
            </div>
        </div>
        <div id="footer">
            <p style="margin: 8px">Copyright&copy; 2019 SalaCoffee</p>
        </div>
    </body>
</html>
