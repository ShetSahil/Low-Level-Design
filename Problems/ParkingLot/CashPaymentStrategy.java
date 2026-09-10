package Problems.ParkingLot;

public class CashPaymentStrategy  implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("Paying the Parking amount Rs.:"+amount + " by Cash");
    }
}
