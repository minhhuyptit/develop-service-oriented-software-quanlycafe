
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.Product"%>
<%@page import="model.Category"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//    Users user = (Users) session.getAttribute("user");
//        if (user == null) {
//            out.println("Bạn chưa đăng nhập!");
//            return;
//        }
    session = request.getSession();//cai nay de lam gi 
    String command = request.getParameter("command");
    String id_area = request.getParameter("id_area");

    switch (command) {
        case "getdanhmuc":
            ArrayList<Category> listDanhMuc;
            listDanhMuc = CategoryDAO.listDanhMuc();
            String listdm = "";
            //session.setAttribute("id_area",listDanhMuc.get(0).getIdDanhMuc());
            for (Category danhmuc : listDanhMuc) {
                listdm += "<option value='" + danhmuc.getId() + "'>" + danhmuc.getName() + "</option>";
            }
            out.print(listdm);
            break;
        case "xoa":
            String idx = request.getParameter("xoa");
            ProductDAO.deleteSanPham(idx);
            session.removeAttribute("listsanpham");
            break;
        case "them":
            String iddanhmuc = request.getParameter("danhmuc");
            String themid = request.getParameter("id");
            String themten = request.getParameter("ten");
            Double themgia = Double.parseDouble(request.getParameter("gia"));
            String themghichu = request.getParameter("ghichu");
            ProductDAO.addSanPham(themid, iddanhmuc, themten, themgia, themghichu);
            session.removeAttribute("listsanpham");
            break;
        case "dongy":
            String idmon = request.getParameter("id");
            String b = request.getParameter("ten");
            Double c = Double.parseDouble(request.getParameter("gia"));
            String d = request.getParameter("ghichu");
            ProductDAO.updateSanPham(idmon, b, c, d);
            session.removeAttribute("listsanpham");
            break;
        case "getlist":
            ArrayList<Product> listsanpham;
//            if (session.getAttribute("listsanpham") != null) {
//                listsanpham = (ArrayList<SanPham1>) session.getAttribute("listsanpham");
//            } else {
                listsanpham = new ProductDAO().listSanPham(id_area);
//            }

            String table = "<table class='remove'><tr><th>MÃ MÓN</th> <th>TÊN MÓN</th><th>GIÁ BÁN</th><th>GHI CHÚ</th><th>CHỨC NĂNG</th></tr>";

            Locale locale = new Locale("vi", "VN");
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
            for (Product sanpham : listsanpham) {
                String id = sanpham.getId();
                table += " <tr id='" + id + "'>\n"
                        + "<td id='hienid" + id + "'>" + sanpham.getId() + "</td>\n"
                        + "<td id='hienten" + id + "'>" + sanpham.getName() + "</td>\n"
                        + "<td id='hiengia" + id + "' style=\"text-align: right;\">" + numberFormat.format(sanpham.getPrice()) + "</td>\n"
                        + "<td id='hienghichu" + id + "'>" + sanpham.getDescription() + "</td>\n"
                        
                        + "<td id='anid" + id + "' style='display: none;'>"
                        + "<input type='text' style='width: 100px;' value='" + sanpham.getId() + "' id='" + "id" + id + "'>"
                        + "</td>\n"
                        
                        + "<td id='anten" + id + "' style='display: none;'>"
                        + "<input type='text' style='width: 100px;' value='" + sanpham.getName() + "' id='" + "ten" + id + "'>"
                        + "</td>\n"
                        
                        + "<td id='angia" + id + "' style='display: none;'>"
                        + "<input type='text' style='width: 100px;' value='" + numberFormat.format(sanpham.getPrice())  + "' id='" + "gia" + id + "'>"
                        + "</td>\n"
                        
                        + "<td id='anghichu" + id + "' style='display: none;'>"
                        + "<input type='text' style='width: 100px;' value='" + sanpham.getDescription() + "' id='" + "ghichu" + id + "'>"
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
                    + "                            <td><input id='themid' type=\"text\"></td>\n"
                    + "                            <td><input id='themten' type=\"text\"></td>\n"
                    + "                            <td><input id='themgia' type=\"text\"></td>\n"
                    + "                            <td><input id='themghichu' type=\"text\"></td>\n"
                    + "                            <td><button onclick='them(\"" + id_area + "\")'>Thêm</button></td>\n"
                    + "\n"
                    + "                        </tr>\n"
                    + "                    </table>";
            out.print(table);
            break;
    }
%>