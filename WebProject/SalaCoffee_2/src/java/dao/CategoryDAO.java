package dao;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import connect.SVConnect;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;

public class CategoryDAO {
    
    //---------------------------------------------------------------------------OK
    //Lay danh sach toan bo danh muc
    public static ArrayList<Category> listDanhMuc(){
        ArrayList<Category> listCategory = null;
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "category";
        try {
            String result = connect.sendGet(url);
            System.out.println(result);
            Gson gson = new Gson();
            listCategory = gson.fromJson(result, new TypeToken<ArrayList<Category>>(){}.getType());
            System.out.println(listCategory.toString());
            return listCategory;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    
    //--------------------------------------------------------------------------OK
    public static boolean addDanhMuc(String idDanhMuc, String tenDanhMuc){
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "category";
        String param = "id=" + idDanhMuc + "&name=" + tenDanhMuc;
        try {
            String result = connect.sendPost2(url, param);
            System.out.println(result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;        
    }
    
    //--------------------------------------------------------------------------OK
    public static boolean updateDanhMuc(String id, String tendanhmuc){
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "category/" + id;
        String param = "name=" + tendanhmuc;
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
    public static boolean deleteDanhMuc(String iddanhmuc){
         SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "category/" + iddanhmuc;
        try {
            String result = connect.sendDelete(url);
            System.out.println(result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;  
    }
    public static void main(String[] args) {
        CategoryDAO danhMucDao = new CategoryDAO();
        danhMucDao.listDanhMuc();
    }
}
