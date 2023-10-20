package protect_view.model;

public class Truck extends Transportation{
    private String payLoad;

    public Truck(String nameVehicle, String controlOfVehicle, String nameManufacturer, String yearOfManufacture, String ownerOfVehicle, String payLoad) {
        super(nameVehicle, controlOfVehicle, nameManufacturer, yearOfManufacture, ownerOfVehicle);
        this.payLoad = payLoad;
    }

    public Truck() {
    }

    public Truck(String payLoad) {
        this.payLoad = payLoad;
    }

    public String getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return "Truck{ " + super.toString()+
                " payLoad='" + payLoad + '\'' +
                '}';
    }
}
