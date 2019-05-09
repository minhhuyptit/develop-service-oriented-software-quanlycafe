<%-- 
    Document   : khuvuc
    Created on : Oct 10, 2018, 3:32:21 PM
    Author     : Admin
--%>

<%@page import="dao.AreaDAO"%>
<%@page import="model.Area"%>
<%@page import="java.util.ArrayList"%>
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
            function ListKhuVuc() {
                xmlhttp.open("get", "./jsp/getlistkhuvuc.jsp?command=getlistkhuvuc", false);
                xmlhttp.send();
                var table = xmlhttp.responseText.trim();
                document.getElementById("listkv").innerHTML = table;
            }
            function xoa(idkhuvuc) {
                xmlhttp.open("get", "./jsp/getlistkhuvuc.jsp?command=xoa&idkhuvuc=" + idkhuvuc, false);
                xmlhttp.send();
                ListKhuVuc();
            }
            function sua(idkhuvuc) {

                document.getElementById("i" + idkhuvuc).style.display = "none";
                document.getElementById("t" + idkhuvuc).style.display = "none";
                document.getElementById("si" + idkhuvuc).style.display = "table-cell";
                document.getElementById("st" + idkhuvuc).style.display = "table-cell";


                document.getElementById("s" + idkhuvuc).style.display = "none";
                document.getElementById("x" + idkhuvuc).style.display = "none";
                document.getElementById("d" + idkhuvuc).style.display = "inline";
                document.getElementById("h" + idkhuvuc).style.display = "inline";

            }
            function dongy(idkhuvuc) {
                var name_area = document.getElementById("st1" + idkhuvuc).value;
                xmlhttp.open("get", "./jsp/getlistkhuvuc.jsp?command=dongy&idkhuvuc=" + idkhuvuc + "&stkv=" + name_area, false);
                xmlhttp.send();

                document.getElementById("i" + idkhuvuc).style.display = "table-cell";
                document.getElementById("t" + idkhuvuc).style.display = "table-cell";
                document.getElementById("si" + idkhuvuc).style.display = "none";
                document.getElementById("st" + idkhuvuc).style.display = "none";



                document.getElementById("s" + idkhuvuc).style.display = "inline";
                document.getElementById("x" + idkhuvuc).style.display = "inline";
                document.getElementById("d" + idkhuvuc).style.display = "none";
                document.getElementById("h" + idkhuvuc).style.display = "none";

                ListKhuVuc();
            }

            function them() {
                //var a = document.getElementById("themid").value;
                var b = document.getElementById("themkv").value;
                xmlhttp.open("get", "./jsp/getlistkhuvuc.jsp?command=them&tenkhu=" + b, false);
                xmlhttp.send();
                ListKhuVuc();
            }

            function huy(idkhuvuc) {
                document.getElementById("i" + idkhuvuc).style.display = "table-cell";
                document.getElementById("t" + idkhuvuc).style.display = "table-cell";
                document.getElementById("si" + idkhuvuc).style.display = "none";
                document.getElementById("st" + idkhuvuc).style.display = "none";


                document.getElementById("s" + idkhuvuc).style.display = "inline";
                document.getElementById("x" + idkhuvuc).style.display = "inline";
                document.getElementById("d" + idkhuvuc).style.display = "none";
                document.getElementById("h" + idkhuvuc).style.display = "none";
            }
        </script>
    </head>
    <body onload="ListKhuVuc()">

        <jsp:include page="banner.jsp"></jsp:include>

        <div class="khu vực">
            <p class="title">DANH MỤC KHU VỰC</p>
            <br>
            <br>
            <div id="tra">
                <div id="listkv"></div>

                <!--                <form id="listkv">
                
                                </form>-->
            </div>
        </div>
    </body>
</html>
