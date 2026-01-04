import java.math.BigDecimal;

public abstract class BankAccount {
    protected BigDecimal balance;

    public BankAccount(BigDecimal balance) {
        this.balance = balance;
    }

    public abstract void withdraw(BigDecimal amount);
    public abstract void deposit(BigDecimal amount);

    public BigDecimal getBalance() {
        return balance;
    }
}
