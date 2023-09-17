package ss017_binary_file.exercise.model;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private int id;
    private String productCode;
    private String productName;
    private String manufacturerProduct;
    private double priceProduce;

    public Product(int id, String productCode, String productName, String manufacturerProduct, double priceProduce) {
        this.id = id;
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturerProduct = manufacturerProduct;
        this.priceProduce = priceProduce;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturerProduct() {
        return manufacturerProduct;
    }

    public void setManufacturerProduct(String manufacturerProduct) {
        this.manufacturerProduct = manufacturerProduct;
    }

    public double getPriceProduce() {
        return priceProduce;
    }

    public void setPriceProduce(double priceProduce) {
        this.priceProduce = priceProduce;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacturerProduct='" + manufacturerProduct + '\'' +
                ", priceProduce=" + priceProduce +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }
}
