import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {
    private BigDecimal withdrawlimit = new BigDecimal("500");

    public SavingsAccount(BigDecimal balance) {
        super(balance);
    }
    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(withdrawlimit) < 0) {
            System.out.println("Not enough balance!");
        } else if (amount.compareTo(withdrawlimit) > 0) {
            System.out.println("Withdrawal limit exceeded!");
        } else  {
            balance = balance.subtract(amount);
        }
    }
}
