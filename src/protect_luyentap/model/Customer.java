package protect_luyentap.model;

import java.util.Objects;

public class Customer {
    private String codeCustomer;
    private String nameCustomer;
    private String birthdayCustomer;
    private String genderCustomer;
    private String cmndCustomer;
    private String phoneCustomer;
    private String emailCustomer;
    private String typeCustomer;
    private String addressCustomer;

    public Customer(String codeCustomer, String nameCustomer, String birthdayCustomer, String genderCustomer, String cmndCustomer, String phoneCustomer, String emailCustomer, String typeCustomer, String addressCustomer) {
        this.codeCustomer = codeCustomer;
        this.nameCustomer = nameCustomer;
        this.birthdayCustomer = birthdayCustomer;
        this.genderCustomer = genderCustomer;
        this.cmndCustomer = cmndCustomer;
        this.phoneCustomer = phoneCustomer;
        this.emailCustomer = emailCustomer;
        this.typeCustomer = typeCustomer;
        this.addressCustomer = addressCustomer;
    }

    public Customer() {
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthdayCustomer() {
        return birthdayCustomer;
    }

    public void setBirthdayCustomer(String birthdayCustomer) {
        this.birthdayCustomer = birthdayCustomer;
    }

    public String getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(String genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getCmndCustomer() {
        return cmndCustomer;
    }

    public void setCmndCustomer(String cmndCustomer) {
        this.cmndCustomer = cmndCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "codeCustomer='" + codeCustomer + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", birthdayCustomer='" + birthdayCustomer + '\'' +
                ", genderCustomer='" + genderCustomer + '\'' +
                ", cmndCustomer='" + cmndCustomer + '\'' +
                ", phoneCustomer='" + phoneCustomer + '\'' +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(codeCustomer, customer.codeCustomer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeCustomer);
    }
}
