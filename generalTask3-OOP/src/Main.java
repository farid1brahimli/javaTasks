public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("Telefon", 1200);
        Product p2 = new Product("Qulaqcıq", 100);

        ShoppingCard card = new ShoppingCard(5);

        card.addItem(p1, 1);
        card.addItem(p2, 3);

        System.out.println("Cəmi qiymət: " + card.getTotalPrice());
    }
}
