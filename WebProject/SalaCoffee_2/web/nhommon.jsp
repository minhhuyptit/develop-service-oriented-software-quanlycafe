<%-- 
    Document   : nhommon
    Created on : Oct 10, 2018, 3:50:32 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>           
            <%@include file="./css/kho.css" %>
        </style>
        <script>
            var xmlhttp = new XMLHttpRequest();
            function getlistdanhmuc(){
                xmlhttp.open("get","./jsp/getlistdanhmuc.jsp?command=getdanhmuc", false);
                xmlhttp.send();
                var table = xmlhttp.responseText.trim();
                document.getElementById("listdanhmuc").innerHTML = table;
            }
            
            function sua(id) {
                document.getElementById("hien" + id).style.display = "none";
                document.getElementById("an" + id).style.display = "table-cell";

                document.getElementById("anid" + id).style.display = "table-cell";
                document.getElementById("anten" + id).style.display = "table-cell";

                document.getElementById("hienid" + id).style.display = "none";
                document.getElementById("hienten" + id).style.display = "none";
            }
            function thoat(id) {
                document.getElementById("hien" + id).style.display = "table-cell";
                document.getElementById("an" + id).style.display = "none";

                document.getElementById("anid" + id).style.display = "none";
                document.getElementById("anten" + id).style.display = "none";

                document.getElementById("hienid" + id).style.display = "table-cell";
                document.getElementById("hienten" + id).style.display = "table-cell";
            }
            
            function them(){
                var a = document.getElementById("themid").value;
                var b = document.getElementById("themten").value;
                xmlhttp.open("get", "./jsp/getlistdanhmuc.jsp?command=them&id=" + a + "&ten=" + b, false);
                xmlhttp.send();
                getlistdanhmuc();
            }
            
            function dongy(id) {
                var a = document.getElementById("id" + id).value;
                var b = document.getElementById("ten" + id).value;

                xmlhttp.open("get", "./jsp/getlistdanhmuc.jsp?command=dongy&id=" + id + "&newid=" + a + "&ten=" + b, false);
                xmlhttp.send();
                getlistdanhmuc();
            }
            
            function xoa(iddanhmuc) {
                xmlhttp.open("get", "./jsp/getlistdanhmuc.jsp?command=xoa&xoa=" + iddanhmuc, false);
                xmlhttp.send();
                getlistdanhmuc();
            }
        </script>
    </head>
    <body onload="getlistdanhmuc()">
        <jsp:include page="banner.jsp"></jsp:include>

        <div class="nhommon">
            <p class="title">DANH MỤC NHÓM MÓN</p>
            <br>
            <div id="listdanhmuc">
                
            </div>
        </div>
    </body>
</html>
