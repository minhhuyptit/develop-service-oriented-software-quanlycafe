package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kho_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./css/kho.css");
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
      out.write("         <style>           \n");
      out.write("            ");
      out.write(".title{\n");
      out.write("    text-align: center;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: rgb(85, 0, 0);\n");
      out.write("    font-size: 18px;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    background-image: url(\"./anh/background.png\");\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 60%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td, th {\n");
      out.write("    border: 1px solid black;\n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: rgb(250, 189, 99);\n");
      out.write("}\n");
      out.write("table{\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("select{\n");
      out.write("    width: 130px;\n");
      out.write("    height: 30px;\n");
      out.write("}\n");
      out.write(".chon{\n");
      out.write("    text-align: center;\n");
      out.write("    width: 500px;\n");
      out.write("    height: 100px;\n");
      out.write("    margin: auto;\n");
      out.write("}");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\n");
      out.write("         \n");
      out.write("        <div class=\"kho\">\n");
      out.write("            <p class=\"title\">DANH MỤC KHO</p>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div id=\"tra\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Mã kho</th>\n");
      out.write("                        <th>Tên kho</th>\n");
      out.write("                        <th>Chú thích</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>K01</td>\n");
      out.write("                        <td>Cửa hàng 1</td>\n");
      out.write("                        <td>\n");
      out.write("                            <button>Sửa</button>\n");
      out.write("                            <button>Xóa</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>TS02</td>\n");
      out.write("                        <td>Cửa hàng 2</td>\n");
      out.write("                        <td>\n");
      out.write("                            <button>Sửa</button>\n");
      out.write("                            <button>Xóa</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\"></td>\n");
      out.write("                        <td><input type=\"text\"></td>\n");
      out.write("                        <td><button>Thêm</button></td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
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
