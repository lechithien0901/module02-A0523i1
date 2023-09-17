package ss017_binary_file.pratice.thuchanh1;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double salary;
    private String code;

    public Product(int id, String name, double salary, String code) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.code = code;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", code='" + code + '\'' +
                '}';
    }
}
