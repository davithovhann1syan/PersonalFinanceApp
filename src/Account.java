public class Account {
    private int id;
    private String name;
    private AccountType type; // Enum for Checking, Savings, Investment, etc.
    private double balance;

    public enum AccountType {
        CHECKING,
        SAVINGS,
        INVESTMENT
    }


    // Getters and setters for attributes

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {

        balance -= amount;
    }

    public void transfer(Account toAccount, double amount)  {
        withdraw(amount);
        toAccount.deposit(amount);
    }
}
