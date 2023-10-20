package case_study_module02.task5.model;

public class Villa extends Facility{
    private String stardardRoom;
    private double poolArea;
    private int doubleOfFloor;

    public String getStardardRoom() {
        return stardardRoom;
    }

    public void setStardardRoom(String stardardRoom) {
        this.stardardRoom = stardardRoom;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public Double setPoolArea(double poolArea) {
        this.poolArea = poolArea;
        return poolArea;
    }

    public int getDoubleOfFloor() {
        return doubleOfFloor;
    }

    public Integer setDoubleOfFloor(int doubleOfFloor) {
        this.doubleOfFloor = doubleOfFloor;
        return doubleOfFloor;
    }

    public Villa(String serviceCode, String serviceName, double area, double rentalCost, int maxOccupancy, String rentType, String stardardRoom, double poolArea, int doubleOfFloor) {
        super(serviceCode, serviceName, area, rentalCost, maxOccupancy, rentType);
        this.stardardRoom = stardardRoom;
        this.poolArea = poolArea;
        this.doubleOfFloor = doubleOfFloor;
    }

    public Villa() {
    }

    public Villa(String stardardRoom, double poolArea, int doubleOfFloor) {
        this.stardardRoom = stardardRoom;
        this.poolArea = poolArea;
        this.doubleOfFloor = doubleOfFloor;
    }

    @Override
    public String toString() {
        return super.toString()+" Villa{" +
                "stardardRoom='" + stardardRoom + '\'' +
                ", poolArea=" + poolArea +
                ", doubleOfFloor=" + doubleOfFloor +
                '}';
    }

}
