package protect_view_new.controller;

import protect_view_new.service.IServiceTransportation;
import protect_view_new.service.ServiceTransportation;

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
                    System.out.println("3.Sửa phương tiện");
                    System.out.println("4.Xóa phương tiện");
                    System.out.println("5.Thoát");
                    System.out.println("==============================================");
                    System.out.println("mời bạn chọn chức năng của mình");
                    choiceOfMe=Integer.parseInt(scanner.nextLine());
                    switch (choiceOfMe){
                        case 1:
                            boolean check=false;
                            int choice;
                            do {
                                System.out.println("=================================================");
                                System.out.println("bạn đã chọn thêm mới phương tiện");
                                System.out.println("1. Thêm xe tải");
                                System.out.println("2. Thêm ôtô");
                                System.out.println("3.Thêm xe máy");
                                System.out.println("4.Quay lại menu");
                                System.out.println("=================================================");
                                System.out.println("mời bạn nhập lựa chọn của mình");
                                choice=Integer.parseInt(scanner.nextLine());
                                if (choice>=1&&choice<=3){
                                    iServiceTransportation.addTransportation(choice);
                                }else if (choice==4){
                                    System.out.println("bạn đã chọn quay trở lại Menu");
                                    check=true;
                                }
                            }while (!check);


                            break;
                        case 2:
                            boolean checkCase2=false;
                            System.out.println("bạn đã chọn hiển  thị danh sách phương tiện");
                            int choiceCase2;
                            do {
                                System.out.println("===============================================");
                                System.out.println("1.Hển thị xe tải");
                                System.out.println("2.Hiển thị xe Oto");
                                System.out.println("3.Hiển thị xe máy");
                                System.out.println("4.Quay lại Menu");
                                System.out.println("===============================================");
                                System.out.println("mời bạn nhập lụa chọn của mình");
                                choiceCase2=Integer.parseInt(scanner.nextLine());
                                if (choiceCase2>=1&&choiceCase2<=3){
                                    iServiceTransportation.showTransportation(choiceCase2);
                                }else if (choiceCase2==4){
                                    System.out.println("bạn đã chọn quay lại trở lại Menu");
                                    checkCase2=true;
                                }

                            }while (choiceCase2!=4);

                            break;
                        case 3:
                            System.out.println("bạn đã chọn xóa phương tiện");
                            boolean checkCase3=false;
                            int choiceCase3;
                            do{
                                System.out.println("=============================================================");
                                System.out.println("1.Sửa xe tải");
                                System.out.println("2.Sửa Oto");
                                System.out.println("3.Sửa xe máy");
                                System.out.println("4.Quay trở lại Menu");
                                System.out.println("=============================================================");
                                System.out.println("mời bạn nhập lựa chọn của mình");
                                choiceCase3=Integer.parseInt(scanner.nextLine());
                                if (choiceCase3>=1&&choiceCase3<=3){
                                iServiceTransportation.editTransportation(choiceCase3);
                                }else if (choiceCase3==4){
                                    System.out.println("bạn đã chọn quay trở lại Menu");
                                    checkCase3=true;
                                }
                            }while (choiceCase3!=4);
                            break;
                        case 4:
                            System.out.println("bạn đã chọn xóa phương tiện");
                            boolean checkCase4=false;
                            int choiceCase4;
                            do{
                                System.out.println("====================================================================");
                                System.out.println("1.Xóa xe tải");
                                System.out.println("2.Xóa xe Oto");
                                System.out.println("3.Xóa xe máy");
                                System.out.println("4.Quay trở lại Menu");
                                System.out.println("====================================================================");
                                System.out.println("mời bạn chọn chức năng của mình ");
                                choiceCase4=Integer.parseInt(scanner.nextLine());
                                if (choiceCase4>=1&&choiceCase4<=3){
                                    iServiceTransportation.deleteTransportation(choiceCase4);

                                }else if (choiceCase4==4){
                                    System.out.println("bạn đã chọn quay trở lại Menu");
                                    checkCase4=true;
                                }
                            }while (!checkCase4);
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
