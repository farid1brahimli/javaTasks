public class ElectronicsProduct {
    String name;
    int productId;
    double price;

    public ElectronicsProduct(String name, int productId, double price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

   public void applyDiscount(int percent){
        price = price - (price * percent / 100);
   }

   public double getFinalPrice(){
        return price;
   }
}
