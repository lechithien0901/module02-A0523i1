package case_study_module02.task2.model;

public class House extends Facility{
    private String roomStandards;
    private int numberOfFloor;

    @Override
    public String toString() {
        return super.toString()+"House{" +
                "roomStandards='" + roomStandards + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }

    public String getRoomStandards() {
        return roomStandards;
    }

    public void setRoomStandards(String roomStandards) {
        this.roomStandards = roomStandards;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public House(String serviceCode, String nameService, double usableArea, double rentalCode, int maximumNumberPeople, int rentaltype, String roomStandards, int numberOfFloor) {
        super(serviceCode, nameService, usableArea, rentalCode, maximumNumberPeople, rentaltype);
        this.roomStandards = roomStandards;
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String getServiceCode() {
        return super.getServiceCode();
    }

    @Override
    public void setServiceCode(String serviceCode) {
        super.setServiceCode(serviceCode);
    }

    @Override
    public String getNameService() {
        return super.getNameService();
    }

    @Override
    public void setNameService(String nameService) {
        super.setNameService(nameService);
    }

    @Override
    public double getUsableArea() {
        return super.getUsableArea();
    }

    @Override
    public void setUsableArea(double usableArea) {
        super.setUsableArea(usableArea);
    }

    @Override
    public double getRentalCode() {
        return super.getRentalCode();
    }

    @Override
    public void setRentalCode(double rentalCode) {
        super.setRentalCode(rentalCode);
    }

    @Override
    public int getMaximumNumberPeople() {
        return super.getMaximumNumberPeople();
    }

    @Override
    public void setMaximumNumberPeople(int maximumNumberPeople) {
        super.setMaximumNumberPeople(maximumNumberPeople);
    }

    @Override
    public int getRentaltype() {
        return super.getRentaltype();
    }

    @Override
    public void setRentaltype(int rentaltype) {
        super.setRentaltype(rentaltype);
    }

    public House(String serviceCode, String nameService, double usableArea, double rentalCode, int maximumNumberPeople, int rentaltype) {
        super(serviceCode, nameService, usableArea, rentalCode, maximumNumberPeople, rentaltype);
    }
}
