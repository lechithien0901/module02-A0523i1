package case_study_module02.task5.controller;

import case_study_module02.task5.service.FacilityService;
import case_study_module02.task5.service.IFacilityService;

import java.util.Scanner;

public class ControllerFacility {
    Scanner scanner = new Scanner(System.in);
    IFacilityService iFacilityService= new FacilityService();

    public void disPlay() {
        boolean checkAll = false;
        while (!checkAll) {
            try {
                int choiceOfMe;
                do {
                    System.out.println("===============================================");
                    System.out.println("1.Hiển thị danh sách facility");
                    System.out.println("2.Thêm mới Facility");
                    System.out.println("3.Hiển thị danh sách Facility cần bảo trì");
                    System.out.println("4.Exit");
                    System.out.println("===============================================");
                    System.out.println("mời bạn nhập lựa chọn của mình : ");
                    choiceOfMe = Integer.parseInt(scanner.nextLine());
                    switch (choiceOfMe) {
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

                } while (choiceOfMe != 4);
            } catch (NumberFormatException e) {
                System.out.println("bạn nhập sai dữ liệu đầu vào Vui Lòng bạn nhập lại Facility Management");
                checkAll = false;
            } catch (NullPointerException e) {
                System.out.println("có một phần tử của bạn bị Null ");
                checkAll = false;
            }
        }
    }
}
