
package model;

public class Stats {
    String id_product;
    String name;
    double price;
    int quantity;
    double discount;

    public Stats(String id_product, String name, int quantity, double price, double discount) {
        this.id_product = id_product;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public String getId_product() {
        return id_product;
    }

    public void setId_product(String id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
