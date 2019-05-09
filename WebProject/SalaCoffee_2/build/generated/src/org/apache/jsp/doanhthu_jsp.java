package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class doanhthu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./css/doanhthu.css");
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
      out.write("select{\n");
      out.write("    width: 150px;\n");
      out.write("    height: 30px;\n");
      out.write("}\n");
      out.write("button{\n");
      out.write("    width: 70px;\n");
      out.write("    height: 30px;\n");
      out.write("    background-color: rgb(255, 196, 87);\n");
      out.write("    border: none;\n");
      out.write("}\n");
      out.write(".title{\n");
      out.write("    text-align: center;\n");
      out.write("    font-weight: bold;\n");
      out.write("    color: rgb(85, 0, 0);\n");
      out.write("    font-size: 18px;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("/*    background-image: url(\"./anh/background.png\");*/\n");
      out.write("}\n");
      out.write(".nhanvien{\n");
      out.write("    text-align: center;\n");
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
      out.write("}");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            xmlhttp = new XMLHttpRequest();\n");
      out.write("            function listnhanvien(){\n");
      out.write("                xmlhttp.open(\"get\", \"./jsp/doanhthu.jsp?command=getlistnhanvien\", false);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                var listnv = xmlhttp.responseText.trim();\n");
      out.write("                document.getElementById(\"danhsachnhanvien\").innerHTML = listnv;\n");
      out.write("            }\n");
      out.write("            function thongkedoanhthu(){\n");
      out.write("                alert();\n");
      out.write(" //               var inputday = document.getElementsByTagName(\"input\");\n");
      out.write("//                for(int i=0; i<inputday.length; i++){\n");
      out.write("//                    alert(inputday[i].value);\n");
      out.write("//                }\n");
      out.write(" //               var start = inputday[0].value; alert(start);\n");
      out.write("                //var end = inputday[1].value;alert(end);\n");
      out.write("//                //var iduser = document.getElementsByTagName(\"select\")[0].value;\n");
      out.write("//                \n");
      out.write("//                \n");
      out.write("//                //alert(iduser);\n");
      out.write("//                xmlhttp.open(\"get\", \"./jsp/doanhthu.jsp?command=thongke&start=\" + start +\"&end=\"+ end +\"&iduser=\" + iduser, false);\n");
      out.write("//                xmlhttp.send();\n");
      out.write("//                var thongke = xmlhttp.responseText.trim();\n");
      out.write("//                if(thongke===\"\") alert(\"Không có sản phẩm tìm thấy\"); \n");
      out.write("//                document.getElementById(\"listdanhthu\").innerHTML = thongke;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"listnhanvien()\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "banner.jsp", out, false);
      out.write("\n");
      out.write("        <p class=\"title\">DOANH THU</p>\n");
      out.write("        <div class=\"nhanvien\">\n");
      out.write("            Từ ngày : <input type=\"date\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Đến ngày : <input type=\"date\">\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            Nhân viên :\n");
      out.write("            <select id=\"danhsachnhanvien\">\n");
      out.write("                \n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <button onclick=\"thongkedoanhthu()\">Lọc</button>\n");
      out.write("            <button>In</button>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bang\" id=\"listdanhthu\">\n");
      out.write("            \n");
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
