
package model;

public class Table {
    public int id;
    public String name;
    public int seat;
    public int status;
    public int id_area;

    public Table(int id, String name, int seat, int status, int id_area) {
        this.id = id;
        this.name = name;
        this.seat = seat;
        this.status = status;
        this.id_area = id_area;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId_area() {
        return id_area;
    }

    public void setId_area(int id_area) {
        this.id_area = id_area;
    }

   
    
    @Override
    public String toString() {
        return id + " " + name + " " + seat + " " + status + " " + id_area; //To change body of generated methods, choose Tools | Templates.
    }
}
