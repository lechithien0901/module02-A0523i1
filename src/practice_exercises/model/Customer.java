package practice_exercises.model;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    private String customerCode;
    private String customerName;
    private String customerBirthday;
    private String customerGender;
    private String customerCMND;
    private String customerPhone;
    private String customerEmail;
    private String customerType;
    private String customerAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerCode, customer.customerCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerCode);
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerCMND() {
        return customerCMND;
    }

    public void setCustomerCMND(String customerCMND) {
        this.customerCMND = customerCMND;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerBirthday='" + customerBirthday + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", customerCMND='" + customerCMND + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerType='" + customerType + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }

    public Customer(String customerCode, String customerName, String customerBirthday, String customerGender, String customerCMND, String customerPhone, String customerEmail, String customerType, String customerAddress) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerCMND = customerCMND;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public Customer() {
    }
}
