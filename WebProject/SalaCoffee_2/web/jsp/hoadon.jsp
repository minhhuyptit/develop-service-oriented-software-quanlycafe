
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Locale"%>
<%@page import="model.Item"%>
<%@page import="model.Product"%>
<%@page import="model.Category"%>
<%@page import="model.Table"%>
<%@page import="model.User"%>
<%@page import="model.Stats"%>
<%@page import="dao.StatsDAO"%>
<%@page import="dao.ProductDAO"%>
<%@page import="dao.CategoryDAO"%>

<%@page import="dao.CartDAO"%>
<%@page import="model.Cart"%>
<%@page import="java.util.Map"%>
<%@page import="dao.TableDAO"%>

<%@page import="dao.AreaDAO"%>
<%@page import="model.Area"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    User user = (User) session.getAttribute("user");
        if (user == null) {
            out.println("Bạn chưa đăng nhập!");           
            return;
        }
    
    String command = request.getParameter("command");
    Cart cart;
    String idsanpham, a="";
    int idban;
    int idNV = user.getId();
    ArrayList<Product> listsanpham;
    Locale localeVN = new Locale("vi", "VN");
    NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
    switch (command) {
        case "timkiemhoadon":
//            Long idhoadon = Long.parseLong( request.getParameter("idhoadon"));
//            session.setAttribute("idhoadon", idhoadon);
//            HoaDon hoadon = HoaDonDAO.getHoaDon(idhoadon);
//            if(hoadon==null) out.print("Hoa don khong ton tai");
            break;
        case "getlistdanhmuc":
            ArrayList<Category> listDanhMuc = CategoryDAO.listDanhMuc();
            String buttondanhmuc = "";
            for (Category danhmuc : listDanhMuc){
                buttondanhmuc += "<button onclick=\"listsanpham('"+danhmuc.getId()+"')\">"+danhmuc.getName()+"</button>";
            }
            out.print(buttondanhmuc);
            break;
        case "thanhtoan":
            
            cart =(Cart) session.getAttribute("cart");
            if(cart.getCartItem().isEmpty()) break;
            
            String thanhtoan = "<div class=\"thanhtoan1\">\n"
                        + "<p>Tổng tiền</p>\n"
                        + "<input type=\"text\" value=\""+ currencyVN.format(cart.sumTotal()) +"\">\n"

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
            listsanpham = ProductDAO.listSanPham(iddanhmuc);
            session.setAttribute("listsanpham", listsanpham);
            String buttonsanpham = "";
            for (Product sanpham : listsanpham){
                buttonsanpham += "<button onclick=\"plussanpham('"+ sanpham.getId()+"')\">"+ sanpham.getName()+"</button>";
            }
            out.print(buttonsanpham);
            break;
        case "getlistkhuvuc":
            String listkv = "";
            ArrayList<Area> listkhuvuc = AreaDAO.listKhuVuc();
            for (Area khuvuc : listkhuvuc) {
                listkv += "<button onclick='listban(" + khuvuc.getId()+ ")' >" + khuvuc.getName()+ "</button>";
            }
            out.print(listkv);
            break;
        case "getlistban":
            String buttonlistban = "";
            
            int idkhuvuc = Integer.parseInt(request.getParameter("idkhuvuc"));
            session.setAttribute("idkhuvuc", idkhuvuc);
            ArrayList<Table> listban = TableDAO.listBan(idkhuvuc);
            for (Table ban : listban) {
                String trangthai = ban.getStatus()==0? "xanh" : "do";
                buttonlistban += "<button onclick=\"cart("+ ban.getId()+")\" class='" + trangthai + "'>" + ban.getName() + "</button>";
            }
            out.print(buttonlistban);
            break;
            
        case "subsanpham":
            idsanpham = request.getParameter("idsanpham");
            cart =(Cart) session.getAttribute("cart");
            cart.subToCart(idsanpham, cart.getCartItem().get(idsanpham));
            for (Map.Entry<String, Item> list : cart.cartItem.entrySet()) {
                a+= list.getValue().getProduct().getName()+ "--" +list.getValue().getQuantity()+ "-----";
            }
            out.print(a);
            break;
        case "plussanpham":
            idsanpham = request.getParameter("idsanpham");
            cart =(Cart) session.getAttribute("cart");             
            listsanpham = (ArrayList < Product >) session.getAttribute("listsanpham");
            //SanPham1 sanpham = new SanPham1(idsanpham,"bc", ds, 10000.0, "");
            Product sanpham = ProductDAO.getSanPham(idsanpham, listsanpham);
            
            if (cart.getCartItem().containsKey(idsanpham)) {
                    cart.plusToCart(idsanpham, cart.getCartItem().get(idsanpham));
            } else {
                cart.plusToCart(idsanpham, new Item(sanpham, 1));
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
            String price = CartDAO.payCart(idban, idNV);
            if(price.equals("TABLE_AVALIABLE")) {
                out.print("Bàn đang trống");
                break;
            }
            session.removeAttribute("cart");
            idkhuvuc=(int)session.getAttribute("idkhuvuc");  
            out.print(idkhuvuc + "&" + price);
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
            
             // tạo 1 DecimalFormat để định dạng số theo tiêu chuẩn của nước Anh
            Locale locale = new Locale("en", "EN");
            // khai báo 1 DecimalFormat có tên là dcf
            // để định dạng số floatNumber theo mẫu "####,###.##"
            // tức là phần thập phân của số floatNumber sau khi định dạng sẽ có 2 chữ số
            // và phần ngàn của số sẽ được phân cách bằng dấu phẩy
            // lưu ý: trong pattern chúng ta nhận thấy phần đứng trước dấu thập phân có 7 chữ số
            // trong khi số floatNumber của chúng ta có 6 chữ số ở phần nguyên
            // vì vậy đối với DecimalFormat thì tất cả các chữ số ở phần nguyên
            // là bất kỳ và không phụ thuộc vào số chữ số phần nguyên được khai báo trong pattern
            // nhưng phần thập phân của số phải bằng với phần thập phân của pattern
            // nhưng phần thập phân của số phải bằng với phần thập phân của pattern
//            String pattern = "###,###.##";
//            DecimalFormat dcf = (DecimalFormat) NumberFormat.getNumberInstance(locale);
//            dcf.applyPattern(pattern);  // áp dụng mẫu pattern = "###.##" cho dcf   
            
            for (Map.Entry<String, Item> listCart : cart.cartItem.entrySet()) {
              
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
                        + "<td class=\"gia\" text-align=\"center\">"+ currencyVN.format(gia)  +"</td>\n"

                        + "<td id=\"hienck"+id+"\" class=\"ck\">"+ chietkhau +"</td>\n"
                        + "<td id=\"anck"+id+"\" style=\"display: none;\">\n"
                        +       "<input id=\"ck"+id+"\" type=\"text\" style=\"width: 30px;\" value=\""+chietkhau+"\">\n"
                        + "</td>\n"
                        
                        + "<td class=\"tong\">"+ currencyVN.format(tong) +"</td>\n"
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
%>