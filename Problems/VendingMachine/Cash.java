package Problems.VendingMachine;

public class Cash  implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying cash amount: " + amount);
    }
    
}
