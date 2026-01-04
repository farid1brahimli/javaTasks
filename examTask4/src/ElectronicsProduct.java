public class ElectronicsProduct implements Discount {
    String name;
    int productId;
    int price;
    public ElectronicsProduct(String name, int productId, int price) {
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    @Override
    static  void discount(){
    }
}
