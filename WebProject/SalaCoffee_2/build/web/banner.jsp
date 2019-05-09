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
        <style>
            <%@include file="./css/banner.css"%>
        </style>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
        <script>
            xmlhttp = new XMLHttpRequest();
            function logout() {
                
            <%
//                session.removeAttribute("user");
//                session.removeAttribute("name");
            %>
                window.location = "/SalaCoffee_2/home.html";
            }
            function timkiem(){
                var idhoadon = document.getElementById("search").value;
                if(idhoadon===""){
                    alert("Bạn chưa nhập ID Hóa Đơn");
                    return;
                }
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=timkiemhoadon&idhoadon=" + idhoadon, false);
                xmlhttp.send();
                var idhoadon = xmlhttp.responseText.trim();
                if(idhoadon!==""){
                    alert("Hóa đơn không tồn tại");
                    return;
                }
                openInNewTab('hoadontimkiem.jsp');
            }
            
            function thongtinuser(){
                window.location = "/SalaCoffee_2/thongtinuser.jsp";
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
                    <a href="hoadon.jsp">hóa đơn</a>
                </li>

                <li>
                    <a href="doanhthu.jsp">doanh thu</a>
                </li>
                <li>
                    <a href="khuvuc.jsp">khu vực</a>
                </li>
                <li>
                    <a href="ban.jsp">bàn</a>
                </li>
                <li>
                    <a href="mon.jsp">món</a>
                </li>
                <li>
                    <a href="nhommon.jsp">nhóm món</a>
                </li>
            </ul>
            <div class="search">
                <input id="search" type="number" on>
                <i class="fas fa-search" style="margin-left: 10px; color: white;" onclick="timkiem()"></i>
            </div>

            <div class="dropdown">
                <button onclick="thongtinuser()" class="dropbtn"><i class="fas fa-user"> &nbsp; <%=session.getAttribute("name")%></i></button>
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
