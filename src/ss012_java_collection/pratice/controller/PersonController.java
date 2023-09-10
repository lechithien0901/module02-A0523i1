package ss012_java_collection.pratice.controller;

import ss012_java_collection.pratice.service.IPersonService;
import ss012_java_collection.pratice.service.PersonService;

import java.util.Scanner;

public class PersonController {
    Scanner scanner=new Scanner(System.in);
    public void disPlay(){
        IPersonService iPersonService=new PersonService();
        int choice=0;
        do {
            System.out.println("Đây là danh sách của menu");
            System.out.println("========================================");
            System.out.println("1.hiển thị danh sách ra");
            System.out.println("2.thêm đối tượng cho danh sách");
            System.out.println("3.sửa danh sách");
            System.out.println("4.xóa danh sách");
            System.out.println("========================================");
            System.out.println("mời bạn chọn CHỨC NĂNG cho danh sách");
            choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("bạn vừa chọn hiển thị danh sách");
iPersonService.findAll();
break;
                case 2:
                    System.out.println("bạn vừa chọn chức năng thêm danh sách");
                    iPersonService.addPerson();
                    break;
                case 3:
                    System.out.println("bạn vừa chọn sửa đối tượng");
                    iPersonService.fixPerson();
                    break;
                case 4:
                    System.out.println("bạn đã chọn xóa đối tượng ");
                    iPersonService.deletePerson();
                    break;

            }


        }while (choice<=4&&choice>=0);

    }
}
