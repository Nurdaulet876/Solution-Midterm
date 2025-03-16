public class PaymentFactoryMethods extends PaymentFactory{
    public PaymentMethod createPaymentmethod(String type){
        if(type.equalsIgnoreCase("creditcard")){
            return new CreditCardPayment();
        }else if(type.equalsIgnoreCase("paypal")){
            return new PayPalPayment();
        }else if(type.equalsIgnoreCase("crypto")){
            return new CryptoPayment();
        }
        throw new IllegalArgumentException("Sorry, you can't use this payment method: " + type);
    }
}