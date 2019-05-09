package model;

import java.util.HashMap;
import java.util.Map;

//Chua danh sach cac mon nuoc ma ban da goi
public class Cart {
    public HashMap<String, Item> cartItem;

    public Cart() {
        cartItem = new HashMap<>();
    }

    public Cart(HashMap<String, Item> cartItem) {
        this.cartItem = cartItem;
    }

    public HashMap<String, Item> getCartItem() {
        return cartItem;
    }

    public void setCartItem(HashMap<String, Item> cartItem) {
        this.cartItem = cartItem;
    }
    
    //Goi them 1 mon nuoc vao ban
    public void plusToCart(String key, Item item){
        boolean check = cartItem.containsKey(key); //Kiểm tra xem có key trong danh sách hay không
        if(check){
            int slbandau=item.getQuantity();
            item.setQuantity(slbandau+1);
            cartItem.put(key, item);                //Thêm vào danh sách, nếu trùng key thì đè vô
        }else {
            cartItem.put(key, item);
        }
    }
    
    public void plusToCart(String key, Item item, int sl){
        boolean check = cartItem.containsKey(key); //Kiểm tra xem có key trong danh sách hay không
        if(check){
            int slbandau=item.getQuantity();
            item.setQuantity(slbandau+sl);
            cartItem.put(key, item);                //Thêm vào danh sách, nếu trùng key thì đè vô
        }else {
            cartItem.put(key, item);
        }
    }
    
    public void subToCart(String key, Item item){
        boolean check = cartItem.containsKey(key); //Kiểm tra xem có key trong danh sách hay không
        if(check){
            int slbandau=item.getQuantity();
            if(slbandau<=1) cartItem.remove(key);   //Nếu còn dưới 1 sản phẩm thì xóa khỏi map
            else{
                item.setQuantity(slbandau-1);
                cartItem.put(key, item);
            } 
        }
    }
    
    public double sumTotal(){
        double total =0;
        double giatungsp =0;
        for(Map.Entry<String, Item> list: cartItem.entrySet()){
            giatungsp =(list.getValue().getQuantity()*list.getValue().getProduct().getPrice())
                    - (list.getValue().getQuantity()* list.getValue().getProduct().getPrice()* list.getValue().getDiscount())/100;
            total += giatungsp;
        }
        return total;
    }
    
    public void setChietKhau(int ck, String key, Item item){
        boolean check = cartItem.containsKey(key);
        if(check){
            item.setDiscount(ck);
        }
    }
}
