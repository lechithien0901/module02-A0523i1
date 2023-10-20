package case_study_module02.task1.controllers;


import case_study_module02.task1.service.*;

import java.util.Scanner;

public class FuramaController {
    IServiceEmployee iServiceEmployee=new ServiceEmployee();
    IServiceCustomer iServiceCustomer=new ServiceCustomer();
    IFacilityService iFacilityService=new FacilityService();
   IServiceBooking iServiceBooking=  new ServiceBooking();
   IServiceManagement iServiceManagement=new ServiceManagement();
Scanner scanner=new Scanner(System.in);
    public  void disPlayMainMenu(){
        int choiceAll=0;
        boolean checkOfFuramaController=true;
        do{
            System.out.println("=========================================");
            System.out.println("Đây là menu của FuramaController");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println("=========================================");
            System.out.println("mời bạn chọn chức lựa chọn của bạn");
            choiceAll=Integer.parseInt(scanner.nextLine());
            switch (choiceAll){
                case 1:
                    System.out.println("1 Display list employees");
                    System.out.println("2 Add new employee");
                    System.out.println("3 Edit employee");
                    System.out.println("4 Return main menu");
                    int choiceOfMe;
                    try {
                        do {
                            System.out.println("Đây là danh sách của Employee");
                            System.out.println("==============================================");
                            System.out.println("1.Thêm đối tương Employeement");
                            System.out.println("2.Hiển thị đối tượng Employeement");
                            System.out.println("3.Sửa đối tượng Employeement");
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
                                case 2:
                                    System.out.println("bạn đã chọn hiển thị danh sách của mình");
                                    iServiceEmployee.showEmployee();
                                    break;
                                case 3:
                                    System.out.println("bạn đa chọn sửa đối tương ");
                                    iServiceEmployee.fixEmployee();
                                    break;
                                case 4:
                                    System.out.println("bạn đã chọn xóa đối tượng ");
                                    iServiceEmployee.deleteEmployee();
                                    break;
                            }
                        }while (choiceOfMe>=1&&choiceOfMe<=4);
                    }catch (NumberFormatException e){
                        System.out.println("bạn đã nhập một giá trị không đúng mình đã cho");
                    }


            break;
                case 2:
                    System.out.println("1. Display list customers");
                    System.out.println("2. Add new customer");
                    System.out.println("3. Edit customer");
                    System.out.println("4. Return main menu");
                    try {
                        int choiceOfCase2;
                        do {
                            System.out.println("Sau đây là danh sách của Customer");
                            System.out.println("=========================================================");
                            System.out.println("1.Hiển thị danh sách khách hàng Customer");
                            System.out.println("2.Thêm Customer cho danh sách");
                            System.out.println("3.Sửa thông tin Customer");
                            System.out.println("4.Xóa Customer theo tên");
                            System.out.println("=========================================================");
                            System.out.println("Mời bạn nhập lựa chọn của mình");
                            choiceOfCase2 = Integer.parseInt(scanner.nextLine());
                            switch (choiceOfCase2) {
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
                        } while (choiceOfCase2 >= 1 && choiceOfCase2 <= 4);
                    } catch (NullPointerException e){
                        System.out.println("có thể phần tử nào đó bị Null");
                    }catch (NumberFormatException e){
                        System.out.println("bạn đã nhập sai dữ liệu đầu vào rồi");
                    }

                   break;
                case 3:
                    System.out.println("1 Display list facility");
                    System.out.println("2 Add new facility");
                    System.out.println("3 Display list facility maintenance");
                    System.out.println("4 Return main menu");
                    boolean checkAll = false;
                    while (!checkAll) {
                        try {
                            int choiceOfCase3;
                            do {
                                System.out.println("===============================================");
                                System.out.println("1.Hiển thị danh sách facility");
                                System.out.println("2.Thêm mới Facility");
                                System.out.println("3.Hiển thị danh sách Facility cần bảo trì");
                                System.out.println("4.Exit");
                                System.out.println("===============================================");
                                System.out.println("mời bạn nhập lựa chọn của mình : ");
                                choiceOfCase3 = Integer.parseInt(scanner.nextLine());
                                switch (choiceOfCase3) {
                                    case 1:
                                        System.out.println("bạn đã chọn hiển thị danh sách Facility");
                                        iFacilityService.showFacility();
                                        break;
                                    case 2:
                                        System.out.println("bạn đã chọn thêm mới danh sách Facility");
                                        boolean checkAdd = false;
                                        int choiceAdd;
                                        while (!checkAdd) {
                                            try {
                                                do {
                                                    System.out.println("============================================");
                                                    System.out.println("1.Add Villa");
                                                    System.out.println("2.Add House");
                                                    System.out.println("3.Add Room");
                                                    System.out.println("4.Quay về Menu chính");
                                                    System.out.println("============================================");
                                                    choiceAdd = Integer.parseInt(scanner.nextLine());
                                                    if (choiceAdd >= 1 && choiceAdd <= 3) {
                                                        iFacilityService.addFacility(choiceAdd);
                                                    } else if (choiceAdd == 4) {
                                                        System.out.println("bạn đã chọn quay về Menu chính");
                                                        checkAdd = true;
                                                    } else {
                                                        System.out.println("lựa chọn của bạn không có trong Menu");
                                                    }
                                                } while (choiceAdd!=4);
                                            } catch (NullPointerException e) {
                                                System.out.println("Có một phần tử của bạn bị Null");

                                                System.out.println("Vui lòng nhập lại lựa chọn của danh sách thêm Facility" +
                                                        "");
                                            } catch (NumberFormatException e) {
                                                System.out.println("Bạn đã nhập sai dữ liệu đầu vào");
                                                System.out.println("Vui lòng nhập lại lựa chọn của danh sách thêm Facility");
                                            }
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Bạn đã hiển thị danh sách Facility cần bảo trì");
                                        iFacilityService.fixFacility();
                                        break;
                                    case 4:
                                        System.out.println("bạn đã chọn thoát Menu");
                                        checkAll = true;
                                        break;
                                    default:
                                        System.out.println("Không có,Lựa chọn của bạn không hợp lệ");
                                }

                            } while (choiceOfCase3 != 4);
                        } catch (NumberFormatException e) {
                            System.out.println("bạn nhập sai dữ liệu đầu vào Vui Lòng bạn nhập lại Facility Management");
                            checkAll = false;
                        } catch (NullPointerException e) {
                            System.out.println("có một phần tử của bạn bị Null ");
                            checkAll = false;
                        }
                    }

                    break;
                case 4:
                    boolean checkChoice = false;
                    while (!checkChoice){
                        int yourChoice;
                        try {
                            do {
                                System.out.println("=======================================================");
                                System.out.println("1. Add new booking");
                                System.out.println("2. Display list booking");
                                System.out.println("3. Create new contracts");
                                System.out.println("4. Display list contracts");
                                System.out.println("5. Edit contracts");
                                System.out.println("6. Exit Menu");
                                System.out.println("=======================================================");
                                System.out.println("mời bạn nhập lựa chọn của mình");
                                yourChoice=Integer.parseInt(scanner.nextLine());
                                switch (yourChoice){
                                    case 1:
                                        System.out.println("bạn đã chọn thêm mới Booking");
                                        iServiceBooking.addBooking();
                                        break;
                                    case 2:
                                        System.out.println("bạn đã chọn hiển thị danh sách Booking");
                                        iServiceBooking.showBooking();
                                        break;
                                    case 3:
                                        System.out.println("bạn đã chọn thêm mới Hợp đồng");
                                        iServiceBooking.addContract();
                                        break;
                                    case 4:
                                        System.out.println("bạn đã chọn hiển thị Hợp đồng");
                                        iServiceBooking.showContract();
                                        break;
                                    case 5:
                                        System.out.println("bạn đã chọn sửa hợp đồng");
                                        iServiceBooking.Edit();
                                        break;
                                    case 6:
                                        System.out.println("bạn đã chọn thoát khỏi menu");
                                        checkChoice=true;
                                        break;
                                    default:
                                        System.out.println("bạn nhập số không phù hợp");
                                }

                            } while (!checkChoice);
                        }catch (NullPointerException e){
                            System.out.println("có một phần tử của bạn bị Null");
                            checkChoice=false;
                        }catch (NumberFormatException e){
                            System.out.println("bạn đã nhập sai dữ liệu đầu vào");
                            checkChoice=false;
                        }

                    }
                    break;

                case 5:
                    System.out.println("1. Display list customers use service");
                    System.out.println("2. Display list customers get voucher");
                    System.out.println("3. Return main menu");
                    boolean checkChoiceCase5=false;
                    while (!checkChoiceCase5){
                        try{
                            int choiceOfCase5;
                            do {
                            System.out.println("Sau đây là danh sách của Management");
                            System.out.println("=============================================================");
                            System.out.println("1.Hiển thị danh sách Customer sử dụng dịch vụ 1 năm.");
                            System.out.println("2.Hiển thị danh sách Customer lấy được vocher.");
                            System.out.println("3.Quay về menu chính.");
                            System.out.println("=============================================================");
                            System.out.println("mời bạn nhập lựa chọn của mình");
                            choiceOfCase5=Integer.parseInt(scanner.nextLine());
                            switch (choiceOfCase5){
                                case 1:
                                    System.out.println("bạn đã chọn hiển thị danh sách của Customer sử dụng dịch vụ 1 năm");
                                    iServiceManagement.showCustomer();
                                    break;
                                case 2:
                                    System.out.println("bạn đã chọn hiển thị danh sách Customer nhận được voucher");
                                    iServiceManagement.voucherStack();
                                    break;
                                case 3:
                                    checkChoiceCase5=true;
                                    break;
                            }
                        }while (choiceOfCase5!=3);
                        }catch (NumberFormatException e){
                            System.out.println("Bạn đã nhập dữ liệu đầu vào bị sai");
                            checkChoiceCase5=false;
                        }catch (NullPointerException e){
                            System.out.println("Có một phần tử của bạn bị Null");
                            checkChoiceCase5=false;
                        }


                    }
                    break;
                case 6:
                    checkOfFuramaController=false;
                    System.out.println("bạn đã chọn thoát khỏi chương trình");
break;
                default:
                    System.out.println("bạn nhập không có trong danh sách FuramaController");
            }


        }while(checkOfFuramaController);
    }
}




