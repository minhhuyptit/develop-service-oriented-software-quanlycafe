package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./css/login.css");
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
      out.write("        <title>Đăng ký</title>\n");
      out.write("        \n");
      out.write("         <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var x_timer;\n");
      out.write("                $(\"#username\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var user_name = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_username_ajax(user_name);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                function check_username_ajax(username) {\n");
      out.write("                    $(\"#user-result\").html('<img src=\"img/ajax-loader.gif\" />');\n");
      out.write("                    $.post('CheckUsersServlet', {'username': username}, function (data) {\n");
      out.write("                        $(\"#user-result\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.write("body{\n");
      out.write("    margin: 0;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;\n");
      out.write("    background-size: cover;\n");
      out.write("    background-image: url(\"./img/dangnhap.jpg\");\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login1{\n");
      out.write("    width: 533px;\n");
      out.write("    height: 300px;\n");
      out.write("    background-color: #fdfbfba1;\n");
      out.write("    margin:auto;\n");
      out.write("    position:absolute;\n");
      out.write("    top:0; left:0; right:0; bottom:80px;\n");
      out.write("    border-radius: 10px;\n");
      out.write("    box-shadow: 0px 0px 20px black;\n");
      out.write("}\n");
      out.write(".login1 p{\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 30px;\n");
      out.write("    color: rgb(156, 6, 6);\n");
      out.write("    margin-bottom: 0;\n");
      out.write("    top: 35%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bt .tk{\n");
      out.write("    position: absolute;\n");
      out.write("    left: 60px;\n");
      out.write("    margin: 0;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write(".bt .mk{\n");
      out.write("    margin: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 49%;\n");
      out.write("    left: 11%;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write(".ip{ \n");
      out.write("    position: absolute;\n");
      out.write("    left: 180px;\n");
      out.write("    top: 34%;\n");
      out.write("    height: 22px;\n");
      out.write("    width: 300px;\n");
      out.write("    background: #ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ip1{ \n");
      out.write("    position: absolute;\n");
      out.write("    left: 180px;\n");
      out.write("    top: 49%;\n");
      out.write("    height: 22px;\n");
      out.write("    width: 300px;\n");
      out.write("    background: #ffffff;\n");
      out.write("}\n");
      out.write(".ip2{ \n");
      out.write("    position: absolute;\n");
      out.write("    left: 166px;\n");
      out.write("    top: 52%;\n");
      out.write("    height: 20px;\n");
      out.write("    width: 40px;\n");
      out.write("    background: #ffffff;\n");
      out.write("}\n");
      out.write(".bt .ghinho{\n");
      out.write("    margin: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    left: 38%;\n");
      out.write("    top: 52%;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write(".dangnhap{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 64%;\n");
      out.write("    background:rgb(156, 6, 6);\n");
      out.write("    border: 0;\n");
      out.write("    color: white;\n");
      out.write("    left: 38%;\n");
      out.write("    border-radius: 3px;\n");
      out.write("    height: 30px;\n");
      out.write("    width: 160px\n");
      out.write("\n");
      out.write("}\n");
      out.write(".dangnhap:hover{\n");
      out.write("    cursor: pointer;\n");
      out.write("    background: red;\n");
      out.write("}\n");
      out.write(".login hr{\n");
      out.write("    position: absolute;\n");
      out.write("    top: 246px;\n");
      out.write("    left: 0;\n");
      out.write("    right: 0;\n");
      out.write("    margin: auto;\n");
      out.write("    width: 90%;\n");
      out.write("}\n");
      out.write(".dangky{\n");
      out.write("    margin: 0;\n");
      out.write("    position: absolute;\n");
      out.write("    left: 25%;\n");
      out.write("    top: 80%;\n");
      out.write("}\n");
      out.write(".dangky p{\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write(".dangky p a{\n");
      out.write("    font-style: italic;\n");
      out.write("    text-decoration: none;\n");
      out.write("    color: rgb(156, 6, 6);\n");
      out.write("}\n");
      out.write("\n");
      out.write("#footer{\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #fdfbfba1;\n");
      out.write("    color: rgb(156, 6, 6);\n");
      out.write("    text-align: center;\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0;\n");
      out.write("}");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login\">\n");
      out.write("            <div class=\"login1\" >\n");
      out.write("                <p style=\"font-weight:bold; text-shadow: 0 0 3px white;\">ĐĂNG KÝ</p>\n");
      out.write("                ");
if (request.getAttribute("error") != null) {
      out.write("\n");
      out.write("                <p id=\"message\" style=\"font-size: 15px; margin: 5px; font-style: italic; color: red;\">");
      out.print(request.getAttribute("error"));
      out.write("</p>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <div class=\"bt\">\n");
      out.write("                    <form action=\"login\" method=\"POST\">\n");
      out.write("                       \n");
      out.write("                        <p class=\"tk\">Tài khoản:</p>\n");
      out.write("                        <input class=\"ip\" id=\"username\" type=\"text\" name=\"user_name\">\n");
      out.write("                        <div id=\"user-result\" style=\"position: absolute; top: 35%; right: 23px;\"></div>\n");
      out.write("                        <p class=\"mk\">Mật khẩu:</p>\n");
      out.write("                        <input class=\"ip1\" type=\"password\" name=\"user_pass\" id=\"password\">\n");
      out.write("                        <!--                        <input class=\"ip2\" type=\"checkbox\">\n");
      out.write("                                                <p class=\"ghinho\">Ghi nhớ đăng nhập</p>-->\n");
      out.write("                        <input type=\"hidden\" name=\"command\" value=\"register\">\n");
      out.write("                        <button class=\"dangnhap\" style=\"font-size: 18px\" \"> ĐĂNG KÝ </button>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>  \n");
      out.write("                <hr>\n");
      out.write("\n");
      out.write("                <div class=\"dangky\">\n");
      out.write("                    <p>Đã có tài khoản? <a href=\"login.jsp\">Đăng nhập</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <p style=\"margin: 8px\">Copyright&copy; 2018 SalaCoffee</p>\n");
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
