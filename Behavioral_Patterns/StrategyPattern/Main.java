package Behavioral_Patterns.StrategyPattern;

public class Main {
    public static void main(String[] args){
        PaymentGateway creditCard = new PaymentGateway(new CreditCardPaymentStrategy());
        PaymentGateway payPal = new PaymentGateway(new PayPalPaymentStrategy());
        PaymentGateway upi = new PaymentGateway(new UPIPaymentStrategy());
        creditCard.pay(1000.00);
        payPal.pay(1000.00);
        upi.pay(1000.00);
    }
}
