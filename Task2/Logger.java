import java.util.ArrayList;
import java.util.List;

public class Logger {
    private List<Transaction> transactions = new ArrayList<>();
    public void loggingTransactions(Transaction transaction){
        transactions.add(transaction);
        System.out.println("Transaction logged: " + transaction.getStatus());
    }
    public void getHistory(){
        for(Transaction transaction: transactions){
            System.out.println("Transaction " + transaction.getStatus() + " - Amount: $" + transaction.getAmount());
        }
    }
}
