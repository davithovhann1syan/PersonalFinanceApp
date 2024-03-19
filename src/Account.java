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
}