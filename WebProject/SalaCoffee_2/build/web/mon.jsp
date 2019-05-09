<%-- 
    Document   : mon
    Created on : Oct 10, 2018, 3:45:33 PM
    Author     : Admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            <%@include file="./css/mon.css" %>
        </style>
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script>
            var xmlhttp = new XMLHttpRequest();
            function ListDanhMuc() {
                xmlhttp.open("get", "./jsp/getlistmon.jsp?command=getdanhmuc", false);
                xmlhttp.send();
                var listdm = xmlhttp.responseText.trim();
                document.getElementById("listdanhmuc").innerHTML = listdm;
            }
            function ListMon(id) {
                xmlhttp.open("get", "./jsp/getlistmon.jsp?command=getlist&id_area=" + id, false);
                xmlhttp.send();
                var table = xmlhttp.responseText.trim();
                document.getElementById("listsanpham").innerHTML = table;
            }

            $(document).ready(function () {
                ListDanhMuc();
                var value = $('select[name=selecter]').val();
                ListMon(value);
                $("#listdanhmuc").change(function () {
                    var value = $('select[name=selecter]').val();
                    ListMon(value);
                });
            });

            function xoa(idkhuvuc) {
                xmlhttp.open("get", "./jsp/getlistmon.jsp?command=xoa&xoa=" + idkhuvuc, false);
                xmlhttp.send();
                var value = $('select[id=listdanhmuc]').val();
                ListMon(value);
            }

            function sua(id) {
                document.getElementById("hien" + id).style.display = "none";
                document.getElementById("an" + id).style.display = "table-cell";

                document.getElementById("anid" + id).style.display = "table-cell";
                document.getElementById("anten" + id).style.display = "table-cell";
                document.getElementById("angia" + id).style.display = "table-cell";
                document.getElementById("anghichu" + id).style.display = "table-cell";
                document.getElementById("hienid" + id).style.display = "none";
                document.getElementById("hienten" + id).style.display = "none";
                document.getElementById("hiengia" + id).style.display = "none";
                document.getElementById("hienghichu" + id).style.display = "none";
            }
            function thoat(id) {
                document.getElementById("hien" + id).style.display = "table-cell";
                document.getElementById("an" + id).style.display = "none";

                document.getElementById("anid" + id).style.display = "none";
                document.getElementById("anten" + id).style.display = "none";
                document.getElementById("angia" + id).style.display = "none";
                document.getElementById("anghichu" + id).style.display = "none";
                document.getElementById("hienid" + id).style.display = "table-cell";
                document.getElementById("hienten" + id).style.display = "table-cell";
                document.getElementById("hiengia" + id).style.display = "table-cell";
                document.getElementById("hienghichu" + id).style.display = "table-cell";
            }
            function dongy(id) {
                var a = document.getElementById("id" + id).value;
                var b = document.getElementById("ten" + id).value;
                var c = document.getElementById("gia" + id).value;
                var d = document.getElementById("ghichu" + id).value;
                xmlhttp.open("get", "./jsp/getlistmon.jsp?command=dongy&id=" + id + "&newid=" + a + "&ten=" + b + "&gia=" + c + "&ghichu=" + d, false);
                xmlhttp.send();
                var value = $('select[id=listdanhmuc]').val();
                ListMon(value);
            }
            
            function them(danhmuc){
                var a = document.getElementById("themid").value;
                var b = document.getElementById("themten").value;
                var c = document.getElementById("themgia").value;
                var d = document.getElementById("themghichu").value;
                xmlhttp.open("get", "./jsp/getlistmon.jsp?command=them&danhmuc=" + danhmuc + "&id=" + a + "&ten=" + b + "&gia=" + c + "&ghichu=" + d, false);
                xmlhttp.send();
                var value = $('select[id=listdanhmuc]').val();
                ListMon(value);
            }
        </script>
    </head>
    <body>
        <jsp:include page="banner.jsp"></jsp:include>

        <div class="mon">
            <p class="title">DANH MỤC MÓN</p>
            <div class="option">
                <div class="chon">
                    <p style="font-weight: bold">NHÓM MÓN</p>
                    <select name="selecter" id="listdanhmuc">

                    </select>
                </div>

                <div id="listsanpham">

                </div>

            </div>
        </div>

    </body>
</html>
