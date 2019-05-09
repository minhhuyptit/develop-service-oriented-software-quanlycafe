package controller;

import dao.TableDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Table;

/**
 *
 * @author Admin
 */
public class TableServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String command = request.getParameter("command");
        switch (command) {
            case "chonkhu":
                String khuvuc = request.getParameter("khuvuc");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        TableDAO banDAO = new TableDAO();
        String id_area = request.getParameter("id_area");
        ArrayList<Table> list = banDAO.listBan(Integer.parseInt(id_area));
        String xhtml = "";
        for (Table item : list) {
            xhtml += "<tr class=\"remove\">\n"
                    + "                            <td>" + item.getId()+"</td>\n"
                    + "                            <td>" + item.getName()+ "</td>\n"
                    + "                            <td>\n"
                    + "                                <button onclick='sua("+item.getId()+")' >Sửa</button>\n"
                    + "                                <button onclick='xoa("+item.getId()+")'>Xóa</button>\n"
                    + "                            </td>\n"
                    + "                        </tr>";
        }
        response.getWriter().print(xhtml);
    }

}
