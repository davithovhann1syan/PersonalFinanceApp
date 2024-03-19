import java.util.Date;

public class Transaction {
    private int id;
    private Date date;
    private double amount;
    private String type; // Income or Expense
    private Category category;
    private Account account;
    private String payeePayer; // Optional
    private String note; // Optional

    public Transaction(Date date, double amount, String type, Category category, Account account) {
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.category = category;
        this.account = account;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getPayeePayer() {
        return payeePayer;
    }

    public void setPayeePayer(String payeePayer) {
        this.payeePayer = payeePayer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}