package ss05_access_modifier.exercise;

public class Student {
    private static String name="john";
    private static String classes="C02";
    public Student(){}
    public Student(String name,String classes){
        this.name=name;
        this.classes=classes;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public static String getClasses() {
        return classes;
    }

    public static void setClasses(String classes) {
        Student.classes = classes;
    }

}