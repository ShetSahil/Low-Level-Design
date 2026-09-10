package Problems.VendingMachine;

public class PaymentPendingState implements VendingMachineState {
    public void selectProduct(
        String product,
            VendingMachine machine
            ) {

        System.out.println(
            "Complete current transaction first."
        );
    }
    public void pay(int amount, PaymentStrategy paymentStrategy , VendingMachine machine){
        paymentStrategy.pay(amount);
        machine.addAmount(amount);
        System.out.println(
            "Additional amount inserted: Rs:" + amount
        );
    }

    public void dispenseProduct(VendingMachine machine){
        String product = machine.getSelectedProduct();
        if(!machine.getInventory().amountPayable(product,machine.getTotalAmount())){
            System.out.println(
                "Insufficient funds."
            );

            return;
        }
        machine.setState(new DispensingState());
        machine.dispense();
    }

    
}
