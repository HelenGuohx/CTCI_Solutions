package Ch07_ObjectOrientedDesign.ParkingLot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: haixuanguo
 * @date: 4/24/21 10:34 PM
 */
public abstract class Vehicle {
    List<Spot> parkingSpots;
    String licensePlate;
    int spotsNeeded;
    VehicleSize size;

    public Vehicle(){
        parkingSpots = new ArrayList<>();
    }

    public int getSpotsNeeded(){
        return spotsNeeded;
    }
    public VehicleSize getSize(){
        return size;
    }

    public void parkInSpot(List<Spot> parkingSpots){
        this.parkingSpots.addAll(parkingSpots);
    }
    public void leaveSpot(){
        parkingSpots.clear();
    }
    public abstract boolean canFitInSpot(Spot spot);
}
