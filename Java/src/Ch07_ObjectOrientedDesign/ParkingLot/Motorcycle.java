package Ch07_ObjectOrientedDesign.ParkingLot;

/**
 * @author: haixuanguo
 * @date: 4/24/21 10:51 PM
 */
public class Motorcycle extends Vehicle{
    int spotsNeeded = 1;
    VehicleSize size = VehicleSize.MOTORCYCLE;


    @Override
    public boolean canFitInSpot(Spot spot) {
        return true;
    }
}
