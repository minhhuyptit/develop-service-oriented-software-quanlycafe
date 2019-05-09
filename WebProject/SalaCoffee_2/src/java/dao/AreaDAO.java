package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import connect.SVConnect;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Area;

public class AreaDAO {

    //Lấy danh sách khu vực-----------------------------------------------------OK
    public static ArrayList<Area> listKhuVuc() {
        ArrayList<Area> listkhuvuc;
        String t = SVConnect.urlAPI + "area";
        SVConnect connect = new SVConnect();
        try {
            String result = connect.sendGet(t);
            System.out.println(result);
            Gson gson = new Gson();
            listkhuvuc = gson.fromJson(result, new TypeToken<ArrayList<Area>>() {
            }.getType());
            return listkhuvuc;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //add khu--------------------------------------------------------------------OK
    public static boolean addKhuVuc(String tenKhuVuc) {
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "area";
        String param = "name=" + tenKhuVuc;
        try {
            String result = connect.sendPost2(url, param);
            System.out.println(result);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    //Xoa khu vuc---------------------------------------------------------------OK
    public static boolean deleteKhuVuc(int idKhuVuc) {
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "area/" + idKhuVuc;
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
    public static boolean updateKhuVuc(int idKhuVuc, String suaTenKV) {
        SVConnect connect = new SVConnect();
        String url = SVConnect.urlAPI + "area/" + idKhuVuc;
        String param = "name=" + suaTenKV;
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
        //deleteKhuVuc(3);
        updateKhuVuc(19, "111 sádfsdf");
    }
}
