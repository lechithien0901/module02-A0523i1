package case_study_module02.task2.model;

public abstract class Person {
    private String name;
    private String gender;
    private int age;
    private String email;
    private double numberCall;

    public Person(String name, String gender, int age, String email, double numberCall) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.numberCall = numberCall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getNumberCall() {
        return numberCall;
    }

    public void setNumberCall(double numberCall) {
        this.numberCall = numberCall;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", numberCall=" + numberCall +
                '}';
    }
}
