package Behavioral_Patterns.StrategyPattern;

public class PayPalPaymentStrategy implements PaymentService { 
    
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via PayPalPaymentStrategy");
    }
    
}
