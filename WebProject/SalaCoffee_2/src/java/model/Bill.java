package model;

import java.sql.Timestamp;
import java.util.Date;

public class Bill {
    private long idHoaDon;
    private int idBan;
    private Timestamp gioVao;
    private Timestamp gioRa;
    Date date=java.util.Calendar.getInstance().getTime();  
//    System.out.println(date); 
    private boolean status;
    private double tongTien;
    private String UserOrder;
    private String UserPay;

    public Bill() {
    }

    public Bill(long idHoaDon, int idBan, Timestamp gioVao, Timestamp gioRa, boolean status, double tongTien) {
        this.idHoaDon = idHoaDon;
        this.idBan = idBan;
        this.status = status;
        this.tongTien = tongTien;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
    public Bill(long idHoaDon, int idBan, Timestamp gioVao, Timestamp gioRa, boolean status, double tongTien, String order, String pay) {
        this.idHoaDon = idHoaDon;
        this.idBan = idBan;
        this.status = status;
        this.tongTien = tongTien;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.UserOrder = order;
        this.UserPay = pay;
    }
    

    public long getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(long idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdBan() {
        return idBan;
    }

    public void setIdBan(int idBan) {
        this.idBan = idBan;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Timestamp getGioVao() {
        return gioVao;
    }

    public void setGioVao(Timestamp gioVao) {
        this.gioVao = gioVao;
    }

    public Timestamp getGioRa() {
        return gioRa;
    }

    public void setGioRa(Timestamp gioRa) {
        this.gioRa = gioRa;
    }
    
    
//    public static void main(String[] args) {
//        Date now = new Date();
//        Timestamp timestamp = new Timestamp(now.getTime());
//        System.out.println(now);
//        System.out.println(timestamp);
//        
//    }

    public String getUserOrder() {
        return UserOrder;
    }

    public void setUserOrder(String UserOrder) {
        this.UserOrder = UserOrder;
    }

    public String getUserPay() {
        return UserPay;
    }

    public void setUserPay(String UserPay) {
        this.UserPay = UserPay;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "idHoaDon=" + idHoaDon + ", idBan=" + idBan + ", gioVao=" + gioVao + ", gioRa=" + gioRa + ", date=" + date + ", status=" + status + ", tongTien=" + tongTien + ", UserOrder=" + UserOrder + ", UserPay=" + UserPay + '}';
    }

}
