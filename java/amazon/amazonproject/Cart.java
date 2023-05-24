package amazonproject;

import java.util.ArrayList;

public class Cart implements CartInterface {

    ArrayList<Product> productsInCart = new ArrayList<>();

    public ArrayList<Product> getproductsInCart() {
        return productsInCart;
    }

    public void setproductsInCart(ArrayList<Product> productsInCart) {
        this.productsInCart = productsInCart;
    }

    @Override
    public double getTotalPrice() {
        double sum = 0;
        for (Product produts : this.productsInCart) {
            sum += produts.getPrice() * produts.getQuantity();
        }
        return sum;
    }

    public void removeCartItems(User user) {
        this.productsInCart.removeAll(productsInCart);
    }

    // public void removeCartItems(User user) {
    // if(user.placeOrder(this) == true){
    // for(Product prd: user.orderList){
    // this.productsInCart.remove(prd);
    // System.out.println("item removed");
    // }

    // }
    // System.out.println("item is not removed");
    // }

}
