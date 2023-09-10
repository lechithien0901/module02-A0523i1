package ss012_java_collection.pratice.service;

import ss012_java_collection.pratice.model.Person;
import ss012_java_collection.pratice.repository.IPersonRepository;
import ss012_java_collection.pratice.repository.PersonRepository;

import java.util.*;

public class PersonService implements IPersonService{
    Scanner scanner=new Scanner(System.in);
    IPersonRepository iPersonRepository=new PersonRepository();
    @Override
    public Set<Person> findAll() {
        return iPersonRepository.findAll();
    }

    @Override
    public void addPerson() {
        System.out.println("mời bạn nhập id cần muốn thêm");
        int id=Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập tên cần muốn thêm");
        String name=scanner.nextLine();
        System.out.println("mời bạn nhập tuổi cần muốn thêm");
        int age=scanner.nextInt();
        Person person1=new Person(id,name,age);
        iPersonRepository.addPerson(person1);
    }
    @Override
    public void fixPerson() {
        System.out.println("mời bạn nhập id cần muốn sửa đối tương Person");
        int idOfPerson=Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập mới id của mình");
        int idNewOfPerson=Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập tên mới của mình");
        String namNewOfPerson=scanner.nextLine();
        System.out.println("mời bạn nhập tuổi của mình");
        int ageNewOfPerson=Integer.parseInt(scanner.nextLine());
        Person person=new Person(idNewOfPerson,namNewOfPerson,ageNewOfPerson);
        iPersonRepository.fixPerson(idOfPerson,person);

    }

    @Override
    public void deletePerson() {
        System.out.println("mời bạn nhập ví trí index bạn cần loại bỏ");
        int idNeedDelete=Integer.parseInt(scanner.nextLine());
        iPersonRepository.deletePerson(idNeedDelete);
    }
}
