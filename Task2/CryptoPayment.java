public class CryptoPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Processing Crypto payment of $" + amount);
    }
}
