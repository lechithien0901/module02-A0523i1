package case_study_module02.task2.model;

public class Customer extends Person {
    private String customerCode;
    private double idCard;
    private String typeOfGuest;
    private String address;

    public Customer(String name, String gender, int age, String email, double numberCall, String customerCode, double idCard, String typeOfGuest, String address) {
        super(name, gender, age, email, numberCall);
        this.customerCode = customerCode;
        this.idCard = idCard;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+"Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", idCard=" + idCard +
                ", typeOfGuest='" + typeOfGuest + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Customer(String name, String gender, int age, String email, double numberCall) {
        super(name, gender, age, email, numberCall);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public double getNumberCall() {
        return super.getNumberCall();
    }

    @Override
    public void setNumberCall(double numberCall) {
        super.setNumberCall(numberCall);
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public double getIdCard() {
        return idCard;
    }

    public void setIdCard(double idCard) {
        this.idCard = idCard;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
