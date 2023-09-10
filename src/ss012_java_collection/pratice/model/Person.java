package ss012_java_collection.pratice.model;

import java.util.Objects;
import java.util.PriorityQueue;

public class Person {
    private int idOfPerson;
    private String nameOfPerson;
    private int ageOfPerson;

    public Person() {
    }

    public Person(int idOfPerson, String nameOfPerson, int ageOfPerson) {
        this.idOfPerson = idOfPerson;
        this.nameOfPerson = nameOfPerson;
        this.ageOfPerson = ageOfPerson;
    }

    public int getIdOfPerson() {
        return idOfPerson;
    }

    public void setIdOfPerson(int idOfPerson) {
        this.idOfPerson = idOfPerson;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.nameOfPerson = nameOfPerson;
    }

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idOfPerson=" + idOfPerson +
                ", nameOfPerson='" + nameOfPerson + '\'' +
                ", ageOfPerson=" + ageOfPerson +
                '}';
    }
}
