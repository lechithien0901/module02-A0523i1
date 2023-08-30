package ss08_mvc_refactoring.pratice.controller;

import ss08_mvc_refactoring.pratice.model.Student;
import ss08_mvc_refactoring.pratice.service.IStudentService;
import ss08_mvc_refactoring.pratice.service.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        IStudentService iStudentService=new StudentService();
        do {
            System.out.println(" ========================================== ");
            System.out.println(" danh sách của đối tượng học sinh ");
            System.out.println(" 1.chức nắng thể hiện danh sách ");
            System.out.println(" 2.chức nắng thêm vào danh sách ");
            System.out.println(" 3.chức nắng sửa danh sách ");
            System.out.println(" 4.chức nắng xóa danh sách ");
            System.out.println(" ========================================== ");
            System.out.print(" mời chọn chức năng của bạn : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Student[]students=iStudentService.findAll();
                    for (Student student:students
                         ) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    System.out.println("bạn nhập tên mà học sinh bạn muốn thêm vào");
                    String nameOfStudent=scanner.nextLine();
                    System.out.println("mời bạn nhập id của học sinh bạn muốn thêm vào");
                    int idOfStudent=Integer.parseInt(scanner.nextLine());
                    System.out.println("mời bạn nhập điểm của học sinh");
                    double scoreOfStudent=Double.parseDouble(scanner.nextLine());
                    System.out.println("mời nhập số tuổi của học sinh");
                    int count=Integer.parseInt(scanner.nextLine());
                    Student student=new Student(nameOfStudent,idOfStudent,scoreOfStudent,count);
                    iStudentService.addStudent(student);
                    break;
                case 3:
                    iStudentService.fixStudent();
                case 4:iStudentService.deleteStudent();
            }


        }while (choice>=1&&choice<=4);

    }

}
