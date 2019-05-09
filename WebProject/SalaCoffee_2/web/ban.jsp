<%-- 
    Document   : ban
    Created on : Oct 10, 2018, 3:39:02 PM
    Author     : Admin
--%>

<%@page import="dao.TableDAO"%>
<%@page import="dao.AreaDAO"%>
<%@page import="model.Area"%>
<%@page import="java.util.ArrayList"%>
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
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script type="text/javascript">
            var xmlhttp = new XMLHttpRequest();
            function listKhuVuc() {
                xmlhttp.open("get", "./jsp/getlistban.jsp?command=getkhuvuc", false);
                xmlhttp.send();
                var listkv = xmlhttp.responseText.trim();
                document.getElementById("listkhuvuc").innerHTML = listkv;
            }
            function listBan(id) {
                xmlhttp.open("get", "./jsp/getlistban.jsp?command=getban&idkv=" + id, false);
                xmlhttp.send();
                var listban = xmlhttp.responseText.trim();
                document.getElementById("listban").innerHTML = listban;
            }
            $(document).ready(function () {
                listKhuVuc();
                var value = $('select[name=selecter]').val();
                listBan(value);
                $("#listkhuvuc").change(function () {
                    var value = $('select[name=selecter]').val();
                    listBan(value);
                });
            });

            function xoa(idban) {
                xmlhttp.open("get", "./jsp/getlistban.jsp?command=xoa&xoa=" + idban, false);
                xmlhttp.send();
                var value = $('select[name=selecter]').val();
                listBan(value);
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

            function dongy(id) {
                var a = document.getElementById("id" + id).value;
                var b = document.getElementById("ten" + id).value;

                xmlhttp.open("get", "./jsp/getlistban.jsp?command=dongy&id=" + id + "&newid=" + a + "&ten=" + b, false);
                xmlhttp.send();
                var value = $('select[name=selecter]').val();
                listBan(value);
            }
            
            function them(idkhuvuc){
                var a = document.getElementById("themid").value;
                var b = document.getElementById("themten").value;
                xmlhttp.open("get", "./jsp/getlistban.jsp?command=them&idkhuvuc=" + idkhuvuc + "&id=" + a + "&ten=" + b, false);
                xmlhttp.send();
                var value = $('select[name=selecter]').val();
                listBan(value);
            }
        </script>
    </head>
    <body>
        <jsp:include page="banner.jsp"></jsp:include>

        <div class="ban">
            <p class="title">DANH MỤC BÀN</p>
            <div class="option">
                <div class="chon">
                    <p style="font-weight: bold">KHU VỰC</p>
                    <select name="selecter" id="listkhuvuc">

                    </select>

                </div>
                <div id="listban">

                </div>
            </div>
        </div>
    </body>
</html>
