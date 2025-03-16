public class MockPayPalService implements ExternalPayPalService{
    public void makePayment(double amount){
        System.out.println("Mock PayPal payment of $" + amount);
    }
}
