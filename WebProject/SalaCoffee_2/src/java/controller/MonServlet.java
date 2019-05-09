/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Product;

/**
 *
 * @author Admin
 */
public class MonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session;
        session = request.getSession();//cai nay de lam gi 
        String command = request.getParameter("command");
        String id_area = request.getParameter("id_area");

        switch (command) {
            case "xoa":
                String idx = request.getParameter("xoa");
                ProductDAO.deleteSanPham(idx);
                break;
            case "getlist":
                ArrayList<Product> listsanpham;
                if (session.getAttribute("listsanpham") != null) {
                    listsanpham = (ArrayList<Product>) session.getAttribute("listsanpham");
                } else {
                    listsanpham = new ProductDAO().listSanPham(id_area);
                }

                String table = "<table class='remove'><tr><th>Mã món</th> <th>Tên món</th><th>Đơn vị</th><th>Giá bán</th><th>Ghi chú</th></tr>";

                for (Product sanpham : listsanpham) {
                    String id = sanpham.getId();
                    table += " <tr id='"+id+"'>\n"
                            + "<td id='hienid" + id + "'>" + sanpham.getId()+ "</td>\n"
                            + "<td id='hienten" + id + "'>" + sanpham.getName()+ "</td>\n"
                            + "<td id='hiengia" + id + "'>" + sanpham.getPrice()+ "</td>\n"
                            + "<td id='hienghichu" + id + "'>" + sanpham.getDescription()+ "</td>\n"
                            
                            + "<td id='anid" + id + "' style='display: none;'>" 
                                + "<input type='text' style='width: 30px;' value='"+sanpham.getId()+"' id='"+"id"+id+"'>"
                            + "</td>\n"
                            + "<td id='anten" + id + "' style='display: none;'>" 
                                + "<input type='text' style='width: 30px;' value='"+sanpham.getName()+"' id='"+"ten"+id+"'>"
                            + "</td>\n"
                            + "<td id='angia" + id + "' style='display: none;'>" 
                                + "<input type='text' style='width: 30px;' value='"+sanpham.getPrice()+"' id='"+"gia"+id+"'>"
                            + "</td>\n"
                            + "<td id='anghichu" + id + "' style='display: none;'>" 
                                + "<input type='text' style='width: 30px;' value='"+sanpham.getDescription()+"' id='"+"ghichu"+id+"'>"
                            + "</td>\n"
                            
                            + "<td id='hien" + id + "'>\n"
                            + "<button onclick='sua(\"" + id + "\")' id='s" + id + "' >Sửa</button>\n"
                            + "<button onclick='xoa(\"" + id + "\")' id='x" + id + "'>Xóa</button>\n"
                            + "</td>\n"
                            + "<td id='an" + id + "' style='display: none;'>\n"
                            + "<button onclick='dongy(\"" + id + "\")' id='d" + id + "' >Đồng ý</button>\n"
                            + "<button onclick='thoat(\"" + id + "\")' id='t" + id + "'>Thoát</button>\n"
                            + "</td>\n"
                            + "</tr>";
                }
                table += " <tr>\n"
                        + "                            <td><input type=\"text\"></td>\n"
                        + "                            <td><input type=\"text\"></td>\n"
                        + "                            <td><input type=\"text\"></td>\n"
                        + "                            <td><input type=\"text\"></td>\n"
                        + "                            <td><button>Thêm</button></td>\n"
                        + "\n"
                        + "                        </tr>\n"
                        + "                    </table>";
                response.getWriter().print(table);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
