package ss10_dsa.exercise;
import ss08_mvc_refactoring.pratice.model.Student;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Student>myList=new MyList<Student>( );
        Student student=new Student("Thien",0,2,1);

        Student student1=new Student("thanh",1,2,3);

        Student student2=new Student("hao",4,5,6);

        myList.add(0,student);

        myList.add(1,student1);
        myList.add(2,student2);
        System.out.println(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
    }
}
