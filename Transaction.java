public class Transaction {
    private String id;
    private double amount;
    private String status;
    public Transaction(String id, double amount){
        this.id = id;
        this.amount = amount;
        this.status = "pending";
    }
    public void completePayment(){
        this.status = "Payment completed";
    }
    public void failPayment(){
        this.status = "Payment failed";
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
}
