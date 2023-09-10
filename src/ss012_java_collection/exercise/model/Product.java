package ss012_java_collection.exercise.model;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private int idOfProduct;
    private String nameOfProduct;
    private double salaryOfProduct;
    private String productIntroduction;
    private String productExpiry;

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.salaryOfProduct, o.salaryOfProduct);
    }
    public Product(int idOfProduct, String nameOfProduct, double salaryOfProduct, String productExpiry) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.salaryOfProduct = salaryOfProduct;
        this.productExpiry = productExpiry;
    }


    public Product() {
    }

    public Product(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public Product(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public Product(double salaryOfProduct) {
        this.salaryOfProduct = salaryOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getSalaryOfProduct() {
        return salaryOfProduct;
    }

    public void setSalaryOfProduct(double salaryOfProduct) {
        this.salaryOfProduct = salaryOfProduct;
    }

    public int getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getProductExpiry() {
        return productExpiry;
    }

    public void setProductExpiry(String productExpiry) {
        this.productExpiry = productExpiry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return nameOfProduct.equals(product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "idOfProduct=" + idOfProduct +
                ", nameOfProduct='" + nameOfProduct + '\'' +
                ", salaryOfProduct=" + salaryOfProduct +
                ", productExpiry='" + productExpiry + '\'' +
                '}';
    }

}
