package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Timestamp;
import mode.HoaDon;
import dao.HoaDonDAO;
import java.util.Map;
import mode.Item;
import mode.Cart;

public final class inhoadon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./css/inhoadon.css");
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
      out.write("        <title>In hóa đơn</title>\n");
      out.write("        <style>\n");
      out.write("            ");
      out.write("body{\n");
      out.write("    background-image: url(\"./anh/background.png\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 60%;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write(".thongtinhoadon table{\n");
      out.write("    font-family: arial, sans-serif;\n");
      out.write("    border-collapse: collapse;\n");
      out.write("    width: 50%;\n");
      out.write("    margin: auto;\n");
      out.write("}\n");
      out.write("td, th {\n");
      out.write("    \n");
      out.write("    text-align: left;\n");
      out.write("    padding: 8px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".inhoadon{\n");
      out.write("    text-align: center;\n");
      out.write("}");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Cart cart = (Cart) session.getAttribute("cart");
            if (cart.getCartItem().isEmpty()) {
                return;
            }
            
            int idban = (int) session.getAttribute("idban");
            HoaDon hoadon = HoaDonDAO.getHoaDon(HoaDonDAO.idHoaDon(idban));
            java.util.Date now = new java.util.Date();
            String usernamepay = (String) session.getAttribute("name");
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"inhoadon\">\n");
      out.write("            <h2>HÓA ĐƠN BÁN HÀNG</h2>\n");
      out.write("            <div class=\"hoadon\">\n");
      out.write("                <table class=\"thongtinhoadon\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>ID HÓA ĐƠN:</td>\n");
      out.write("                        <td>");
      out.print(hoadon.getIdHoaDon());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nhân viên Order:</td>\n");
      out.write("                        <td>");
      out.print(hoadon.getUserOrder());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nhân viên thanh toán:</td>\n");
      out.write("                        <td>");
      out.print(usernamepay);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Giờ vào</td>\n");
      out.write("                        <td>");
      out.print(hoadon.getGioVao());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Giờ ra</td>\n");
      out.write("                        <td>");
      out.print(now);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <hr style=\"width:50%\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Tên món</th>\n");
      out.write("                        <th>SL</th>\n");
      out.write("                        <th>Đơn giá</th>\n");
      out.write("                        <th>Chiết khấu</th>\n");
      out.write("                        <th>Tính tiền</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        for (Map.Entry<String, Item> listCart : cart.cartItem.entrySet()) {
                            String ten = listCart.getValue().getSanpham().getTenSanPham();
                            int soluong = listCart.getValue().getSoluong();
                            Double gia = listCart.getValue().getSanpham().getGiaSanPham();
                            int chietkhau = listCart.getValue().getChietKhau();
                            Double tong = soluong * gia - (soluong * gia * chietkhau) / 100;
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(ten);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(soluong);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(gia);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(chietkhau);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(tong);
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <hr style=\"width:50%\">\n");
      out.write("\n");
      out.write("                <table>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Thanh toán : </td>\n");
      out.write("                        <td>");
      out.print(cart.sumTotal());
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <hr style=\"width:50%\">\n");
      out.write("                <h3>CẢM ƠN QUÝ KHÁCH, HẸN GẶP LẠI QUÝ KHÁCH!</h3>\n");
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
