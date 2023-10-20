package protect_view_new.model;

import java.util.Objects;

public abstract class Transportation {
    private String controlOfVehicle;
    private String nameManufacturer;
    private String yearOfManufacture;
    private String ownerOfVehicle;

    public Transportation(String controlOfVehicle, String nameManufacturer, String yearOfManufacture, String ownerOfVehicle) {
        this.controlOfVehicle = controlOfVehicle;
        this.nameManufacturer = nameManufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.ownerOfVehicle = ownerOfVehicle;
    }

    public Transportation() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transportation that = (Transportation) o;
        return Objects.equals(controlOfVehicle, that.controlOfVehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(controlOfVehicle);
    }

    @Override
    public String toString() {
        return "Transportation{" +
                "controlOfVehicle='" + controlOfVehicle + '\'' +
                ", nameManufacturer='" + nameManufacturer + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", ownerOfVehicle='" + ownerOfVehicle + '\'' +
                '}';
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
}
