package Problems.VendingMachine;

public class Main {

    public static void main(String[] args) {

        // Create products
        Product product1 = new Product("Coke", 10);
        Product product2 = new Product("Pepsi", 20);
        Product product3 = new Product("Fanta", 30);

        // Create inventory
        Inventory inventory = new Inventory();

        inventory.addProductInInventory(product1);
        inventory.addProductInInventory(product2);
        inventory.addProductInInventory(product3);

        inventory.addProductQuantity(product1, 10);
        inventory.addProductQuantity(product2, 10);
        inventory.addProductQuantity(product3, 10);

        // Create vending machine
        VendingMachine vendingMachine =
                new VendingMachine(inventory);

        // Display available products
        vendingMachine.findProductsInVendingMachine();

        // Select product
        vendingMachine.selectProduct("Coke");

        // Pay using Cash
        vendingMachine.pay(
                50,
                new Cash()
        );

        // Buy / dispense product
        vendingMachine.buyProduct();
    }
}