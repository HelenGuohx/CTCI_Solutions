package Ch07_ObjectOrientedDesign.ParkingLot;

import java.util.Vector;

/**
 * @author: haixuanguo
 * @date: 4/24/21 10:49 PM
 */
public class Bus extends Vehicle {
    int spotsNeeded = 5;
    VehicleSize size = VehicleSize.LARGE;


    @Override
    public boolean canFitInSpot(Spot spot) {
        return size == spot.getSpotSize();
    }
}
