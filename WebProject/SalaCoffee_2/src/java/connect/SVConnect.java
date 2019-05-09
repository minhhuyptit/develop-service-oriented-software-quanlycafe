package connect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;

public class SVConnect {

    public static String urlAPI = "http://192.168.43.196:7777/quanlycafe/public/api/";

    //------------------------Login
    static final String EMPTY_USERNAME = "EMPTY_USERNAME";
    static final String EMPTY_PASSWORD = "EMPTY_PASSWORD";
    static final String LOGIN_FAIL = "LOGIN_FAIL";

    //------------------------area
    static final String AREA_NOT_FOUND = "AREA_NOT_FOUND";
    static final String EMPTY_NAME = "EMPTY_NAME";
    static final String IDENTICAL_NAME = "IDENTICAL_NAME";
    static final String SUCCESS = "SUCCESS";
    static final String FAIL = "FAIL";
    static final String FK_EXIST_ANOTHER_TABLE = "FK_EXIST_ANOTHER_TABLE";
    //------------------------table
    static final String EMPTY_SEAT = "EMPTY_SEAT";

    //Truy xuat tai nguyen------------------------------------------------------OK
    public String sendGet(String urlAPI) throws Exception {
        URL obj = new URL(urlAPI);               //tao url tu tham so String truyen vao
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();   //tao doi tuong HttpURLConnection 
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer result = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            result.append(inputLine);
        }
        in.close();
        return result.toString();
    }

    public String sendPut(String urlAPI) throws Exception {
        URL obj = new URL(urlAPI);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("PUT");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer result = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            result.append(inputLine);
        }
        in.close();
        return result.toString();
    }

    //Thay đổi trạng thai hoac cap nhat tai nguyen -----------------------------OK
    public String sendPut(String urlAPI, String params) throws Exception {
        URL url = new URL(urlAPI);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        url.openConnection();
        con.setRequestMethod("PUT");
        con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        con.setRequestProperty("Accept", "application/json");
        //con.setRequestProperty("Accept", "text/json");
        con.setDoOutput(true);
        con.setDoInput(true);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(con.getOutputStream(), "UTF-8"));
        bw.write(params);
        bw.flush();
        bw.close();

        InputStream is = con.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        String line;
        StringBuffer response = new StringBuffer();
        while ((line = rd.readLine()) != null) {
            response.append(line);
        }
        rd.close();
        return response.toString();
    }

    //Huy bo hoac xoa tai nguyen -----------------------------------------------OK
    public String sendDelete(String urlAPI) throws Exception {
        URL obj = new URL(urlAPI);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("DELETE");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer result = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            result.append(inputLine);
        }
        in.close();
        return result.toString();
    }

    //De tao 1 tai nguyen tren may chu------------------------------------------OK
    public String sendPost2(String urlAPI, String params) throws Exception {
        URL url = new URL(urlAPI);                                          //Khai bao ket noi voi api 
        HttpURLConnection con = (HttpURLConnection) url.openConnection();   //mo 1 ket noi toi 1 tai nguyen xác dinh boi url

        //Cau hinh------------------------------------
        //Add request header
        con.setRequestMethod("POST");         //Set phuong thuc cho request => post      
        con.setRequestProperty("Accept", "text/json");   //chi dinh kieu du lieu gui di duoi dang json
        con.setDoOutput(true);               //khai bao ket noi duoc su dung cho dau ra - gia tri mac dinh la true                               
        con.setDoInput(true);

        //Tao luong gui request------------------------
        OutputStream out = con.getOutputStream();   //lấy 1 luồng xuất và ghi dữ liệu
        // Tạo một Character Stream (luồng ghi ký tự) bao lấy OutputStream ở trên Mã hóa (encoding) là UTF-8.
        Writer writer = new OutputStreamWriter(out, "UTF-8");
        // Tạo một đối tượng BufferedWriter bằng cách gói (wrap) một đối tượng Writer khác.
        BufferedWriter bw = new BufferedWriter(writer); //BufferedWriter là một lớp con trực tiếp của lớp Writer.
        bw.write(params);
        bw.flush();
        bw.close();

        //Tao luong nhan response------------------------
        //lấy 1 luồng nhập và đọc dữ liệu
        InputStream in = con.getInputStream();
        // Tạo một Character stream (luồng doc ký tự) với mã hóa (encoding) là UTF-8.
        Reader reader = new InputStreamReader(in, "UTF-8");
        BufferedReader rd = new BufferedReader(reader);
        String line;
        StringBuffer response = new StringBuffer();
        // Đọc từng dòng (line) dữ liệu. Nếu đọc được null nghĩa là kết thúc Stream.
        while ((line = rd.readLine()) != null) {
            response.append(line);
        }
        rd.close();
        return response.toString();
    }

    public static void ReadHeader(HttpURLConnection httpURLConnection) {
        for (int i = 0; i < httpURLConnection.getHeaderFields().size(); i++) {
            System.out.println(httpURLConnection.getHeaderFieldKey(i) + " : " + httpURLConnection.getHeaderField(i));
        }
    }

    public static void main(String[] args) throws IOException, Exception {
        SVConnect connect = new SVConnect();
        String r = connect.sendGet(connect.urlAPI + "table/1");
        System.out.println(r);
//        URL url = new URL("https://www.google.com.vn/");
//        HttpURLConnection con = (HttpURLConnection) url.openConnection();
//        con.setRequestMethod("GET");       //Set phuong thuc cho request => post
////        con.setRequestProperty("Accept", "text/json");      //chi dinh kieu du lieu gui di duoi dang json
////        con.setDoOutput(true);
////        con.setDoInput(true);
//        
//        ReadHeader(con);
    }
}
