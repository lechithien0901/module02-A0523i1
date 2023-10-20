package case_study_module02.task1.model;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
    private String customerCode;
    private String customerName;
    private String customerDate;
    private String customerGender;
    private String customerCmnd;
    private String customerPhone;
    private String customerEmail;
    private String customerTypeOfGuest;
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
        return Objects.hash(customerName);
    }


    public Customer(String customerCode, String customerName, String customerDate, String customerGender, String customerCmnd, String customerPhone, String customerEmail, String customerTypeOfGuest, String customerAddress) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerDate = customerDate;
        this.customerGender = customerGender;
        this.customerCmnd = customerCmnd;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerTypeOfGuest = customerTypeOfGuest;
        this.customerAddress = customerAddress;
    }

    public Customer() {
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

    public String getCustomerDate() {
        return customerDate;
    }

    public void setCustomerDate(String customerDate) {
        this.customerDate = customerDate;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerCmnd() {
        return customerCmnd;
    }

    public void setCustomerCmnd(String customerCmnd) {
        this.customerCmnd = customerCmnd;
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

    public String getCustomerTypeOfGuest() {
        return customerTypeOfGuest;
    }

    public void setCustomerTypeOfGuest(String customerTypeOfGuest) {
        this.customerTypeOfGuest = customerTypeOfGuest;
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
                ", customerDate='" + customerDate + '\'' +
                ", customerGender='" + customerGender + '\'' +
                ", customerCmnd='" + customerCmnd + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerTypeOfGuest='" + customerTypeOfGuest + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }

}
