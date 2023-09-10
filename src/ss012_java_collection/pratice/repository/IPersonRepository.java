package ss012_java_collection.pratice.repository;

import ss012_java_collection.pratice.model.Person;

import java.util.*;

public interface IPersonRepository {
 Set<Person > findAll();
    void addPerson(Person person);
    void fixPerson(int id,Person person);
    void deletePerson(int index);
}
