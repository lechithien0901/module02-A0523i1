package case_study_module02.task2.model;

public class Villa extends Facility{
    private String standardRoom;
    private double swimmingPoolArea;
    private int numberOfFloors;

    public Villa(String serviceCode, String nameService, double usableArea, double rentalCode, int maximumNumberPeople, int rentaltype, String standardRoom, double swimmingPoolArea, int numberOfFloors) {
        super(serviceCode, nameService, usableArea, rentalCode, maximumNumberPeople, rentaltype);
        this.standardRoom = standardRoom;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString()+
                "standardRoom='" + standardRoom + '\'' +
                ", swimmingPoolArea=" + swimmingPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(double swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
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

    public Villa(String serviceCode, String nameService, double usableArea, double rentalCode, int maximumNumberPeople, int rentaltype) {
        super(serviceCode, nameService, usableArea, rentalCode, maximumNumberPeople, rentaltype);
    }
}

