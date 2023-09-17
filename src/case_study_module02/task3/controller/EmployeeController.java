package case_study_module02.task3.controller;

import case_study_module02.task3.service.IServiceEmployee;
import case_study_module02.task3.service.ServiceEmployee;

import java.util.Scanner;

public class EmployeeController {
    Scanner scanner=new Scanner(System.in);
    IServiceEmployee iServiceEmployee=new ServiceEmployee();
    public void showEmployee(){
        int choiceOfMe;
        do {
            System.out.println("Đây là danh sách của Employee");
            System.out.println("==============================================");
            System.out.println("1.Thêm đối tương Employeement");
            System.out.println("2.Hiển thị đối tượng Employeement");
            System.out.println("3.Sủa đối tượng Employeement");
            System.out.println("4.xóa đối tượng Employee theo Id");
            System.out.println("bấm một số bất kì để xóa");
            System.out.println("==============================================");
            System.out.println("mời bạn chọn lụa chọn của mình");
            choiceOfMe=Integer.parseInt(scanner.nextLine());
            switch (choiceOfMe){
                case 1:
                    System.out.println("bạn đã chọn thêm đối tượng ");
                    iServiceEmployee.addEmployee();
                    break;
            }
        }while (choiceOfMe>=1&&choiceOfMe<=4);
    }

}
