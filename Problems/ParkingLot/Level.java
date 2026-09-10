package Problems.ParkingLot;
import java.util.*;

public class Level {
    private int levelNumber;
    private List<ParkingSpot> spots;

    public Level(int levelNumber){
        this.levelNumber=levelNumber;
        spots=new ArrayList<ParkingSpot>();
    }

    public void addSpot(ParkingSpot spot){
        spots.add(spot);
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle){
        for(ParkingSpot spot : spots){
            if(spot.canPark(vehicle)){
                return spot;
            }
        }
        return null;
    }

    public void ShowAllAvailableSpot(){
        for(ParkingSpot spot : spots){
            if(spot.isSpotAvailable()){
                System.out.println("Spot ID: "+spot.getSpotId()+" is available for vehicle type: "+spot.getVehicleType());
            }
        }
    }

    public int getLevelNumber(){
        return levelNumber;
    }


}
