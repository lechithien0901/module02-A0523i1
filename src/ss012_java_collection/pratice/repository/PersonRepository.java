package ss012_java_collection.pratice.repository;

import ss012_java_collection.pratice.model.Person;

import java.util.*;

public class PersonRepository implements IPersonRepository{

   static Set<Person> arrayList=new LinkedHashSet<>() ;
    static {
      arrayList.add(new Person(12,"nguyen van a",3));
      arrayList.add(new Person(13,"nguyen van b",4));
      arrayList.add(new Person(14,"nguyen van c",4));

    }
    @Override
    public Set<Person> findAll() {
        for (Person person:arrayList
             ) {
            System.out.println(person);

        }
        return  arrayList;

    }

    @Override
    public void addPerson(Person person) {
        arrayList.add(person);
    }

    @Override
    public void fixPerson(int id,Person person) {

    }

    @Override
    public void deletePerson(int index) {
        arrayList.remove(index);

    }
}
