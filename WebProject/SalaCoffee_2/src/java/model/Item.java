
package model;

public class Item {
    private Product product;
    private int quantity;
    private int discount;

    public Item(Product product, int quantity, int discount) {
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
    }

     public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.discount = 0;
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    
}
