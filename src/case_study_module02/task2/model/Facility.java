package case_study_module02.task2.model;

public abstract class  Facility {
    private String serviceCode;
    private String nameService;
    private double usableArea;
    private double rentalCode;
    private int maximumNumberPeople;
    private int rentaltype;

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCode() {
        return rentalCode;
    }

    public void setRentalCode(double rentalCode) {
        this.rentalCode = rentalCode;
    }

    public int getMaximumNumberPeople() {
        return maximumNumberPeople;
    }

    public void setMaximumNumberPeople(int maximumNumberPeople) {
        this.maximumNumberPeople = maximumNumberPeople;
    }

    public int getRentaltype() {
        return rentaltype;
    }

    public void setRentaltype(int rentaltype) {
        this.rentaltype = rentaltype;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCode=" + rentalCode +
                ", maximumNumberPeople=" + maximumNumberPeople +
                ", rentaltype=" + rentaltype +
                '}';
    }

    public Facility(String serviceCode, String nameService, double usableArea, double rentalCode, int maximumNumberPeople, int rentaltype) {
        this.serviceCode = serviceCode;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentalCode = rentalCode;
        this.maximumNumberPeople = maximumNumberPeople;
        this.rentaltype = rentaltype;
    }

}
