<%-- 
    Document   : banner
    Created on : Sep 25, 2018, 9:56:33 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
        <style>
            <%@include file="./css/banner.css"%>
        </style>
        <script>
            xmlhttp = new XMLHttpRequest();
            function logout() {
                alert("Thoat");
            <%
                request.removeAttribute("user");
                request.removeAttribute("name");
            %>
            window.location = "/SalaCoffee_2/login.jsp";
            }
            function timkiem(){
                var idhoadon = document.getElementById("search").value;
                if(idhoadon===""){
                    alert("Bạn chưa nhập ID Hóa Đơn");
                    return;
                }
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=timkiemhoadon&idhoadon=" + idhoadon, false);
                xmlhttp.send();
                openInNewTab('hoadontimkiem.jsp');
                
            }
            
        </script>
    </head>
    <body>
        <div class="header">
            <div id="logo">
                <a href="home.html">
                    <img src="./img/logo.png" alt="" style="width: 90px;">
                </a>
            </div>
            <ul class="menu">
                <a href="#"></a>
                <li>
                    <a href="hoadon_1.jsp">hóa đơn</a>
                </li>
            </ul>

            <div class="search" style="left: 306px;">
                <input id="search" type="number" on>
                <i class="fas fa-search" style="margin-left: 10px; color: white;" onclick="timkiem()"></i>
            </div>

            <div class="dropdown">
                <button class="dropbtn"><i class="fas fa-user"> &nbsp; <%=session.getAttribute("name")%></i></button>
                <div class="dropdown-content">
                    <a href="register.jsp">Tạo tài khoản</a>
                    <a onclick="logout()" style="cursor: pointer;">Thoát</a>
                </div>
            </div>

            <!-- <img src="./img/top.jpg" alt="" srcset="" style="width: 100%; height: 110px;">-->
            <div style="clear: both;"></div>
        </div>
    </body>
</html>
