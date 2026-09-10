package Behavioral_Patterns.StrategyPattern;

public class CreditCardPaymentStrategy implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via CreditCardPaymentStrategy");
    }
}
