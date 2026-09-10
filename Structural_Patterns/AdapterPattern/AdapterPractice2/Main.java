package Structural_Patterns.AdapterPattern.AdapterPractice2;

public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.pay(100.0);
    }
}
