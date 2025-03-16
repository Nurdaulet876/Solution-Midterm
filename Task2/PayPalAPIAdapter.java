public class PayPalAPIAdapter implements PaymentMethod{
    private ExternalPayPalService externalPayPalService;
    public PayPalAPIAdapter(ExternalPayPalService externalPayPalService){
        this.externalPayPalService = externalPayPalService;
    }
    public void processPayment(double amount){
        externalPayPalService.makePayment(amount);
    }
}
