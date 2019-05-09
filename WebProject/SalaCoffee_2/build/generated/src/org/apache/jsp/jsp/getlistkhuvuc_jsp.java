package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mode.Users;
import dao.KhuVucDAO;
import mode.KhuVuc;
import java.util.ArrayList;

public final class getlistkhuvuc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    response.setContentType("text/html; charset=UTF-8");
    response.setCharacterEncoding("UTF-8");
    Users user = (Users) session.getAttribute("user");
        if (user == null) {
            out.println("B?n ch?a ??ng nh?p!");
            return;
        }
    
    
    String command = request.getParameter("command");
    int idkv = 0;
    if (request.getParameter("idkhuvuc") != null) {
        idkv = Integer.parseInt(request.getParameter("idkhuvuc"));
    }
    switch (command) {
        case "xoa":
            KhuVucDAO.deleteKhuVuc(idkv);
            session.removeAttribute("listkhuvuc");
            break;
        case "dongy":
            int a = Integer.parseInt(request.getParameter("sid"));
            String b = request.getParameter("stkv");
            KhuVucDAO.updateKhuVuc(idkv, a, b);
            session.removeAttribute("listkhuvuc");
            break;
        case "them":
            int aa = Integer.parseInt(request.getParameter("idthem"));
            String bb = request.getParameter("tenkhu");
            KhuVucDAO.addKhuVuc(aa, bb);
            session.removeAttribute("listkhuvuc");
            break;
        case "getlistkhuvuc":
            ArrayList<KhuVuc> listkhuvuc = null;
            if (session.getAttribute("listkhuvuc") == null) {
                listkhuvuc = new KhuVucDAO().listKhuVuc();
                session.setAttribute("listkhuvuc", listkhuvuc);
            } else {
                listkhuvuc = (ArrayList) session.getAttribute("listkhuvuc");
            }

            String table = " <table>"
                    + "<tr><th>Mã khu v?c</th><th>Tên khu v?c</th><th>Chú thích</th></tr>";
            for (KhuVuc khuvuc : listkhuvuc) {
                int id = khuvuc.getId_khuvuc();
                table += "<tr id=>"
                        + "<td id='" + "i" + khuvuc.getId_khuvuc() + "'>" + khuvuc.getId_khuvuc() + "</td>"
                        + "<td id='" + "t" + khuvuc.getId_khuvuc() + "'>" + khuvuc.getTen_khuvuc() + "</td>"
                        + "<td class='xoasua' style='display: none;' id='" + "si" + id + "'>"
                        + "<input type='text' style='width: 30px;' value='" + khuvuc.getId_khuvuc() + "' id='" + "si1" + id + "'>"
                        + "</td>"
                        + "<td class='xoasua' style='display: none;' id='" + "st" + id + "'>"
                        + "<input type='text' style='width: 30px;' value='" + khuvuc.getTen_khuvuc() + "' id='" + "st1" + id + "'>"
                        + "</td>"
                        + "<td>"
                        + "<button onclick='sua(" + id + ")' id='" + "s" + id + "'> S?a</button>"
                        + "<button onclick='xoa(" + id + ")' id='" + "x" + id + "'> Xóa</button>"
                        + "<button style='display: none;' onclick='dongy(" + id + ")' id='" + "d" + id + "'> ??ng ý</button>"
                        + "<button style='display: none;' onclick='huy(" + id + ")' id='" + "h" + id + "'> H?y</button>"
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


    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
