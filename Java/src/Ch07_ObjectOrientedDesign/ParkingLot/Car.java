package Ch07_ObjectOrientedDesign.ParkingLot;

/**
 * @author: haixuanguo
 * @date: 4/24/21 10:47 PM
 */
public class Car extends Vehicle{
    int spotsNeeded = 1;
    VehicleSize size = VehicleSize.COMPACT;

    @Override
    public boolean canFitInSpot(Spot spot) {
        return spot.getSpotSize() == VehicleSize.COMPACT || spot.getSpotSize() == VehicleSize.LARGE;
    }
}
