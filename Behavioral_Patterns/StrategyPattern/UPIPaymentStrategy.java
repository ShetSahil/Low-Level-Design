package Behavioral_Patterns.StrategyPattern;

public class UPIPaymentStrategy implements PaymentService {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " via UPIPaymentStrategy");
    }
}
