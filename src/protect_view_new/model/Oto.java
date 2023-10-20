package protect_view_new.model;

public class Oto extends Transportation{
    private String numberOfSeat;
    private String vehicleType;

    public Oto(String controlOfVehicle, String nameManufacturer, String yearOfManufacture, String ownerOfVehicle, String numberOfSeat, String vehicleType) {
        super(controlOfVehicle, nameManufacturer, yearOfManufacture, ownerOfVehicle);
        this.numberOfSeat = numberOfSeat;
        this.vehicleType = vehicleType;
    }

    public Oto(String numberOfSeat, String vehicleType) {
        this.numberOfSeat = numberOfSeat;
        this.vehicleType = vehicleType;
    }

    public Oto() {
    }

    public String getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(String numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Oto{ " + super.toString()+
                " numberOfSeat='" + numberOfSeat + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
