package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class banner_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("/*    background-image: url(\"./img/background.png\");*/\n");
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
      out.write("    left: 14%;\n");
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
      out.write("\n");
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
      out.write("     text-transform: lowercase;\n");
      out.write("    position: absolute;\n");
      out.write("    display: inline-block;\n");
      out.write("    right: 10px;\n");
      out.write("    top: 23px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("   \n");
      out.write("    display: none;\n");
      out.write("/*    position: absolute;*/\n");
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
      out.write("}");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function thoat() {\n");
      out.write("            ");

                request.removeAttribute("user");
                request.removeAttribute("name");
            
      out.write("\n");
      out.write("                setTimeout(function ChuyenTrang() {\n");
      out.write("                    window.location = \"/SalaCoffee_2/login.jsp\";\n");
      out.write("                }, 3000);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"#\">\n");
      out.write("                    <img src=\"./img/logo.png\" alt=\"\" style=\"width: 90px;\">\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"menu\">\n");
      out.write("                <a href=\"#\"></a>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"hoadon_1.jsp\">hóa đơn</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">tìm kiếm</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <div class=\"dropdown\">\n");
      out.write("                <button class=\"dropbtn\"><i class=\"fas fa-user\">  ");
      out.print(session.getAttribute("name"));
      out.write("</i></button>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                    <a onclick=\"thoat()\">Thoát</a>\n");
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
