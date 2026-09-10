package Problems.ParkingLot;
import java.util.*;
public class ParkingLotManager {
    private List<Level> levels;
    HashMap<String,Ticket> activeTickets;
    public ParkingLotManager(){
        this.levels=new ArrayList<>();
        this.activeTickets=new HashMap<>();
    }

    public void addLevel(Level level) {
        levels.add(level);
    }

    public Ticket parkVehicle(Vehicle vehicle){
        ParkingSpot availableSpot = null;

        //find if slot is available on each level on by one
        for(Level level : levels){
            availableSpot= level.findAvailableSpot(vehicle);
                if(availableSpot!=null) break;
        }

        if(availableSpot==null){
            System.out.println("Parking Slots are full for : "+ vehicle.getVehicleType());
        }

        availableSpot.parkvehicle(vehicle);
        String ticketId = UUID.randomUUID().toString();
        Ticket ticket = new Ticket(ticketId,vehicle,availableSpot);

        activeTickets.put(ticketId,ticket);

        System.out.println(
                "Vehicle " + vehicle.getVehicleNumber()
                + " parked at Spot "
                + availableSpot.getSpotId()
        );

        System.out.println("Ticket ID: " + ticketId);

        return ticket;
    }
    public void exitVehicle(String ticketId , PaymentStrategy paymentStrategy){
        Ticket ticket = activeTickets.get(ticketId);

        ticket.setExitTime();

        long getTotalParkingTime = ticket.getParkingHours();

        if (getTotalParkingTime == 0) {
            getTotalParkingTime = 1;
        }

        double amount = getTotalParkingTime * 50;

        ticket.setAmount(amount);

        ticket.getParkingSpot().removeVehicle();

        paymentStrategy.pay(amount);

        System.out.println(
                "Vehicle " +
                ticket.getVehicle().getVehicleNumber() +
                " exited successfully."
        );

    }

    public void showAvailableSpots() {

        for (Level level : levels) {

            System.out.println(
                    "Level " + level.getLevelNumber()
            );

            level.ShowAllAvailableSpot();
        }
    }

}
