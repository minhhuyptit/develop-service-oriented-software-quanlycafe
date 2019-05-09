<%-- 
    Document   : doanhthu
    Created on : Oct 10, 2018, 3:36:27 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            <%@include file="./css/doanhthu.css" %>
        </style>
        <script>
            xmlhttp = new XMLHttpRequest();
            function listnhanvien() {
                xmlhttp.open("get", "./jsp/doanhthu.jsp?command=getlistnhanvien", false);
                xmlhttp.send();
                var listnv = xmlhttp.responseText.trim();
                document.getElementById("danhsachnhanvien").innerHTML = listnv;
            }
            function thongkedoanhthu() {
                var inputday = document.getElementsByTagName("input");
                var start = inputday[1].value;
                start = start.split("-").join("");
                var end = inputday[2].value;
                end = end.split("-").join("");
                //alert(start + " " + end);
                
                if(start=="") {
                    alert("Bạn chưa chọn ngày bắt đầu");
                    return;
                }
                if(end=="") {
                    alert("Bạn chưa chọn ngày kết thúc");
                    return;
                }
                if(start >= end ) {
                    alert("Khoảng thời gian không hợp lệ");
                    return;
                }
                //var iduser = document.getElementsByTagName("select")[0].value;
                xmlhttp.open("get", "./jsp/doanhthu.jsp?command=thongke&start=" + start +"&end=" + end, false);
                xmlhttp.send();
                var thongke = xmlhttp.responseText.trim();
                if (thongke === "")
                    alert("Không có sản phẩm tìm thấy");
                document.getElementById("listdanhthu").innerHTML = thongke;
            }
        </script>
    </head>
<!--    <body onload="listnhanvien()">-->
    <body>
        <jsp:include page="banner.jsp"></jsp:include>
        <p class="title">DOANH THU</p>
        <div class="nhanvien">
            Từ ngày : <input type="date">
            <br>
            <br>
            Đến ngày : <input type="date">
            <br>
            <br>
<!--            Nhân viên :
            <select id="danhsachnhanvien">

            </select>
            <br>-->
            <br>
            <button onclick="thongkedoanhthu()">Lọc</button>
            <button>In</button>
            <br>
            <br>
        </div>
        <div class="bang" id="listdanhthu">

        </div>
    </body>
</html>
