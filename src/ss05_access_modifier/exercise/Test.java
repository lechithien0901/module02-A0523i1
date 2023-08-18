package ss05_access_modifier.exercise;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.getClasses());
        System.out.println(Student.getName());
        Student.setClasses("Sư phạm tin");
        Student.setName("Thiện");
        System.out.println(Student.getName()+" : "+Student.getClasses());
    }
}