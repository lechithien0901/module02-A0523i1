package ss012_java_collection.pratice.service;

import ss012_java_collection.pratice.model.Person;

import java.util.*;

public interface IPersonService {
Set<Person> findAll();
    void addPerson();
    void fixPerson();
    void deletePerson();

}
