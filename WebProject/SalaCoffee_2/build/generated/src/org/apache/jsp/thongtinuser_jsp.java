package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class thongtinuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./css/thongtin.css");
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
      out.write(".title{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    color: rgb(85, 0, 0);\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("    background-image: url(\"./img/background.png\");\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form{\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    height: 300px;\r\n");
      out.write("    border: 1px solid orange;\r\n");
      out.write("    margin:auto;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    top:0; left:0; right:0; bottom:0;\r\n");
      out.write("}\r\n");
      out.write(".form1{\r\n");
      out.write("    margin-top: 20px;\r\n");
      out.write("    margin-left: 50px;\r\n");
      out.write("}\r\n");
      out.write("input{\r\n");
      out.write("    margin-left: 30px;\r\n");
      out.write("}\r\n");
      out.write(".date{\r\n");
      out.write("    margin-left: 13px;\r\n");
      out.write("}\r\n");
      out.write(".sdt{\r\n");
      out.write("    margin-left: 12px;\r\n");
      out.write("}\r\n");
      out.write(".luong{\r\n");
      out.write("    margin-left: 8px;\r\n");
      out.write("}\r\n");
      out.write(".text{\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("input{\r\n");
      out.write("    width: 200px;\r\n");
      out.write("    height: 20px;\r\n");
      out.write("}\r\n");
      out.write(".quyen{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: 73px;\r\n");
      out.write("}\r\n");
      out.write("button{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    left: 100px;\r\n");
      out.write("    background-color: rgb(255, 186, 59);\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    height: 30px;\r\n");
      out.write("    border: none;\r\n");
      out.write("}\r\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            xmlhttp = new XMLHttpRequest();\n");
      out.write("            function Submit() {\n");
      out.write("                var input = document.getElementsByTagName(\"input\");\n");
      out.write("\n");
      out.write("                for (var i = 0; i < input.length; i++) {\n");
      out.write("                    if (input[i].value === \"\") {\n");
      out.write("                        alert(\"Bạn chưa nhập đủ thông tin\");\n");
      out.write("                        return;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                var thamso = \"\";\n");
      out.write("                for (var i = 0; i < input.length; i++)\n");
      out.write("                    thamso += \"&\" + i + \"=\" + input[i].value;\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/nhapthongtin.jsp?command=nhapthongtin\" + thamso, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var thongbao = xmlhttp.responseText.trim();\n");
      out.write("                alert(thongbao);\n");
      out.write("                if (thongbao !== \"Tên không hợp lệ\") {\n");
      out.write("                    setTimeout(function ChuyenTrang() {\n");
      out.write("                        window.location = \"/SalaCoffee_2/hoadon.jsp\";\n");
      out.write("                    }, 2000);\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"quyen\">\n");
      out.write("            <h2>THÔNG TIN TÀI KHOẢN</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <div class=\"form1\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>fsdfsdf</td>\n");
      out.write("                        <td>fsdfsdf</td>\n");
      out.write("                        <td>fsdfsdf</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <button onclick=\"Submit()\">Đồng ý</button>\n");
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
