<%-- 
    Document   : nhapthongtin
    Created on : Oct 16, 2018, 4:54:35 PM
    Author     : Admin
--%>

<%@page import="model.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            <%@include file="./css/thongtinuser.css" %>
        </style>

        <script>
            function sua() {
                document.getElementById("dongy").style.display = "inline";
                document.getElementById("thoat").style.display = "inline";
                document.getElementById("sua").style.display = "none";
            }
            function thoat() {
                document.getElementById("dongy").style.display = "none";
                document.getElementById("thoat").style.display = "none";
                document.getElementById("sua").style.display = "inline";
            }
            function thongtinnhanvien(iduser){
                xmlhttp.open("get", "./jsp/nhapthongtin.jsp?command=thongtinnhanvien&iduser="+iduser, false);
                xmlhttp.send();
                var thongtin = xmlhttp.responseText.trim();
                document.getElementById("form").innerHTML = thongtin;
            }
        </script>
    </head>
    <body>
        <jsp:include page="banner.jsp"></jsp:include>
        <%
            User user =(User) session.getAttribute("user");
            String name = (String) session.getAttribute("name");
//            ThongTinUser ttu = UsersDAO.getThongTinUser(user.getUserID());
            //ArrayList<ThongTinUser> listttu = UsersDAO.listThongTinUser();
        %>
        <div class="quyen">
            <h2>THÔNG TIN TÀI KHOẢN</h2>
        </div>
        <div id="avata" class="avata">

        </div>
        <div class="form" id="form">
            <table>
                <tr>
                    <td style="width: 107px;">Họ tên</td>
                    <td><%=user.getFullname()%></td>
                </tr>
                <tr>
                    <td>Mức lương</td>
                    <td><%=user.getSalary()%></td>
                </tr>
                <tr>
                    <td>Số điện thoại</td>
                    <td><%=user.getPhone()%></td>
                </tr>

                <tr>
                    <td>Tên User</td>
                    <td><%=user.getUsername()%></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>********</td>
                </tr>
            </table>
            <button id="sua"  onclick="sua()">Sửa</button>
            <button id="dongy" onclick="dongy()" style="left: 90px; display: none;">Đồng ý</button>
            <button id="thoat" onclick="thoat()" style="left: 134px; display: none;">Thoát</button>
        </div>

    </body>
</html>
