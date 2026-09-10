package Problems.VendingMachine;

public class ProductSelectedState implements VendingMachineState{
    public void selectProduct(
            String product,
            VendingMachine machine) {

        System.out.println(
            "Product already selected."
        );
    }

    public void pay(int amount,
            PaymentStrategy paymentStrategy,
            VendingMachine machine){
        
        paymentStrategy.pay(amount);
        machine.addAmount(amount);
        System.out.println(
            "Amount inserted: ₹" + amount
        );
        
        machine.setState(new PaymentPendingState());
    }

    public void dispenseProduct(
            VendingMachine machine) {

        System.out.println(
            "Please make payment first."
        );
    }
    
}
