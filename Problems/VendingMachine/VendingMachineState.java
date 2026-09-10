package Problems.VendingMachine;

public interface VendingMachineState {
    void selectProduct(String product, VendingMachine vendingMachine);
    void pay(int amount, PaymentStrategy paymentStrategy, VendingMachine vendingMachine);
    void dispenseProduct(VendingMachine vendingMachine);
}
