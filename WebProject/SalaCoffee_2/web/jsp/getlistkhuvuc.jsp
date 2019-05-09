<%@page import="model.User"%>
<%@page import="dao.AreaDAO"%>
<%@page import="model.Area"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    User user = (User) session.getAttribute("user");
        if (user == null) {
            out.println("Bạn chưa đăng nhập!");
            return;
        }
    
    String command = request.getParameter("command");
    int idkv = 0;
    if (request.getParameter("idkhuvuc") != null) {
        idkv = Integer.parseInt(request.getParameter("idkhuvuc"));
    }
    switch (command) {
        case "xoa":
            AreaDAO.deleteKhuVuc(idkv);
            session.removeAttribute("listkhuvuc");
            break;
        case "dongy":
            //int a = Integer.parseInt(request.getParameter("sid"));
            String b = request.getParameter("stkv");
            AreaDAO.updateKhuVuc(idkv, b);
            session.removeAttribute("listkhuvuc");
            break;
        case "them":
            //int aa = Integer.parseInt(request.getParameter("idthem"));
            String bb = request.getParameter("tenkhu");
            AreaDAO.addKhuVuc(bb);
            session.removeAttribute("listkhuvuc");
            break;
        case "getlistkhuvuc":
            ArrayList<Area> listkhuvuc = null;
            if (session.getAttribute("listkhuvuc") == null) {
                listkhuvuc = new AreaDAO().listKhuVuc();
                session.setAttribute("listkhuvuc", listkhuvuc);
            } else {
                listkhuvuc = (ArrayList) session.getAttribute("listkhuvuc");
            }

            String table = " <table>"
                    + "<tr><th>MÃ KHU VỰC</th><th>TÊN KHU VỰC</th><th>CHÚ THÍCH</th></tr>";
            for (Area khuvuc : listkhuvuc) {
                int id = khuvuc.getId();
                table += "<tr id=>"
                        + "<td id='" + "i" + khuvuc.getId() + "'>" + khuvuc.getId() + "</td>"
                        + "<td id='" + "t" + khuvuc.getId() + "'>" + khuvuc.getName() + "</td>"
                        + "<td class='xoasua' style='display: none;' id='" + "si" + id + "'>"
                        + "<input type='text' style='width: 30px;' value='" + khuvuc.getId() + "' id='" + "si1" + id + "'>"
                        + "</td>"
                        + "<td class='xoasua' style='display: none;' id='" + "st" + id + "'>"
                        + "<input type='text' style='width: 100px;' value='" + khuvuc.getName() + "' id='" + "st1" + id + "'>"
                        + "</td>"
                        + "<td>"
                        + "<button onclick='sua(" + id + ")' id='" + "s" + id + "'> Sửa</button>"
                        + "<button onclick='xoa(" + id + ")' id='" + "x" + id + "'> Xóa</button>"
                        + "<button style='display: none;' onclick='dongy(" + id + ")' id='" + "d" + id + "'>Đồng ý</button>"
                        + "<button style='display: none;' onclick='huy(" + id + ")' id='" + "h" + id + "'> Hủy</button>"
                        + "</td>"
                        + "</tr>";
            }
            table += " <tr>"
                    + "         <td><input id='themid' type='text'></td>"
                    + "        <td><input id='themkv' type='text'></td>"
                    + "   <td><button onclick='them()'>Thêm</button></td>"
                    + "     </tr>"
                    + "</table>";
            out.print(table);
            break;
    }

%>