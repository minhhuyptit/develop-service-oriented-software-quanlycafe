
package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import connect.SVConnect;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
//import mode.Ban;
import model.Table;

public class TableDAO {
    String a="<button class=\"<%=ban.isTrangThai() ? \"xanh\" : \"do\"%>\"></button>";
    //--------------------------------------------------------------------------OK
    //lay danh sach ban qua id khu
    public static ArrayList<Table> listBan(int idKhuVuc){
        ArrayList<Table> listban = null;
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "area/" + idKhuVuc;
        try {
            String result = connect.sendGet(url);
            System.out.println(result);
            Gson gson = new Gson();
            listban = gson.fromJson(result, new TypeToken<ArrayList<Table>>(){}.getType());
            System.out.println(listban.toString());
            return listban;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;        
    }
    
    //--------------------------------------------------------------------------OK
    public static boolean addBan(int idKhuVuc, String tenBan, int soCho){
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "table";
        String param = "name=" + tenBan + "&seat=" + soCho + "&id_area=" + idKhuVuc;
        try {
            String result = connect.sendPost2(url, param);
            System.out.println(result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;      
    }
    
    //Xoa ban-------------------------------------------------------------------OK 
    public static boolean deleteBan(int idban){
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "table/" + idban;
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
    public static boolean updateBan(int id, String tenban){
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "table/" + id;
        String param = "name=" + tenban;
        try {
            String result = connect.sendPut(url, param);
            System.out.println(result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;  
    }
   
    public static void main(String[] args) {
//        ArrayList<Ban1> listBan(1);
    }
}
