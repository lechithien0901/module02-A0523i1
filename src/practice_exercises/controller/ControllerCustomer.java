package practice_exercises.controller;

import practice_exercises.service.IServiceCustomer;
import practice_exercises.service.ServiceCustomer;

import java.util.Scanner;

public class ControllerCustomer {
    public void disPlay() {
        IServiceCustomer iServiceCustomer = new ServiceCustomer();
        Scanner scanner = new Scanner(System.in);
        boolean checkAll = false;
        while (!checkAll) {
            try {
                int choiceOfMe;
                do {
                    System.out.println("Sau đây là danh sách của Customer");
                    System.out.println("=====================================================");
                    System.out.println("1.Thêm danh sách Customer");
                    System.out.println("2.Hiển thị danh sách Customer");
                    System.out.println("3.Sửa danh sách Customer");
                    System.out.println("4.Xóa danh sách Customer");
                    System.out.println("5.Thoát khỏi danh sách");
                    System.out.println("=====================================================");
                    System.out.println("mời bạn nhập lựa chọn của mình");
                    choiceOfMe = Integer.parseInt(scanner.nextLine());
                    switch (choiceOfMe) {
                        case 1:
                            System.out.println("bạn đã chọn thêm mới danh sách");
                            iServiceCustomer.addCustomer();
                            break;
                        case 2:
                            iServiceCustomer.showCustomer();
                            break;
                        case 3:
                            iServiceCustomer.editCustomer();
                            break;
                        case 4:
                        case 5:
                            checkAll = true;
                            break;

                    }
                } while (choiceOfMe != 5);
            } catch (NullPointerException e) {
                System.out.println("Có một phần tử bạn nhập bị Null");
                System.out.println("mời bạn nhập lại lựa chọn của mình");
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai dữ liệu đầu vào");
                System.out.println("mời bạn nhập lại lựa chọn của mình");
            }


        }
    }
}
