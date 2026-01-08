//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WashingMachine pr = new WashingMachine("Computer", 1, 2000, 2);

        pr.applyDiscount(20);
        pr.getWarrantYears(2);

        System.out.println("Final price: " + pr.getFinalPrice());
        System.out.println("Warrant years is: " + pr.warrantYears);
    }
}