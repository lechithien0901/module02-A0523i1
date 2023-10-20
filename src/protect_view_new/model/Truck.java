package protect_view_new.model;

public class Truck extends Transportation{
    private String payLoad;

    public Truck(String controlOfVehicle, String nameManufacturer, String yearOfManufacture, String ownerOfVehicle, String payLoad) {
        super(controlOfVehicle, nameManufacturer, yearOfManufacture, ownerOfVehicle);
        this.payLoad = payLoad;
    }

    public Truck(String payLoad) {
        this.payLoad = payLoad;
    }

    public Truck() {
    }

    public String getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return "Truck{ " +super.toString()+
                " payLoad='" + payLoad + '\'' +
                '}';
    }
}
