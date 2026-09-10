package Problems.VendingMachine;

public class UPI implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying via UPI amount: " + amount);
    }
    
}
