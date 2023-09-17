package case_study_module02.task2.model;

public class Employee extends Person {
    private String employeeCode;
    private double idCard;
    private String level;
    private String location;
    private double wage;

    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", idCard=" + idCard +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public double getIdCard() {
        return idCard;
    }

    public void setIdCard(double idCard) {
        this.idCard = idCard;
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

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public Employee(String name, String gender, int age, String email, double numberCall, String employeeCode, double idCard, String level, String location, double wage) {
        super(name, gender, age, email, numberCall);
        this.employeeCode = employeeCode;
        this.idCard = idCard;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String name, String gender, int age, String email, double numberCall) {
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

}
