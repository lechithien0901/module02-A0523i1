package protect_view.model;

public class Vehicle extends Transportation{
    private String wattage;

    public Vehicle(String nameVehicle, String controlOfVehicle, String nameManufacturer, String yearOfManufacture, String ownerOfVehicle, String wattage) {
        super(nameVehicle, controlOfVehicle, nameManufacturer, yearOfManufacture, ownerOfVehicle);
        this.wattage = wattage;
    }

    public Vehicle(String wattage) {
        this.wattage = wattage;
    }

    public Vehicle() {
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Vehicle{ " + super.toString() +
                " wattage='" + wattage + '\'' +
                '}';
    }
}
