package case_study_module02.task2.model;

public class Room extends Facility{
    private String freeServiceInclude;

    public Room(String serviceCode, String nameService, double usableArea, double rentalCode, int maximumNumberPeople, int rentaltype, String freeServiceInclude) {
        super(serviceCode, nameService, usableArea, rentalCode, maximumNumberPeople, rentaltype);
        this.freeServiceInclude = freeServiceInclude;
    }

    @Override
    public String toString() {
        return super.toString()+"Room{" +
                "freeServiceInclude='" + freeServiceInclude + '\'' +
                '}';
    }

    public String getFreeServiceInclude() {
        return freeServiceInclude;
    }

    public void setFreeServiceInclude(String freeServiceInclude) {
        this.freeServiceInclude = freeServiceInclude;
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

    public Room(String serviceCode, String nameService, double usableArea, double rentalCode, int maximumNumberPeople, int rentaltype) {
        super(serviceCode, nameService, usableArea, rentalCode, maximumNumberPeople, rentaltype);
    }
}
