package ss011_stack_queue.pratice;

public class Test {
    public static void main(String[] args) {
        Student student=new Student(3,"nguyen van a");
      Student student1=new Student(3,"nguyen van a");
      Student student2=new Student(3,"nguyen van c");
       boolean check=true;
       if (student.hashCode()== student1.hashCode()){
           check=false;
       }
       if (!check){
           System.out.println("2 cái hashcode bằng nhau");
       }
        System.out.println(student.getName().equals(student1.getName()));

    }
}
