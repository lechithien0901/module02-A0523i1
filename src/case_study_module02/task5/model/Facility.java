package case_study_module02.task5.model;

import java.io.Serializable;
import java.util.Objects;

public abstract class Facility implements Serializable {
    private String serviceCode;
    private String serviceName;
    private double area;
    private double rentalCost;
    private int maxOccupancy;
    private String rentType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceCode, facility.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode);
    }

    public Facility(String serviceCode, String serviceName, double area, double rentalCost, int maxOccupancy, String rentType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxOccupancy = maxOccupancy;
        this.rentType = rentType;
    }


    public Facility() {
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public double setArea(double area) {
        this.area = area;
        return area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public Double setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
        return rentalCost;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public Integer setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
        return maxOccupancy;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", rentalCost=" + rentalCost +
                ", maxOccupancy=" + maxOccupancy +
                ", rentType='" + rentType + '\'' +
                '}';
    }

}