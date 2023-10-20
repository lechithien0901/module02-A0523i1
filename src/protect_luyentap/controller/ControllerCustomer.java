package protect_luyentap.controller;

import protect_luyentap.service.IServiceCustomer;
import protect_luyentap.service.ServiceCustomer;

import java.util.Scanner;

public class ControllerCustomer {
    Scanner scanner=new Scanner(System.in);
    IServiceCustomer iServiceCustomer=new ServiceCustomer();
    public void disPlay(){
        boolean checkAll=false;
        while (!checkAll){
            try {
                int choice;
                do {
                    System.out.println("============================================================");
                    System.out.println("1.Thêm mới đối tượng");
                    System.out.println("2.Hiển thị đối tượng");
                    System.out.println("3.Sửa đối tượng");
                    System.out.println("4.Xóa đối tượng");
                    System.out.println("5.thoát menu");
                    System.out.println("============================================================");
                    System.out.println("mời bạn nhập lựa chọn của mình");
                    choice=Integer.parseInt(scanner.nextLine());
                    switch (choice){
                        case 1:
                            System.out.println("bạn đã chọn thêm mới đối tượng");
                            iServiceCustomer.addCustomer();
                            break;
                        case 2:
                            System.out.println("Bạn đã chon hiển thị đối tượng");
                            iServiceCustomer.showCustomer();
                            break;
                        case 3:
                            System.out.println("bạn đã chọn sửa đối tượng");
                            iServiceCustomer.editCustomer();
                            break;
                        case 4:
                            System.out.println("bạn đã chọn xóa đối tượng");
                            iServiceCustomer.deleteCustomer();
                            break;
                        case 5:
                            System.out.println("bạn đã chọn xóa đối tượng");
                            checkAll=true;
                            break;
                    }

                }while (choice!=5);
            }catch (NumberFormatException e){
                System.out.println("bạn nhập dữ liệu đầu vào bị sai");
                System.out.println("mời bạn nhập lại");
            }catch (NullPointerException e){
                System.out.println("có một phần tử bạn nhập bị Null");
                System.out.println("mời bạn nhập lại lựa chọn của mình");
            }
        }
    }
}
