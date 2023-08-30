package ss08_mvc_refactoring.excersise.model;

import java.util.Objects;

public class Customer {
    private int id;
    private String name;
    private double salary;
    private String product;

    public Customer() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    public Customer(int id, String name, double salary, String product) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.product = product;
    }
    public Customer(int id) {
        this.id = id;
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, String product) {
        this.name = name;
        this.product = product;
    }

    public Customer(double salary) {
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", product='" + product + '\'' +
                '}';
    }
}
