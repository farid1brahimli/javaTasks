public class WashingMachine extends ElectronicsProduct {
    int warrantYears;

    public WashingMachine(String name, int productId, double price, int warrantYears) {
        super(name, productId, price);
        this.warrantYears = warrantYears;
    }

    public void getWarrantYears(int extraWarrantYears) {
        warrantYears += extraWarrantYears;
    }
}
