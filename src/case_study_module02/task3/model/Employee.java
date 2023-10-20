package case_study_module02.task3.model;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    private String employeeCode;
    private String nameEmployee;
    private String dateOfEmployee;
    private String genderOfEmployee;
    private String idCard;
    private String numberCallOfEmployee;
    private String emailOfEmployee;
    private String level;
    private String location;
    private double salary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return nameEmployee.equals(employee.nameEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameEmployee);
    }

    public Employee(String employeeCode, String nameEmployee, String dateOfEmployee, String genderOfEmployee, String idCard, String numberCallOfEmployee, String emailOfEmployee, String level, String location, double salary) {
        this.employeeCode = employeeCode;
        this.nameEmployee = nameEmployee;
        this.dateOfEmployee = dateOfEmployee;
        this.genderOfEmployee = genderOfEmployee;
        this.idCard = idCard;
        this.numberCallOfEmployee = numberCallOfEmployee;
        this.emailOfEmployee = emailOfEmployee;
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDateOfEmployee() {
        return dateOfEmployee;
    }

    public void setDateOfEmployee(String dateOfEmployee) {
        this.dateOfEmployee = dateOfEmployee;
    }

    public String getGenderOfEmployee() {
        return genderOfEmployee;
    }

    public void setGenderOfEmployee(String genderOfEmployee) {
        this.genderOfEmployee = genderOfEmployee;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberCallOfEmployee() {
        return numberCallOfEmployee;
    }

    public void setNumberCallOfEmployee(String numberCallOfEmployee) {
        this.numberCallOfEmployee = numberCallOfEmployee;
    }

    public String getEmailOfEmployee() {
        return emailOfEmployee;
    }

    public void setEmailOfEmployee(String emailOfEmployee) {
        this.emailOfEmployee = emailOfEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", nameEmployee='" + nameEmployee + '\'' +
                ", dateOfEmployee=" + dateOfEmployee +
                ", genderOfEmployee='" + genderOfEmployee + '\'' +
                ", idCard='" + idCard + '\'' +
                ", numberCallOfEmployee='" + numberCallOfEmployee + '\'' +
                ", emailOfEmployee='" + emailOfEmployee + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
