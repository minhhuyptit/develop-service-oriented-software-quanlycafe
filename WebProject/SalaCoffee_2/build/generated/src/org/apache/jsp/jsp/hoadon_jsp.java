package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mode.Item1;
import mode.SanPham1;
import mode.DanhMuc1;
import mode.Ban1;
import mode.Users1;
import mode.HoaDon;
import dao.HoaDonDAO;
import dao.SanPhamDAO;
import dao.DanhMucDAO;
import dao.CartDAO;
import mode.Cart;
import java.util.Map;
import dao.BanDAO;
import dao.KhuVucDAO;
import mode.KhuVuc;
import java.util.ArrayList;

public final class hoadon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Users1 user = (Users1) session.getAttribute("user");
        if (user == null) {
            out.println("Bạn chưa đăng nhập!");           
            return;
        }
    
    String command = request.getParameter("command");
    Cart cart;
    String idsanpham, a="";
    int idban;
    int idNV = user.getId();
    ArrayList<SanPham1> listsanpham;
    // = null;
    switch (command) {
        case "timkiemhoadon":
            Long idhoadon = Long.parseLong( request.getParameter("idhoadon"));
            session.setAttribute("idhoadon", idhoadon);
            HoaDon hoadon = HoaDonDAO.getHoaDon(idhoadon);
            if(hoadon==null) out.print("Hoa don khong ton tai");
            break;
        case "getlistdanhmuc":
            ArrayList<DanhMuc1> listDanhMuc = DanhMucDAO.listDanhMuc();
            String buttondanhmuc = "";
            for (DanhMuc1 danhmuc : listDanhMuc){
                buttondanhmuc += "<button onclick=\"listsanpham('"+danhmuc.getId()+"')\">"+danhmuc.getName()+"</button>";
            }
            out.print(buttondanhmuc);
            break;
        case "thanhtoan":
            
            cart =(Cart) session.getAttribute("cart");
            if(cart.getCartItem().isEmpty()) break;
            String thanhtoan = "<div class=\"thanhtoan1\">\n"
                        + "<p>Tổng tiền</p>\n"
                        + "<input type=\"text\" value=\""+cart.sumTotal()+"\">\n"

                        + "<div class=\"bt\">\n"
                        + "<button onclick=\"paycart()\" class=\"bt11\">Thanh toán</button>\n"
                        + "<button onclick=\"luucart()\" class=\"bt11\">Lưu</button>\n"
                        + "<button onclick=\"inhoadon()\" class=\"bt11\">In</button>\n"
                        + "<button class=\"bt11\">Xóa</button>\n"
                        + "</div>";
            out.print(thanhtoan);
            break;
        case "getlistsanpham":
            String iddanhmuc = request.getParameter("iddanhmuc");
            listsanpham = SanPhamDAO.listSanPham(iddanhmuc);
            session.setAttribute("listsanpham", listsanpham);
            String buttonsanpham = "";
            for (SanPham1 sanpham : listsanpham){
                buttonsanpham += "<button onclick=\"plussanpham('"+ sanpham.getId()+"')\">"+ sanpham.getName()+"</button>";
            }
            out.print(buttonsanpham);
            break;
        case "getlistkhuvuc":
            String listkv = "";
            ArrayList<KhuVuc> listkhuvuc = KhuVucDAO.listKhuVuc();
            for (KhuVuc khuvuc : listkhuvuc) {
                listkv += "<button onclick='listban(" + khuvuc.getId()+ ")' >" + khuvuc.getName()+ "</button>";
            }
            out.print(listkv);
            break;
        case "getlistban":
            String buttonlistban = "";
            
            int idkhuvuc = Integer.parseInt(request.getParameter("idkhuvuc"));
            session.setAttribute("idkhuvuc", idkhuvuc);
            ArrayList<Ban1> listban = BanDAO.listBan(idkhuvuc);
            for (Ban1 ban : listban) {
                String trangthai = ban.getStatus()==0? "xanh" : "do";
                buttonlistban += "<button onclick=\"cart("+ ban.getId()+")\" class='" + trangthai + "'>" + ban.getName() + "</button>";
            }
            out.print(buttonlistban);
            break;
            
        case "subsanpham":
            idsanpham = request.getParameter("idsanpham");
            cart =(Cart) session.getAttribute("cart");
            cart.subToCart(idsanpham, cart.getCartItem().get(idsanpham));
            for (Map.Entry<String, Item1> list : cart.cartItem.entrySet()) {
                a+= list.getValue().getProduct().getName()+ "--" +list.getValue().getQuantity()+ "-----";
            }
            out.print(a);
            break;
        case "plussanpham":
            idsanpham = request.getParameter("idsanpham");
            cart =(Cart) session.getAttribute("cart");             
            listsanpham = (ArrayList < SanPham1 >) session.getAttribute("listsanpham");
            //SanPham1 sanpham = new SanPham1(idsanpham,"bc", ds, 10000.0, "");
            SanPham1 sanpham = SanPhamDAO.getSanPham(idsanpham, listsanpham);
            
            if (cart.getCartItem().containsKey(idsanpham)) {
                    cart.plusToCart(idsanpham, cart.getCartItem().get(idsanpham));
            } else {
                cart.plusToCart(idsanpham, new Item1(sanpham, 1));
            }
            out.print(a);

            break;
        case "savecart":
//            idNV=Long.parseLong("1537719017001");
//vua sua
//            if (idNV == null) {
//                    request.setAttribute("error", "Bạn chưa đăng nhập");
//                    return;
//            }
            cart =(Cart) session.getAttribute("cart");
            idkhuvuc=(int)session.getAttribute("idkhuvuc");  
            out.print(idkhuvuc);
            
            if(cart.getCartItem().isEmpty()) break;
            idban = (int) session.getAttribute("idban");
            CartDAO.saveCart(idban, cart, idNV);
            
            break;
        case "paycart":  
            idban = (int) session.getAttribute("idban");
            cart = CartDAO.getCart(idban);              //kiểm tra xem người đó có đặt bàn chưa
            if(cart.getCartItem().isEmpty()) {
                out.print("Bàn đang trống");
                break;
            }
//          idNV=Long.parseLong("1537719017001");
//vua sua
//            if (idNV == null) {
//                    return;
//            }
  //          CartDAO.payCart(idban, idNV);
            session.removeAttribute("cart");
            idkhuvuc=(int)session.getAttribute("idkhuvuc");  
            out.print(idkhuvuc);
            break;
            
        case "inhoadon":
            idban = (int) session.getAttribute("idban");
            cart = CartDAO.getCart(idban);              //kiểm tra xem người đó có đặt bàn chưa
            if(cart.getCartItem().isEmpty()) {
                out.print("Bàn đang trống");
            }
            break;
        case "themchietkhau":
            cart =(Cart) session.getAttribute("cart");
            idsanpham = request.getParameter("idsanpham");
            int ck = Integer.parseInt(request.getParameter("ck"));
            if (ck > 100 || ck < 0) {
                out.print("Chiết khấu không hợp lệ?");
                break;
            }
            cart.setChietKhau(ck, idsanpham, cart.getCartItem().get(idsanpham));          
            break;
        case "getcart":
            idban = Integer.parseInt(request.getParameter("idban"));
            cart = CartDAO.getCart(idban);
            session.setAttribute("cart", cart);
            session.setAttribute("idban", idban);               
        case "xuatcart":
            cart =(Cart) session.getAttribute("cart");
            if(cart == null){
                out.print("zo day");
                break;
            }
            if (cart.getCartItem().isEmpty()) break;
            
            String tablecart = "<table border=\"1px\">\n"
                    + "                            <tr id='th'>\n"
                    + "                                <td>MÓN</td>\n"
                    + "                                <td>SL</td>\n"
                    + "                                <td>GIÁ</td>\n"
                    + "                                <td>CK</td>\n"
                    + "                                <td>TỔNG</td>\n"
                    + "                                <td>CHỈNH</td>\n"
                    + "                            </tr>";
            
            for (Map.Entry<String, Item1> listCart : cart.cartItem.entrySet()) {
              
                String ten = listCart.getValue().getProduct().getName();
                int soluong = listCart.getValue().getQuantity();
                Double gia = listCart.getValue().getProduct().getPrice();
                int chietkhau = listCart.getValue().getDiscount();
                idsanpham = listCart.getValue().getProduct().getId();
                Double tong = soluong * gia - (soluong * gia * chietkhau) / 100;
                String id = listCart.getValue().getProduct().getId();
                tablecart += "<tr>\n"
                        + "<td class=\"ten\">"+ ten +"</td>\n"
                        + "<td class=\"sl\">"+ soluong +"</td>\n"
                        + "<td class=\"gia\">"+ gia +"</td>\n"

                        + "<td id=\"hienck"+id+"\" class=\"ck\">"+ chietkhau +"</td>\n"
                        + "<td id=\"anck"+id+"\" style=\"display: none;\">\n"
                        +       "<input id=\"ck"+id+"\" type=\"text\" style=\"width: 30px;\" value=\""+chietkhau+"\">\n"
                        + "</td>\n"
                        
                        + "<td class=\"tong\">"+ tong +"</td>\n"
                        + "<td class=\"suacart\">\n"
                        +       "<button id=\"x"+id+"\" onclick=\"subsanpham('"+id+"')\" style=\"background-color: red;\">-</button>\n"
                        +       "<button id=\"s"+id+"\" onclick=\"sua('"+id+"')\" style=\"background-color: green;\">%</button>\n"
                        
                        +       "<button id=\"t"+id+"\" onclick=\"thoat('"+id+"')\" style=\"display: none; background-color: red;\">x</button>\n"
                        +       "<button id=\"d"+id+"\" onclick=\"dongy('"+id+"')\" style=\"display: none; background-color: green;\" name=\"nck\" value=\"\">o</button>\n"
                        + "</td>\n"
                        + "</tr>";   
            } 
            tablecart += "</table>";
            out.print(tablecart);
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
