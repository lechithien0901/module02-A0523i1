package case_study_module02.task6.controllerbooking;

import case_study_module02.task6.servicebooking.IServiceBooking;
import case_study_module02.task6.servicebooking.ServiceBooking;

import java.util.Scanner;

public class ControllerBooking {
    public void BookingManagement() {
        IServiceBooking iServiceBooking=new ServiceBooking();

        Scanner scanner=new Scanner(System.in);
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



    }
}
