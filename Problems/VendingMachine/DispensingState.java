package Problems.VendingMachine;

public class DispensingState implements VendingMachineState {
     public void selectProduct(
            String product,
         VendingMachine machine) {

        System.out.println(
            "Please wait. Dispensing product."
        );
    }

    @Override
    public void pay(
            int amount,
        PaymentStrategy paymentStrategy,
        VendingMachine machine) {

        System.out.println(
            "Please wait. Product is being dispensed."
        );
    }

    @Override
    public void dispenseProduct(
            VendingMachine machine) {

        machine.dispense();
    }
}
