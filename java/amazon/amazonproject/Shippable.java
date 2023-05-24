package amazonproject;

public class Shippable implements ShippableInterface {

    int trackingNumber;
    private Product product;
    private String shippedProductStatus;

    public Shippable() {

    }

    public Shippable(int trackingNumber, Product product, String shippedProductStatus) {
        this.trackingNumber = trackingNumber;
        this.product = product;
        this.shippedProductStatus = shippedProductStatus;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShippedProductStatus() {
        return shippedProductStatus;
    }

    public void setShippedProductStatus(String shippedProductStatus) {
        this.shippedProductStatus = shippedProductStatus;
    }

    @Override
    public void generateTrackingNumberForTheOrder(User user) {
        for (int i = 0; i < user.orderList.size(); i++) {
            Shippable newsh = new Shippable(this.getRandomNumber(), user.orderList.get(i), "shipped");
            // user.orderList.get(i).setStatus("shipped");
            newsh.setShippedProductStatus("shipped");
            
            System.out.println(newsh);

        }
    }

    public int getRandomNumber() {
        double num = Math.random();
        int myRandInt = (int) (num * 100 + 1);
        return myRandInt;
    }

    // public void removeCartItems(User user,Cart cart){
    // for(int i =0; i<user.orderList.size(); i++){
    // if(user.placeOrder(cart) == true && user.orderList.get(i).getStatus() ==
    // "shipped" ){
    // cart.productsInCart.removeAll(cart.productsInCart);
    // }
    // }
    // }

    @Override
    public String toString() {
        return "Shippable [trackingNumber=" + trackingNumber + ", product=" + product + ", shippedProductStatus="
                + shippedProductStatus + "]";
    }

}
