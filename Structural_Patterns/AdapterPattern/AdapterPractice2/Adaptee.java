package Structural_Patterns.AdapterPattern.AdapterPractice2;

public class Adaptee {
    public void makePayment(double amount) {
        System.out.println("Payment of " + amount);
    }
}
