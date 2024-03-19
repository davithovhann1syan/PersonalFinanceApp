import java.util.List;

public class Calculator {

    public static double calculateTotalByCategory(List<Transaction> transactions, Category category) {
        double total = 0.0;
        for (Transaction transaction : transactions) {
            if (transaction.getCategory().equals(category)) {
                total += transaction.getAmount();
            }
        }
        return total;
    }

}