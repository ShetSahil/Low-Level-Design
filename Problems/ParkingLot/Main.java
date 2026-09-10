package Problems.ParkingLot;


import Problems.VendingMachine.UPI;

public class Main {

    public static void main(String[] args) {

        ParkingLotManager manager =
                new ParkingLotManager();

        // Level 1
        Level level1 = new Level(1);

        level1.addSpot(
                new ParkingSpot(1, VehicleType.CAR)
        );

        level1.addSpot(
                new ParkingSpot(2, VehicleType.BIKE)
        );

        level1.addSpot(
                new ParkingSpot(3, VehicleType.TRUCK)
        );

        manager.addLevel(level1);

        // Vehicle
        Vehicle car = new Car("MH01AB1234");

        // Park
        Ticket ticket = manager.parkVehicle(car);

        // Show available spots
        manager.showAvailableSpots();

        // Exit
        if (ticket != null) {

            manager.exitVehicle(
                    ticket.getTicketID(),
                    new UPIPaymentStrategy()
            );
        }

        // Show spots again
        manager.showAvailableSpots();
    }
}