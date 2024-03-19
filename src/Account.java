public class Account {
    private int id;
    private String name;
    private String type;
    private double balance;
    private User user;

    public Account(String name, String type, User user) {
        this.name = name;
        this.type = type;
        this.balance = 0.0;
        this.user = user;
    }

    public void addTransaction(Transaction transaction) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Getters, setters for remaining attributes and methods for transferring funds
}