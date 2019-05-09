package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class banner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./css/banner.css");
  }

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.write("body{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("    /*    background-image: url(\"./img/background.png\");*/\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write(".header{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 110px;\n");
      out.write("    background-color: #9a3d00\n");
      out.write("}\n");
      out.write("#admin{\n");
      out.write("    font-size: 15px;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: white;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    position: absolute;\n");
      out.write("    right: 1.5%;\n");
      out.write("    top: 11%;\n");
      out.write("    width: 10%;\n");
      out.write("    text-align: center;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("#admin:hover{\n");
      out.write("    color: rgb(255, 159, 159);\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("#logo{\n");
      out.write("    position: absolute;\n");
      out.write("    margin-left: 30px;\n");
      out.write("    margin-right: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".menu{\n");
      out.write("    position: absolute;\n");
      out.write("    left: 12%;\n");
      out.write("    top: 4%;\n");
      out.write("    padding-left: 0; \n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul li{\n");
      out.write("    float: left;\n");
      out.write("    list-style-type: none;\n");
      out.write("    padding: 15px;\n");
      out.write("    position: relative;\n");
      out.write("    margin: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a{\n");
      out.write("    text-decoration: none;\n");
      out.write("    font-size: 20px;\n");
      out.write("    color: white;\n");
      out.write("    font-weight: 400;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul li:hover{\n");
      out.write("    background-color: orange;\n");
      out.write("}\n");
      out.write("ul li:hover a{\n");
      out.write("    color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer{\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: rgb(247, 119, 35);\n");
      out.write("    color:rgb(255, 255, 255);\n");
      out.write("    text-align: center;\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("}\n");
      out.write(".menu #search{\n");
      out.write("    top: -2px;\n");
      out.write("    left: 5px;\n");
      out.write("    position: relative;\n");
      out.write("    border: 5px;\n");
      out.write("    height: 22px;\n");
      out.write("    width: 159px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".search{\n");
      out.write("    right: 257px;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 41px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".fa-user{\n");
      out.write("    font-size: 19px;\n");
      out.write("    color: white;\n");
      out.write("    text-transform: capitalize;\n");
      out.write("}\n");
      out.write(".dropbtn {\n");
      out.write("    background-color: #45271d;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    text-transform: lowercase;\n");
      out.write("    position: absolute;\n");
      out.write("    display: inline-block;\n");
      out.write("    right: 10px;\n");
      out.write("    top: 23px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("\n");
      out.write("    display: none;\n");
      out.write("    /*    position: absolute;*/\n");
      out.write("    background-color: #45271d;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    text-transform: capitalize;\n");
      out.write("    font-size: 15px;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: rgba(71, 69, 69, 0.6);}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropbtn {\n");
      out.write("    background-color: rgba(71, 69, 69, 0.6);\n");
      out.write("}\n");
      out.write(".dropdown button {\n");
      out.write("    float: left;\n");
      out.write("    height: 40px;\n");
      out.write("    width: 150px;\n");
      out.write("    margin: 10px;\n");
      out.write("    text-align: center;\n");
      out.write("    background:  rgb(247, 119, 35);\n");
      out.write("    color: white;\n");
      out.write("    line-height: 40px;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\n");
      out.write("        <script>\n");
      out.write("            xmlhttp = new XMLHttpRequest();\n");
      out.write("            function logout() {\n");
      out.write("            ");

                request.removeAttribute("user");
                request.removeAttribute("name");
            
      out.write("\n");
      out.write("                window.location = \"/SalaCoffee_2/home.html\";\n");
      out.write("            }\n");
      out.write("            function timkiem(){\n");
      out.write("                var idhoadon = document.getElementById(\"search\").value;\n");
      out.write("                if(idhoadon===\"\"){\n");
      out.write("                    alert(\"Bạn chưa nhập ID Hóa Đơn\");\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/hoadon.jsp?command=timkiemhoadon&idhoadon=\" + idhoadon, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var idhoadon = xmlhttp.responseText.trim();\n");
      out.write("                HoaDon hoadon = HoaDonDAO.getHoaDon(idhoadon);\n");
      out.write("                if(hoadon===null){\n");
      out.write("                    alert(\"Hóa đơn không tồn tại\");\n");
      out.write("                    return;\n");
      out.write("                }\n");
      out.write("                openInNewTab('hoadontimkiem.jsp');\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"home.html\">\n");
      out.write("                    <img src=\"./img/logo.png\" alt=\"\" style=\"width: 90px;\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <a href=\"#\"></a>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"hoadon.jsp\">hóa đơn</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"doanhthu.jsp\">doanh thu</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"khuvuc.jsp\">khu vực</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"ban.jsp\">bàn</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"mon.jsp\">món</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"nhommon.jsp\">nhóm món</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"search\">\n");
      out.write("                <input id=\"search\" type=\"number\" on>\n");
      out.write("                <i class=\"fas fa-search\" style=\"margin-left: 10px; color: white;\" onclick=\"timkiem()\"></i>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\"><i class=\"fas fa-user\"> &nbsp; ");
      out.print(session.getAttribute("name"));
      out.write("</i></button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a href=\"register.jsp\">Tạo tài khoản</a>\n");
      out.write("                    <a onclick=\"logout()\" style=\"cursor: pointer;\">Thoát</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- <img src=\"./img/top.jpg\" alt=\"\" srcset=\"\" style=\"width: 100%; height: 110px;\">-->\n");
      out.write("            <div style=\"clear: both;\"></div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
