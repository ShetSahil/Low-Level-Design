package Problems.VendingMachine;

public class VendingMachine {
    private Inventory inventory;
    private int totalAmount;
    private String selectedProduct;
    private VendingMachineState state;
    VendingMachine(Inventory inventory){
        this.inventory= inventory;
        this.totalAmount=0;
        this.state=new IdleState();
    }
    public Inventory getInventory(){
        return inventory;
    }
    public void setSelectedProduct(String product){
        this.selectedProduct=product;
    }
    public void setState(VendingMachineState state){
        this.state=state;
    }
    public void addAmount(int amount){
        totalAmount+=amount;
    }
    public String getSelectedProduct(){
        return selectedProduct;
    }
    public int getTotalAmount(){
        return totalAmount;
    }
    public void findProductsInVendingMachine(){
        inventory.allProducts();
    }

    public void selectProduct(String product){
        state.selectProduct(product,this);
    }

    public void pay(int amount,PaymentStrategy paymentStrategy){
        state.pay(amount, paymentStrategy, this);
    }

    public void buyProduct(){
        state.dispenseProduct(this);
    }
     
    public void dispense(){
        String product = selectedProduct;

        inventory.getProduct(product);
        int change=inventory.returnChange(product, totalAmount);
        System.out.println(
            "Dispensing product: " + product
        );

        System.out.println(
            "Change returned: ₹" + change
        );
        
        totalAmount=0;
        selectedProduct=null;
        state= new IdleState();
    }

}
