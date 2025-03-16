public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactoryMethods();
        Transaction transaction = new Transaction("HSKL61", 140.0);
        PaymentMethod paymentMethod = paymentFactory.createPaymentmethod("paypal");
        paymentMethod.processPayment(transaction.getAmount());
        transaction.completePayment();
        System.out.println("Transaction Status: " + transaction.getStatus());
    }
}