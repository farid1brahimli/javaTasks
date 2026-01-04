import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(BigDecimal balance) {
        super(balance);
    }

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) < 0) {
            System.out.println("Not enough balance!");
        } else {
            balance = balance.subtract(amount);
        }
    }
}
