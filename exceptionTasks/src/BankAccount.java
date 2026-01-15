public class BankAccount {
    private int balance;
    private int drawingPrice;

    public BankAccount(int balance, int drawingPrice) {
        this.balance = balance;
        this.drawingPrice = drawingPrice;
    }
    public void getDrawingPrice() {
        try{
            if(this.balance < this.drawingPrice){
                throw new BalanceOutOfMoney("This money not be exist at balance");
            }
            System.out.println("Balance: " + (this.balance -= this.drawingPrice));
        } catch (BalanceOutOfMoney e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();

        }
    }


}
