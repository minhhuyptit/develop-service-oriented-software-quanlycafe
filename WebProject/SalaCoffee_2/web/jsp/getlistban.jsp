<%@page import="model.Table"%>
<%@page import="dao.TableDAO"%>
<%@page import="dao.AreaDAO"%>
<%@page import="model.Area"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//    Users user = (Users) session.getAttribute("user");
//        if (user == null) {
//            out.println("Bạn chưa đăng nhập!");
//            return;
//        }
    String command = request.getParameter("command");
    String idkhu = request.getParameter("idkv");
    switch (command) {
        case "xoa":
            int idx = Integer.parseInt(request.getParameter("xoa"));
            TableDAO.deleteBan(idx);
            break;
        case "dongy":
            int idban = Integer.parseInt(request.getParameter("id"));
//            int a = Integer.parseInt(request.getParameter("newid"));
            String b = request.getParameter("ten");
            TableDAO.updateBan(idban, b);
            break;
        case "them":
            int idkhuvuc = Integer.parseInt(request.getParameter("idkhuvuc"));
            //int themid = Integer.parseInt(request.getParameter("id"));
            String themten = request.getParameter("ten");
            TableDAO.addBan(idkhuvuc, themten,10);
            break;
        case "getkhuvuc":
            ArrayList<Area> listkhuvuc = null;
            if (session.getAttribute("listkhuvuc") == null) {
                listkhuvuc = new AreaDAO().listKhuVuc();
                session.setAttribute("listkhuvuc", listkhuvuc);
            } else {
                listkhuvuc = (ArrayList) session.getAttribute("listkhuvuc");
            }

            String listkv = "";
            for (Area khuvuc : listkhuvuc) {
                listkv += "<option value='"+khuvuc.getId()+"'>" + khuvuc.getName() + "</option>";
            }
            out.print(listkv);
            break;
        case "getban":
            int idkv = Integer.parseInt(request.getParameter("idkv"));
            TableDAO banDAO = new TableDAO();
            ArrayList<Table> list = banDAO.listBan(idkv);
           String xhtml = "<table><tr><th>MÃ BÀN</th><th>TÊN BÀN</th><th>GHI CHÚ</th></tr>";
            for (Table item : list) {
                int id=item.id;
                xhtml += "<tr>\n"
                        + "<td id='hienid" + id + "'>" + item.id + "</td>\n"
                        + "<td id='hienten" + id + "'>" + item.name + "</td>\n"
                        
                        + "<td id='anid" + id + "' style='display: none;'>"
                        + "<input type='text' style='width: 30px;' value='" + item.id + "' id='" + "id" + id + "'>"
                        + "</td>\n"
                        
                        + "<td id='anten" + id + "' style='display: none;'>"
                        + "<input type='text' style='width: 100px;' value='" + item.name + "' id='" + "ten" + id + "'>"
                        + "</td>\n"
                        
                        + "<td id='hien" + id + "'>\n"
                        + "<button onclick='sua(" + id + ")' id='s"+id+"'>Sửa</button>\n"
                        + "<button onclick='xoa(" + id + ")' id='x"+id+"'>Xóa</button>\n"
                        + "</td>\n"
                        
                        + "<td id='an" + id + "' style='display: none;'>\n"
                        + "<button onclick='dongy(" + id + ")' id='d"+id+"'>Đồng ý</button>\n"
                        + "<button onclick='thoat(" + id + ")' id='t"+id+"'>Thoát</button>\n"
                        + "</td>\n"
                        + "</tr>";
            }
            xhtml +=  " <tr>\n"
                    + "<td><input id='themid' type=\"text\"></td>\n"
                    + "<td><input id='themten' type=\"text\"></td>\n"
                    + "<td><button onclick='them(\"" + idkhu + "\")'>Thêm</button></td>\n"
                    + "\n"
                    + "                        </tr>\n"
                    + "                    </table>";
            out.print(xhtml);
            break;
    }

%>
