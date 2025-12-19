public class CardItem {
    Product product;
    int quantity;

    public CardItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getTotalPrice(){
        return product.getPrice() * quantity;
    }
}
