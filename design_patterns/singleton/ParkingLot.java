package design_patterns.singleton;

public class ParkingLot {
    public static ParkingLot instance;
    
    public synchronized ParkingLot getInstance(){
        if(instance==null){
            return new ParkingLot();
        }
        return instance;
    }
}