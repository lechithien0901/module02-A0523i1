package case_study_module02.task1.model;

public class Room extends  Facility {
    private String accompaniedService;

    public String getAccompaniedService() {
        return accompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    public Room() {
    }

    public Room(String accompaniedService) {
        this.accompaniedService = accompaniedService;
    }

    public Room(String serviceCode, String serviceName, double area, double rentalCost, int maxOccupancy, String rentType, String accompaniedService) {
        super(serviceCode, serviceName, area, rentalCost, maxOccupancy, rentType);
        this.accompaniedService = accompaniedService;
    }

    @Override
    public String toString() {
        return super.toString()+"Room{" +
                "accompaniedService='" + accompaniedService + '\'' +
                '}';
    }
}
