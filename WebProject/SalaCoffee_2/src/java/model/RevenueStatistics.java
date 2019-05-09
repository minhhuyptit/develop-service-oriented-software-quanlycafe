
package model;

import java.util.ArrayList;

public class RevenueStatistics {
    ArrayList<Stats> listStast;

    public RevenueStatistics() {
        listStast = null;
    }

    
    public RevenueStatistics(ArrayList<Stats> listStast) {
        this.listStast = listStast;
    }

    public ArrayList<Stats> getListStast() {
        return listStast;
    }

    public void setListStast(ArrayList<Stats> listStast) {
        this.listStast = listStast;
    }


    @Override
    public String toString() {
        String s="";
        for(Stats stast: listStast){
            s+= stast.getName() + " " + stast.getPrice() + " " + stast.getQuantity() + " " + stast.getDiscount();
        }
        return s; //To change body of generated methods, choose Tools | Templates.
    }
    
}
