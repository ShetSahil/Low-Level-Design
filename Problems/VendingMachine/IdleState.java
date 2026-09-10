package Problems.VendingMachine;

public class IdleState  implements VendingMachineState {
    public void selectProduct(String product , VendingMachine machine){
        if(!machine.getInventory().productAvailable(product)){
            System.out.println("Product not available");
            return;
        }
        machine.setSelectedProduct(product);
        System.out.println("Product selected "+ product );

        machine.setState(new ProductSelectedState());
    }
    public void pay(
            int amount,
            PaymentStrategy paymentStrategy,
            VendingMachine machine) {

        System.out.println(
            "Please select a product first."
        );
    }

    @Override
    public void dispenseProduct(
            VendingMachine machine) {

        System.out.println(
            "Please select a product first."
        );
    }
}
