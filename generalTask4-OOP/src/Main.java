import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new SavingsAccount(new BigDecimal("1000"));
        BankAccount account2 = new CheckingAccount(new BigDecimal("1000"));

        account1.withdraw(new BigDecimal("600"));   // limited
        account2.withdraw(new BigDecimal("600"));   // allowed

        System.out.println("Savings balance: " + account1.getBalance());
        System.out.println("Checking balance: " + account2.getBalance());
    }
}
