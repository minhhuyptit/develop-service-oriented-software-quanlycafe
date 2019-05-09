<%-- 
    Document   : hoadon
    Created on : Sep 29, 2018, 2:10:09 PM
    Author     : Admin
--%>

<%@page import="java.util.Map"%>
<%@page import="dao.CartDAO"%>
<%@page import="model.Cart"%>
<%@page import="dao.TableDAO"%>
<%@page import="model.Area"%>
<%@page import="dao.AreaDAO"%>
<%@page import="dao.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.CategoryDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HoaDon</title>
        <style>
            <%@include file="./css/main.css" %>
        </style>
        <script>
            xmlhttp = new XMLHttpRequest();
            function listkhuvuc() {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=getlistkhuvuc", false);
                xmlhttp.send();
                var listkhuvuc = xmlhttp.responseText.trim();
                document.getElementById("listkhuvuc").innerHTML = listkhuvuc;
            }
            function listban(idkv) {
                xoacart();
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=getlistban&idkhuvuc=" + idkv, false);
                xmlhttp.send();
                var listkhuvuc = xmlhttp.responseText.trim();
                document.getElementById("listban").innerHTML = listkhuvuc;
            }
            function xoacart() {
                document.getElementById("listdanhmuc").innerHTML = "";
                document.getElementById("cart").innerHTML = "";
                document.getElementById("sanpham").innerHTML = "";
                document.getElementById("thanhtoan").innerHTML = "";
            }
            function listdanhmuc() {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=getlistdanhmuc", false);
                xmlhttp.send();
                var listdanhmuc = xmlhttp.responseText.trim();
                document.getElementById("listdanhmuc").innerHTML = listdanhmuc;
            }
            function listsanpham(iddanhmuc) {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=getlistsanpham&iddanhmuc=" + iddanhmuc, false);
                xmlhttp.send();
                var buttonsanpham = xmlhttp.responseText.trim();
                document.getElementById("sanpham").innerHTML = buttonsanpham;
            }
            function thanhtoan() {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=thanhtoan", false);
                xmlhttp.send();
                var thanhtoan1 = xmlhttp.responseText.trim();
                document.getElementById("thanhtoan").innerHTML = thanhtoan1;
            }
            function luucart() {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=savecart", false);
                xmlhttp.send();
                var idkv = xmlhttp.responseText.trim();
                listban(idkv);  //load lai danh sach ban xem co doi trang thai ko
                alert("Lưu thành công");
            }
            function plussanpham(idsanpham) {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=plussanpham&idsanpham=" + idsanpham, false);
                xmlhttp.send();
                xuatcart();
                thanhtoan();
            }
            function paycart() {
                openInNewTab('inhoadon.jsp');
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=paycart", false);
                xmlhttp.send();
                var idkv = xmlhttp.responseText.trim();
                if(idkv==="Bàn đang trống"){
                    alert(idkv);
                    return;
                } 
                res = idkv.split("&");
                //alert("Tổng chi phí: " + res[1]);
                listban(res[0]);  //load lai danh sach ban xem co doi trang thai ko
                xoacart();
            }
            function xuatcart() {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=xuatcart", false);
                xmlhttp.send();
                var cart1 = xmlhttp.responseText.trim();
                document.getElementById("cart").innerHTML = cart1;
            }
            function subsanpham(idsanpham) {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=subsanpham&idsanpham=" + idsanpham, false);
                xmlhttp.send();
                xuatcart();
                thanhtoan();
            }
            function cart(idban) {
                xoacart();
                listdanhmuc();
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=getcart&idban=" + idban, false);
                xmlhttp.send();
                var cart1 = xmlhttp.responseText.trim();    //phai dat khac ten ham
                thanhtoan();
                document.getElementById("cart").innerHTML = cart1;
            }

            function sua(id) {

                document.getElementById("hienck" + id).style.display = "none";
                document.getElementById("anck" + id).style.display = "table-cell";


                document.getElementById("s" + id).style.display = "none";
                document.getElementById("x" + id).style.display = "none";
                document.getElementById("d" + id).style.display = "inline";
                document.getElementById("t" + id).style.display = "inline";

            }

            function thoat(id) {
                document.getElementById("hienck" + id).style.display = "table-cell";
                document.getElementById("anck" + id).style.display = "none";

                document.getElementById("s" + id).style.display = "inline";
                document.getElementById("x" + id).style.display = "inline";
                document.getElementById("d" + id).style.display = "none";
                document.getElementById("t" + id).style.display = "none";
            }

            function dongy(id) {
                var a = document.getElementById("ck" + id).value;
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=themchietkhau&idsanpham=" + id + "&ck=" + a, false);
                xmlhttp.send();
                var tb = xmlhttp.responseText.trim();
                if (tb !== "")
                    alert(tb);
                xuatcart();
                thanhtoan();
            }
            function openInNewTab(url) {
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=inhoadon", false);
                xmlhttp.send();
                var win = window.open(url, '_blank');
                win.focus();
            }
            function inhoadon(){
                xmlhttp.open("get", "./jsp/hoadon.jsp?command=inhoadon", false);
                xmlhttp.send();
                var idkv = xmlhttp.responseText.trim();
                if(idkv==="Bàn đang trống"){
                    alert(idkv);
                    return;
                }                
                openInNewTab('inhoadon.jsp');
            }
        </script>
    </head>
    <body onload="listkhuvuc()">
        <jsp:include page="banner.jsp"></jsp:include>
        <div class="content">
            <p id="error"></p>
            <div class="hd">
                <div class="dsban">
                    <div class="listl" id="listkhuvuc"></div>
                    <div class="listr" id="listban"></div>
                </div>

                <div class="list">
                    <div class="listl" id="cart"></div>
                </div>  

                <div class="listr">
                    <div class="mon">
                        <div class="danhmuc" id="listdanhmuc"></div>
                    </div>
                    <div class="danhmuc" id="sanpham" style="clear: both; "></div>
                    <div class="thanhtoan" id="thanhtoan"></div>
                </div>
            </div>
        </div>
    </body>
</html>
