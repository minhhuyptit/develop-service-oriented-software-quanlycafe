<%@page import="model.Category"%>
<%@page import="dao.CategoryDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//    Users user = (Users) session.getAttribute("user");
//        if (user == null) {
//            out.println("Bạn chưa đăng nhập!");
//            return;
//        }
    String command = request.getParameter("command");
    String idkhu = request.getParameter("idkhu");
    switch (command) {
        case "them":
            String themid = request.getParameter("id");
            String themten = request.getParameter("ten");
            CategoryDAO.addDanhMuc(themid, themten);
            break;
        case "dongy":
            String iddanhmuc = request.getParameter("id");
            String b = request.getParameter("ten");
            CategoryDAO.updateDanhMuc(iddanhmuc, b);
            break;
         case "xoa":
            String idx = request.getParameter("xoa");
            CategoryDAO.deleteDanhMuc(idx);
            break;
        case "getdanhmuc":
            ArrayList<Category> listdanhmuc = CategoryDAO.listDanhMuc();
            String table = "<table>\n"
                    + "                    <tr>\n"
                    + "                        <th>MÃ NHÓM MÓN</th>\n"
                    + "                        <th>TÊN NHÓM MÓN</th>\n"
                    + "                        <th>CHÚ THÍCH</th>\n"
                    + "                    </tr>";
            for (Category danhmuc : listdanhmuc) {
                String id = danhmuc.getId();
                table += "<tr>\n"
                        + "<td id='hienid" + id + "'>" + danhmuc.getId() + "</td>\n"
                        + "<td id='hienten" + id + "'>" + danhmuc.getName() + "</td>\n"
                        
                        + "<td id='anid" + id + "' style='display: none;'>"
                        + "<input type='text' style='width: 30px;' value='" + danhmuc.getId() + "' id='" + "id" + id + "'>"
                        + "</td>\n"
                        
                        + "<td id='anten" + id + "' style='display: none;'>"
                        + "<input type='text' style='width: 100px;' value='" + danhmuc.getName() + "' id='" + "ten" + id + "'>"
                        + "</td>\n"
                        
                        + "<td id='hien" + id + "'>\n"
                        + "<button onclick=\"sua('" + id + "')\" id='s" + id + "'>Sửa</button>\n"
                        + "<button onclick=\"xoa('" + id + "')\" id='x" + id + "'>Xóa</button>\n"
                        + "</td>\n"
                        
                        + "<td id='an" + id + "' style='display: none;'>\n"
                        + "<button onclick=\"dongy('" + id + "')\" id='d" + id + "'>Đồng ý</button>\n"
                        + "<button onclick=\"thoat('" + id + "')\" id='t" + id + "'>Thoát</button>\n"
                        + "</td>\n"
                        
                        + "</tr>";
            }
            table += " <tr>\n"
                    + "     <td><input id='themid' type=\"text\"></td>\n"
                    + "     <td><input id='themten' type=\"text\"></td>\n"
                    + "<td><button onclick='them()'>Thêm</button></td>\n"
                    + "</tr>\n"
                    + "</table>";
            out.print(table);
            break;
    }


%>