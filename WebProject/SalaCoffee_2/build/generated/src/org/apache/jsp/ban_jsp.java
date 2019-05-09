package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.BanDAO;
import mode.Ban;
import dao.KhuVucDAO;
import mode.KhuVuc;
import java.util.ArrayList;
import java.util.ArrayList;

public final class ban_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>           \n");
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
      out.write("        <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            function listKhuVuc() {\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistban.jsp?command=getkhuvuc\", false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var listkv = xmlhttp.responseText.trim();\n");
      out.write("                document.getElementById(\"listkhuvuc\").innerHTML = listkv;\n");
      out.write("            }\n");
      out.write("            function listBan(id) {\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistban.jsp?command=getban&idkv=\" + id, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var listban = xmlhttp.responseText.trim();\n");
      out.write("                document.getElementById(\"listban\").innerHTML = listban;\n");
      out.write("            }\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                listKhuVuc();\n");
      out.write("                var value = $('select[name=selecter]').val();\n");
      out.write("                listBan(value);\n");
      out.write("                $(\"#listkhuvuc\").change(function () {\n");
      out.write("                    var value = $('select[name=selecter]').val();\n");
      out.write("                    listBan(value);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function xoa(idban) {\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistban.jsp?command=xoa&xoa=\" + idban, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var value = $('select[name=selecter]').val();\n");
      out.write("                listBan(value);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function sua(id) {\n");
      out.write("                document.getElementById(\"hien\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"an\" + id).style.display = \"table-cell\";\n");
      out.write("\n");
      out.write("                document.getElementById(\"anid\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"anten\" + id).style.display = \"table-cell\";\n");
      out.write("\n");
      out.write("                document.getElementById(\"hienid\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"hienten\" + id).style.display = \"none\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function thoat(id) {\n");
      out.write("                document.getElementById(\"hien\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"an\" + id).style.display = \"none\";\n");
      out.write("\n");
      out.write("                document.getElementById(\"anid\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"anten\" + id).style.display = \"none\";\n");
      out.write("\n");
      out.write("                document.getElementById(\"hienid\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"hienten\" + id).style.display = \"table-cell\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function dongy(id) {\n");
      out.write("                var a = document.getElementById(\"id\" + id).value;\n");
      out.write("                var b = document.getElementById(\"ten\" + id).value;\n");
      out.write("\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistban.jsp?command=dongy&id=\" + id + \"&newid=\" + a + \"&ten=\" + b, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var value = $('select[name=selecter]').val();\n");
      out.write("                listBan(value);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function them(idkhuvuc){\n");
      out.write("                var a = document.getElementById(\"themid\").value;\n");
      out.write("                var b = document.getElementById(\"themten\").value;\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistban.jsp?command=them&idkhuvuc=\" + idkhuvuc + \"&id=\" + a + \"&ten=\" + b, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var value = $('select[name=selecter]').val();\n");
      out.write("                listBan(value);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"ban\">\n");
      out.write("            <p class=\"title\">DANH MỤC BÀN</p>\n");
      out.write("            <div class=\"option\">\n");
      out.write("                <div class=\"chon\">\n");
      out.write("                    <p style=\"font-weight: bold\">KHU VỰC</p>\n");
      out.write("                    <select name=\"selecter\" id=\"listkhuvuc\">\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <div id=\"listban\">\n");
      out.write("\n");
      out.write("                </div>\n");
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
