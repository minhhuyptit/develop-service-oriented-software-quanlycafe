<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.RevenueStatistics"%>
<%@page import="model.Item"%>
<%@page import="model.User"%>
<%@page import="model.Stats"%>
<%@page import="java.util.Map"%>
<%@page import="dao.StatsDAO"%>
<%@page import="dao.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
//    Users user = (Users) session.getAttribute("user");
//        if (user == null) {
//            out.println("Bạn chưa đăng nhập!");
//            return;
//        }
    Locale localeVN = new Locale("vi", "VN");
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
    String command = request.getParameter("command");
    switch (command) {
        case "thongke":
            String kt= "";
            String a = request.getParameter("start");
            String b = request.getParameter("end");
           // Long id = Long.parseLong(request.getParameter("iduser"));
            RevenueStatistics thongKeDT = StatsDAO.ThongKe(a, b);
            if(thongKeDT==null) break;
            String tk = "<table>\n"
                    + "                <tr>\n"
                    + "                    <th>Tên hàng</th>\n"
                    + "                    <th>Số lượng</th>\n"
                    + "                    <th>Giá bán</th>\n"
                    + "                    <th>Doanh thu</th>\n"
                    + "                </tr>";
            for(Stats list: thongKeDT.getListStast()) {
                tk+="<tr>\n"
                    + "<td>"+list.getName()+"</td>\n"
                    + "<td>"+list.getQuantity()+"</td>\n"
                    + "<td style=\"text-align: right\">"+ numberFormat.format(list.getPrice()) +"</td>\n"
                    + "<td style=\"text-align: right\">"+ numberFormat.format(list.getQuantity() * list.getPrice()) +"</td>\n"
                    + "</tr>";
            }
            tk+="</table>";
            out.print(tk);
            break;
    }

%>