package Problems.ParkingLot;

public class ParkingSpot {
    private int spotId;
    private VehicleType vehicleType;
    private Vehicle vehicle;

    public ParkingSpot(int spotId , VehicleType vehicleType){
        this.spotId=spotId;
        this.vehicleType=vehicleType;
    }

    public boolean isSpotAvailable(){
        return vehicle==null;
    }

    public boolean canPark(Vehicle vehicle){
        return vehicleType==vehicle.getVehicleType();
    }

    public void parkvehicle(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    public void removeVehicle(){
        this.vehicle=null;
    }
    public int getSpotId(){
        return spotId;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }
}
