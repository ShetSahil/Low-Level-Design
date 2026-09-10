package Problems.ParkingLot;

public class UPIPaymentStrategy  implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("Paying the Parking amount Rs.:"+amount + " by UPI");
    }
}
