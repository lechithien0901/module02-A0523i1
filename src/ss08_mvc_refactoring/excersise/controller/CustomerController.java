package ss08_mvc_refactoring.excersise.controller;




import ss08_mvc_refactoring.excersise.service.CustomerService;
import ss08_mvc_refactoring.excersise.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    Scanner scanner=new Scanner(System.in);
    public void disPlay(){
        ICustomerService iCustomerService=new CustomerService();
    int choice=0;
    do{
        System.out.println("=================================");
        System.out.println("danh sách của Customer");
        System.out.println("1.Hiển thị danh sách");
        System.out.println("2.Thêm danh sách");
        System.out.println("3.sửa danh sách");
        System.out.println("4.Xóa danh sách");
        System.out.println("5.Mời nhập chuỗi mà bạn muốn tìm kiếm");
        System.out.println("bấm một số bất kì để kết thúc menu");
        System.out.println("=================================");
        System.out.println("mời nhập chức năng của bạn : ");
        choice=Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Bạn vừa chọn Hiển thị danh sách");
                System.out.println("Đây là danh sách :");
                iCustomerService.findAll();
                break;
            case 2:
                System.out.println("Bạn vừa chọn chức nắng thêm vào danh sách");
                iCustomerService.addCustomer();
                break;
            case 3:
                System.out.println("Bạn vừa chọn chức năng sửa của danh sách");
                iCustomerService.fixCustomer();
                break;
            case 4:
                iCustomerService.deleteCustomer();

break;
            case 5:
                System.out.println("bạn vừa chọn tìm thông tin theo sản phẩm");
                iCustomerService.findCustomer();
                break;
        }

    }while(choice<=5&&choice>=0);
    }


}
