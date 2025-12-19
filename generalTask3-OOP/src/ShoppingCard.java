public class ShoppingCard {
    CardItem[] items;
     int count;

     public ShoppingCard(int size) {
         items = new CardItem[size];
         count = 0;
     }

     public void addItem(Product product, int quantity) {
         if(count < items.length) {
             items[count] = new CardItem(product, quantity);
             count++;
         } else {
             System.out.println("There is more items in your shopping card");
         }
     }
    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getTotalPrice();
        }
        return total;
    }
}
