package Structural_Patterns.AdapterPattern.AdapterPractice2;

public class Adapter implements Target {   
      private Adaptee adaptee;
      public Adapter(Adaptee adaptee) {
          this.adaptee = adaptee;
      }

      @Override
      public void pay(double amount) {
        adaptee.makePayment(amount);
      }
}
