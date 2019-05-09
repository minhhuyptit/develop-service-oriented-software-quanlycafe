package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import connect.SVConnect;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

public class ProductDAO {

    //--------------------------------------------------------------------------OK
    public static boolean addSanPham(String idSanPham, String idDanhMuc, String tenSanPham, Double giaSanPham, String ghiChu) {
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "product";
        String param = "id=" + idSanPham + "&name=" + tenSanPham + "&price=" + giaSanPham + "&description=" + ghiChu + "&id_category=" + idDanhMuc;
        try {
            String result = connect.sendPost2(url, param);
            System.out.println(result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Xoa sanphan--------------------------------------------------------------OK
    public static boolean deleteSanPham(String id) {
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "product/" + id;
        try {
            String result = connect.sendDelete(url);
            System.out.println(result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //--------------------------------------------------------------------------OK
    public static boolean updateSanPham(String id, String ten, Double gia, String ghichu) {
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "product/" + id;
        String param = "name=" + ten + "&price=" + gia + "&description=" + ghichu;
        try {
            String result = connect.sendPut(url, param);
            System.out.println(result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //--------------------------------------------------------------------------OK
    //Lay danh sach san pham qua id danh muc
    public static ArrayList<Product> listSanPham(String idDanhMuc) {
        ArrayList<Product> listProduct = null;
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "category/" + idDanhMuc;
        try {
            String result = connect.sendGet(url);
            System.out.println(result);
            Gson gson = new Gson();
            listProduct = gson.fromJson(result, new TypeToken<ArrayList<Product>>() {}.getType());
            System.out.println(listProduct.toString());
            return listProduct;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Lay thong tin san pham qua id san pham
    public static Product getSanPham(String id, ArrayList<Product> product) {
        for (Product sanpham : product) {
            if (sanpham.getId().equals(id)) {
                return sanpham;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ProductDAO listSanPhamDAO = new ProductDAO();
        ArrayList<Product> listsanpham = listSanPham("st");
        for (Product sp : listsanpham) {
            System.out.println(sp.getName() + " " + String.format("%,d",(int)(sp.getPrice())));
        }
    }
}
