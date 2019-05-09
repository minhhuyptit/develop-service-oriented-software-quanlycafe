package dao;

import com.google.gson.Gson;
import connect.SVConnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cart;

public class CartDAO {

    //Xuat ra menu cua ban cua thanh toan  hoadon.status = 0
    //--------------------------------------------------------------------------OK
    public static Cart getCart(int id_ban) {
        Cart cart = new Cart();
        SVConnect connect = new SVConnect();
        String url = connect.urlAPI + "table/" + id_ban;
        try {
            String result = connect.sendGet(url);
            if(result.equals("TABLE_AVALIABLE")) return cart;
            System.out.println(result);
            Gson gson = new Gson();
            cart = gson.fromJson(result, Cart.class);
        } catch (Exception e) {
            System.out.println("Loi get cart khong thanh cong: "+ e);
        }
        return cart;
    }
    
    //--------------------------------------------------------------------------OK
    public static boolean saveCart(int id_ban, Cart cart, int idNV) {
        SVConnect connect = new SVConnect();
        String url = connect.urlAPI + "bill";
        Gson gson = new Gson();
        String cartJson = gson.toJson(cart, Cart.class);
        String para = "id_table=" + id_ban + "&id_user=" + idNV + "&cart=" + gson.toJson(cart, Cart.class);
        System.out.println("-----------");
        System.out.println(gson.toJson(cart, Cart.class));
         //System.out.println(para);
        try {
            String result = connect.sendPost2(url, para);
            System.out.println("1111" + result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //-----------------------------------------------------------------------------OK
    public static String payCart(int id_ban, int idNV){
        SVConnect connect = new SVConnect();
        
        String url = connect.urlAPI + "bill/" + id_ban + "?id_user="+idNV;
        System.out.println(url);
        String result=null;
        try {
            result = connect.sendPut(url);
        } catch (Exception e) {
            System.out.println("Loi Pay cart khong thanh cong: "+ e);
        }
        return result;
    }
    
    public static void main(String[] args) {
        
//        System.out.println(price);
    }
}

