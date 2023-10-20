package protect_view_new.model;

public class Vehicle extends Transportation{
    private String wattage;

    public Vehicle(String controlOfVehicle, String nameManufacturer, String yearOfManufacture, String ownerOfVehicle, String wattage) {
        super(controlOfVehicle, nameManufacturer, yearOfManufacture, ownerOfVehicle);
        this.wattage = wattage;
    }

    public Vehicle() {
    }

    public Vehicle(String wattage) {
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Vehicle{ " +super.toString()+
                " wattage='" + wattage + '\'' +
                '}';
    }
}
