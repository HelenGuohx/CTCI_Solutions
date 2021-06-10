package Ch07_ObjectOrientedDesign.ParkingLot;

import java.util.List;

/**
 * @author: haixuanguo
 * @date: 4/24/21 11:19 PM
 */
public class ParkingLot {
    private Level[] levels;
    public final int NUM_LEVEL = 3;


    public ParkingLot(){
        this.levels = new Level[NUM_LEVEL];
        for(int i = 0; i < NUM_LEVEL; i++){
            this.levels[i] = new Level(i);
        }
    }

    public boolean parkingVehicle(Vehicle v){
        for(Level level: levels){
            List<Spot> parkingSpots = level.findVacantSpot(v);
            if(parkingSpots != null){
                level.parkVehicle(v);
                v.parkInSpot(parkingSpots);
                for(Spot spot: parkingSpots){
                    spot.setVehicle(v);
                }
                return true;
            }
        }
        return false;
    }

    public void clearVehicle(Vehicle v){
        int floor = -1;
        for(Spot spot: v.parkingSpots){
            if(floor == -1){
                floor = spot.getLevel();
                levels[floor].removeVehicle(v);
            }
            spot.removeVehicle();

        }
        v.leaveSpot();


    }

}
