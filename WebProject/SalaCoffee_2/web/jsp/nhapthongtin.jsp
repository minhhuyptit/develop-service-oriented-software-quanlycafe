<%--<%@page import="model.User"%>
<%@page import="dao.UserDAO"%>
<%@page import="java.sql.Date"%>
<%@page import="model.UserInfor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    User userkt = (User) session.getAttribute("user");
    if (userkt == null) {
        out.println("B?n ch?a ??ng nh?p!");
        return;
    }
    String command = request.getParameter("command");
    switch (command) {
        case "thongtinnhanvien":
            Long iduser = Long.parseLong(request.getParameter("iduser"));
            String table = "<table>\n"
                    + "                <tr>\n"
                    + "                    <td style=\"width: 107px;\">H? tên</td>\n"
                    + "                    <td>" + ttu.getHo() + " " + ttu.getTen() + "\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>??a ch?</td>\n"
                    + "                    <td>" + ttu.getDiaChi() + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>M?c l??ng</td>\n"
                    + "                    <td>" + ttu.getLuong() + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>S? ?i?n tho?i</td>\n"
                    + "                    <td>" + ttu.getSdt() + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>Ngày sinh</td>\n"
                    + "                    <td>" + ttu.getNgaySinh() + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>Tên User</td>\n"
                    + "                    <td>" + "Ten " + "</td>\n"
                    + "                </tr>\n"
                    + "                <tr>\n"
                    + "                    <td>Password</td>\n"
                    + "                    <td>********</td>\n"
                    + "                </tr>\n"
                    + "            </table>\n"
                    + "            <button id=\"sua\"  onclick=\"sua()\">S?a</button>\n"
                    + "            <button id=\"dongy\" onclick=\"dongy()\" style=\"left: 90px; display: none;\">??ng ý</button>\n"
                    + "            <button id=\"thoat\" onclick=\"thoat()\" style=\"left: 134px; display: none;\">Thoát</button>";

            out.print(table);
            break;
        case "nhapthongtin":
            User user = (User) session.getAttribute("userdangky");    //lay user vua dang ky
            String hoten = request.getParameter("0");
//tach ho va ten
            hoten = hoten.trim();
            if (hoten.lastIndexOf(' ') < 0) {
                out.print("Tên không h?p l?");
                break;
            }
            String ho = hoten.substring(0, hoten.lastIndexOf(' '));
            String ten = hoten.substring(hoten.lastIndexOf(' ') + 1);

            String diachi = request.getParameter("1");
            String ngaysinh = request.getParameter("2");
            Date ns = Date.valueOf(ngaysinh);   //chuyen string sang day
            String sdt = request.getParameter("3");
            Double luong = Double.parseDouble(request.getParameter("4"));

            UserInfor tt = new UserInfor(user.getUserID(), ho, ten, diachi, ns, luong, sdt);
            UserDAO.setThongTinUser(tt);
            out.print("B?n ?ã b? sung thông tin");
            break;
    }
%>--%>