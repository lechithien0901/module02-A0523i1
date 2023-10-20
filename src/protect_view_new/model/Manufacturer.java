package protect_view_new.model;

import java.util.Objects;

public class Manufacturer {
private String manufacturer;
private String nameManufacturer;
private String productName;

    public Manufacturer(String manufacturer, String nameManufacturer, String productName) {
        this.manufacturer = manufacturer;
        this.nameManufacturer = nameManufacturer;
        this.productName = productName;
    }

    public Manufacturer() {
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "manufacturer='" + manufacturer + '\'' +
                "- nameManufacturer='" + nameManufacturer + '\'' +
                "- productName='" + productName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
