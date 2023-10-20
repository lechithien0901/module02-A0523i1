package protect_view.controller;

import protect_view.service.IServiceTransportation;
import protect_view.service.ServiceTransportation;

import java.util.Scanner;

public class ControllerTransportation {
    Scanner scanner=new Scanner(System.in);
    IServiceTransportation iServiceTransportation=new ServiceTransportation();
    public void display(){
        boolean checkAll=false;
        while (!checkAll){
            try{
                int choiceOfMe;
                do {
                    System.out.println("==============================================");
                    System.out.println("1.Thêm mới phương tiện");
                    System.out.println("2.Hiển thị phương tiện");
                    System.out.println("3.Xóa phương tiện");
                    System.out.println("4.Sửa phương tiện");
                    System.out.println("5.Thoát");
                    System.out.println("==============================================");
                    System.out.println("mời bạn chọn chức năng của mình");
                    choiceOfMe=Integer.parseInt(scanner.nextLine());
                    switch (choiceOfMe){
                        case 1:
                            System.out.println("bạn đã chọn thêm mới phương tiện");
                            iServiceTransportation.addTransportation();
                            break;
                        case 2:
                            System.out.println("bạn đã chọn hiển  thị danh sách phương tiện");
                            iServiceTransportation.showTransportation();
                            break;
                        case 3:
                            System.out.println("bạn đã chọn xóa phương tiện");
                            break;
                        case 4:
                            System.out.println("bạn đã chọn sửa phương tiện");
                            break;
                        case 5:
                            checkAll=true;
                            break;
                    }
                }while (choiceOfMe!=5);


            }catch (NumberFormatException e){
                System.out.println("bạn đã nhập sai dữ liệu đầu vào");
                System.out.println("mời bạn nhập lại");
            }catch (NullPointerException e){
                System.out.println("bạn đã nhập một phần tử bị Null");
                System.out.println("mời bạn nhập lại");
            }
        }
    }
}
