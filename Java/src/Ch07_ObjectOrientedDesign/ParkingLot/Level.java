package Ch07_ObjectOrientedDesign.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author: haixuanguo
 * @date: 4/24/21 10:53 PM
 */
public class Level {
    int floor;
    Spot[][] spots;
    int numVacantSpot;
    public static final int ROWS = 4;
    public static final int SPOTS_PER_ROW = 10;

    public Level(int floor){
        this.floor = floor;
        spots = new Spot[ROWS][SPOTS_PER_ROW];

        for(int i = 0; i < ROWS; i++){
            VehicleSize spotSize = i < ROWS / 2 ? VehicleSize.COMPACT: VehicleSize.LARGE;
            for(int j = 0; j < SPOTS_PER_ROW; j++){
                spots[i][j] = new Spot(spotSize, i, j, this.floor);
            }
        }
        numVacantSpot = ROWS * SPOTS_PER_ROW;
    }


    public List<Spot> findVacantSpot(Vehicle v){
        if(numVacantSpot < v.getSpotsNeeded()) return null;

        List<Spot> parkingSpots = new ArrayList<>();

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < SPOTS_PER_ROW; j++){
                Spot spot = spots[i][j];
                if(spot.isVacant() && spot.canFitVehicle(v)){
                    int k = v.getSpotsNeeded();
                    boolean flag = true;
                    while(k > 0){
                        spot = spots[i][j++];
                        if(!spot.isVacant() || !spot.canFitVehicle(v)){
                            flag = false;
                            break;
                        }
                        parkingSpots.add(spot);
                        k--;
                    }
                    if(flag) return parkingSpots;
                }
            }
        }
        return null;

    }

    public void parkVehicle(Vehicle v){
        numVacantSpot -= v.getSpotsNeeded();
    }
    public void removeVehicle(Vehicle v){
        numVacantSpot += v.getSpotsNeeded();
    }
}
