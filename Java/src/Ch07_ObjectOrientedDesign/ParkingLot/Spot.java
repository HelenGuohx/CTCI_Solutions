package Ch07_ObjectOrientedDesign.ParkingLot;

/**
 * @author: haixuanguo
 * @date: 4/24/21 10:38 PM
 */
public class Spot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private int level;

    public Spot(VehicleSize spotSize, int row, int spotNumber, int level){
        this.spotSize = spotSize;
        this.row = row;
        this.spotNumber = spotNumber;
        this.level = level;

    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public int getLevel() {
        return level;
    }


    public boolean isVacant(){
        return vehicle == null;
    }
    public boolean canFitVehicle(Vehicle v){
        return v.canFitInSpot(this);
    }

    public void removeVehicle(){
        vehicle = null;
    }
}
