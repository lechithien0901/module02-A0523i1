package protect_view.model;

import java.util.Objects;

public abstract class Transportation  {
    private String nameVehicle;
    private String controlOfVehicle;
    private String nameManufacturer;
    private String yearOfManufacture;
    private String ownerOfVehicle;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transportation that = (Transportation) o;
        return Objects.equals(nameVehicle, that.nameVehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameVehicle);
    }

    public String getNameVehicle() {
        return nameVehicle;
    }

    public void setNameVehicle(String nameVehicle) {
        this.nameVehicle = nameVehicle;
    }

    public String getControlOfVehicle() {
        return controlOfVehicle;
    }

    public void setControlOfVehicle(String controlOfVehicle) {
        this.controlOfVehicle = controlOfVehicle;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwnerOfVehicle() {
        return ownerOfVehicle;
    }

    public void setOwnerOfVehicle(String ownerOfVehicle) {
        this.ownerOfVehicle = ownerOfVehicle;
    }

    public Transportation(String nameVehicle, String controlOfVehicle, String nameManufacturer, String yearOfManufacture, String ownerOfVehicle) {
        this.nameVehicle = nameVehicle;
        this.controlOfVehicle = controlOfVehicle;
        this.nameManufacturer = nameManufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.ownerOfVehicle = ownerOfVehicle;
    }

    public Transportation() {
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "nameVehicle='" + nameVehicle + '\'' +
                ", controlOfVehicle='" + controlOfVehicle + '\'' +
                ", nameManufacturer='" + nameManufacturer + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", ownerOfVehicle='" + ownerOfVehicle + '\'' +
                '}';
    }
}
