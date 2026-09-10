package Structural_Patterns.AdapterPattern.AdapterPractice1;

public class LegacyFunction {
    String amount;
    String pincode;

    public LegacyFunction(String amount, String pincode) {
        this.amount = amount;
        this.pincode = pincode;
    }
    public LegacyFunction() {
    }

    public void display(){
        System.out.println("Amount: " + amount + " Pincode: " + pincode);
    }
}
