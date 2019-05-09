package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mode.DanhMuc;
import java.util.ArrayList;
import dao.DanhMucDAO;

public final class mon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./css/mon.css");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
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
      out.write(".option{\n");
      out.write("    position: center;\n");
      out.write("}\n");
      out.write("table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 60%;\n");
      out.write("    margin: auto;\n");
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
      out.write("#caphe, #trasua, #tra, #douongcocon, #soda{\n");
      out.write("    display: none;\n");
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
      out.write("        <script>\n");
      out.write("            var xmlhttp = new XMLHttpRequest();\n");
      out.write("            function ListDanhMuc() {\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistmon.jsp?command=getdanhmuc\", false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var listdm = xmlhttp.responseText.trim();\n");
      out.write("                document.getElementById(\"listdanhmuc\").innerHTML = listdm;\n");
      out.write("            }\n");
      out.write("            function ListMon(id) {\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistmon.jsp?command=getlist&\" + \"id_area=\" + id, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var table = xmlhttp.responseText.trim();\n");
      out.write("                document.getElementById(\"listsanpham\").innerHTML = table;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var value = $('select[id=listdanhmuc]').val();\n");
      out.write("                ListMon(value);\n");
      out.write("                $(\"#listdanhmuc\").change(function () {\n");
      out.write("                    var value = $('select[id=listdanhmuc]').val();\n");
      out.write("                    ListMon(value);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            function xoa(idkhuvuc) {\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistmon.jsp?command=xoa&xoa=\" + idkhuvuc, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var value = $('select[id=listdanhmuc]').val();\n");
      out.write("                ListMon(value);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function sua(id) {\n");
      out.write("                document.getElementById(\"hien\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"an\" + id).style.display = \"table-cell\";\n");
      out.write("\n");
      out.write("                document.getElementById(\"anid\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"anten\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"angia\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"anghichu\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"hienid\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"hienten\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"hiengia\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"hienghichu\" + id).style.display = \"none\";\n");
      out.write("            }\n");
      out.write("            function thoat(id) {\n");
      out.write("                document.getElementById(\"hien\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"an\" + id).style.display = \"none\";\n");
      out.write("\n");
      out.write("                document.getElementById(\"anid\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"anten\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"angia\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"anghichu\" + id).style.display = \"none\";\n");
      out.write("                document.getElementById(\"hienid\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"hienten\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"hiengia\" + id).style.display = \"table-cell\";\n");
      out.write("                document.getElementById(\"hienghichu\" + id).style.display = \"table-cell\";\n");
      out.write("            }\n");
      out.write("            function dongy(id) {\n");
      out.write("                var a = document.getElementById(\"id\" + id).value;\n");
      out.write("                var b = document.getElementById(\"ten\" + id).value;\n");
      out.write("                var c = document.getElementById(\"gia\" + id).value;\n");
      out.write("                var d = document.getElementById(\"ghichu\" + id).value;\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/getlistmon.jsp?command=dongy&id=\" + id + \"&newid=\" + a + \"&ten=\" + b + \"&gia=\" + c + \"&ghichu=\" + d, false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var value = $('select[id=listdanhmuc]').val();\n");
      out.write("                ListMon(value);\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function them(danhmuc){\n");
      out.write("                alert(\"sfsdf\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"ListDanhMuc()\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"mon\">\n");
      out.write("            <p class=\"title\">DANH MỤC MÓN</p>\n");
      out.write("            <div class=\"option\">\n");
      out.write("                <div class=\"chon\">\n");
      out.write("                    <p style=\"font-weight: bold\">NHÓM MÓN</p>\n");
      out.write("                    <select id=\"listdanhmuc\">\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <div id=\"listsanpham\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
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
