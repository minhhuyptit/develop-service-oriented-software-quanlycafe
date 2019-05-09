<%-- 
    Document   : inhoadon
    Created on : Oct 16, 2018, 12:39:58 PM
    Author     : Admin
--%>

<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.Item"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="model.Stats"%>
<%@page import="java.util.Map"%>
<%@page import="model.Cart"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>In hóa đơn</title>
        <style>
            <%@include file="./css/inhoadon.css" %>
        </style>
    </head>
    <body>
        <%
            Cart cart = (Cart) session.getAttribute("cart");
            if (cart.getCartItem().isEmpty()) {
                return;
            }
            
            int idban = (int) session.getAttribute("idban");
            //HoaDon hoadon = HoaDonDAO.getHoaDon(HoaDonDAO.idHoaDon(idban));
            //java.util.Date now = new java.util.Date();
            //String usernamepay = (String) session.getAttribute("name");
        %>

        <div class="inhoadon">
            <h2>HÓA ĐƠN BÁN HÀNG</h2>
            <hr>
            <div class="hoadon">
                <table class="chitiethoadon">
                    <tr>
                        <th>Tên món</th>
                        <th>SL</th>
                        <th>Đơn giá</th>
                        <th>Chiết khấu</th>
                        <th>Tính tiền</th>
                    </tr>
                    <%
                        Locale localeVN = new Locale("vi", "VN");
                        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
                        for (Map.Entry<String, Item> listCart : cart.cartItem.entrySet()) {
                            String ten = listCart.getValue().getProduct().getName();
                            int soluong = listCart.getValue().getQuantity();
                            Double gia = listCart.getValue().getProduct().getPrice();
                            int chietkhau = listCart.getValue().getDiscount();
                            Double tong = soluong * gia - (soluong * gia * chietkhau) / 100;
                    %>
                    <tr>
                        <td><%=ten%></td>
                        <td class="sl"><%=soluong%></td>
                        <td class="gia"><%=currencyVN.format(gia)%></td>
                        <td class="ck"><%=chietkhau%></td>
                        <td class="tong"><%=currencyVN.format(tong)%></td>
                    </tr>
                    <%}%>
                </table>
                <hr>

                <table class="thanhtoan">
                    <tr >
                        <td>Thanh toán : </td>
                        <td><%=currencyVN.format(cart.sumTotal())%></td>
                    </tr>
                </table>
                <hr>
                <h3>CẢM ƠN QUÝ KHÁCH, HẸN GẶP LẠI QUÝ KHÁCH!</h3>
            </div>
        </div>

    </body>
</html>
