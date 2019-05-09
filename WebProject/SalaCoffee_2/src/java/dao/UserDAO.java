package dao;

import com.google.gson.Gson;
import connect.SVConnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

public class UserDAO {
    //------------------------------------------------------------------------------OK
    public static User login(String userName, String userPass) {
        String url = SVConnect.urlAPI + "login";
        SVConnect connect = new SVConnect();
        String para = "username=" + userName + "&password=" + userPass; 
        try {
            String result = connect.sendPost2(url, para);
            Gson gson = new Gson();
            User user = gson.fromJson(result, User.class);
            System.out.println(user.toString());;
            return user;
        } catch (Exception ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void main(String[] args) {
        login("admin1", "Akai123456");
    }
}

