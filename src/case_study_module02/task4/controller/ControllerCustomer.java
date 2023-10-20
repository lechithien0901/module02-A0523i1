package case_study_module02.task4.controller;

import case_study_module02.task4.service.IServiceCustomer;
import case_study_module02.task4.service.ServiceCustomer;

import java.util.Scanner;

public class ControllerCustomer {
    Scanner scanner=new Scanner(System.in);
    IServiceCustomer iServiceCustomer=new ServiceCustomer();
    public void disPlay() {
        try {
            int choiceOfMe;
            do {
                System.out.println("Sau đây là danh sách của Customer");
                System.out.println("=========================================================");
                System.out.println("1.Hiển thị danh sách khách hàng Customer");
                System.out.println("2.Thêm Customer cho danh sách");
                System.out.println("3.Sửa thông tin Customer");
                System.out.println("4.Xóa Customer theo tên");
                System.out.println("=========================================================");
                System.out.println("Mời bạn nhập lựa chọn của mình");
                choiceOfMe = Integer.parseInt(scanner.nextLine());
                switch (choiceOfMe) {
                    case 1:
                        System.out.println("bạn đã chon hiển thị danh sách");
                        iServiceCustomer.showCustomer();
                        break;
                    case 2:
                        System.out.println("bạn đã chọn thêm danh sách cho Customer");
                        iServiceCustomer.addCustomer();
                        break;
                    case 3:
                        System.out.println("bạn đã chọn sửa thông tin cho khách hàng");
                        iServiceCustomer.fixCustomer();
                        break;
                    case 4:

                }
            } while (choiceOfMe >= 1 && choiceOfMe <= 4);
        } catch (NullPointerException e){
            System.out.println("có thể phần tử nào đó bị Null");
        }catch (NumberFormatException e){
            System.out.println("bạn đã nhập sai dữ liệu đầu vào rồi");
        }
    }}
