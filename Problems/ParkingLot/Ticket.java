package Problems.ParkingLot;
import java.time.LocalDateTime;


public class Ticket {
    private String ticketId;
    private Vehicle vehicle;
    private ParkingSpot spot;

    private double amount;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String ticketId,
                  Vehicle vehicle,
                  ParkingSpot spot) {

        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = LocalDateTime.now();
        this.amount = 0;
    }

    public void setExitTime() {
        this.exitTime = LocalDateTime.now();
    }
    public void setAmount(double amount){
        this.amount=amount;
    }
    public long getParkingHours() {

        return java.time.Duration
                .between(entryTime, exitTime)
                .toHours();
    }
    public double getAmount(){
        return amount;
    }
    public String getTicketID(){
        return ticketId;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public ParkingSpot getParkingSpot(){
        return spot;
    }
}
