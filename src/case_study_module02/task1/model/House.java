package case_study_module02.task1.model;

public class House extends Facility {
    public House(String roomStardard, int numberOfFloor) {
        this.roomStardard = roomStardard;
        this.numberOfFloor = numberOfFloor;
    }

    public House() {
    }

    public House(String serviceCode, String serviceName, double area, double rentalCost, int maxOccupancy, String rentType, String roomStardard, int numberOfFloor) {
        super(serviceCode, serviceName, area, rentalCost, maxOccupancy, rentType);
        this.roomStardard = roomStardard;
        this.numberOfFloor = numberOfFloor;
    }

    private String roomStardard;
    private int numberOfFloor;

    public String getRoomStardard() {
        return roomStardard;
    }

    public void setRoomStardard(String roomStardard) {
        this.roomStardard = roomStardard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public Integer setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
        return numberOfFloor;
    }

    @Override
    public String toString() {
        return super.toString()+"House{" +
                "roomStardard='" + roomStardard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
