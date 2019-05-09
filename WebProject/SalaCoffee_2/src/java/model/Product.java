
package model;

public class Product {
    String id;
    String name;
    double price;
    String description;
    String id_category;

    public Product(String id, String id_category, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.id_category = id_category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId_category() {
        return id_category;
    }

    public void setId_category(String id_category) {
        this.id_category = id_category;
    }

    

    @Override
    public String toString() {
        return id + " " + name + " " + price + " " + description + " " + id_category; 
    }
}
