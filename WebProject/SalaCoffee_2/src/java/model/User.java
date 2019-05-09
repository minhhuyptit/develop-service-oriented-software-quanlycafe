
package model;

public class User {
    private int id;
    private String username;
    private String fullname;
    private String phone;
    private String image;
    private String salary;
    private short access_level;

    public User(int id, String username, String fullname, String phone, String image, String salary, short access_level) {
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.phone = phone;
        this.image = image;
        this.salary = salary;
        this.access_level = access_level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }
    
    public String getName() {
        int i=fullname.length();
        System.out.println(i);
        while(fullname.charAt(--i)!=' ' && i>0);
        if(i==0) return fullname;
        else return fullname.substring(i+1);
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public short getAccess_level() {
        return access_level;
    }

    public void setAccess_level(short access_level) {
        this.access_level = access_level;
    }

    
    
    @Override
    public String toString() {
        return id + " " + username + " " + fullname + " " + phone + " " + image + " " + salary + " " + access_level;
    }
    
}
