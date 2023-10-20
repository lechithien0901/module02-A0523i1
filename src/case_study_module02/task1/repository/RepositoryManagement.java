package case_study_module02.task1.repository;

import case_study_module02.task1.model.Booking;
import case_study_module02.task1.model.Customer;
import case_study_module02.task1.model.Facility;

import java.time.LocalDate;
import java.util.*;

public class RepositoryManagement implements IRepositoryManagement {
    static RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
    static FacilityRepository facilityRepository = new FacilityRepository();
    static RepositoryBooking repositoryBooking = new RepositoryBooking();
    static ArrayList<Customer> customerArrayList = new ArrayList<>();
static Stack<String>voucherStack=new Stack<>();
    static LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    static Comparator<Booking> comparator = new Comparator<Booking>() {
        @Override
        public int compare(Booking o1, Booking o2) {
            int startDate = o2.getStartDate().compareTo(o1.getStartDate());
            if (startDate != 0) {
                return startDate;
            } else {
                return o2.getEndDate().compareTo(o1.getEndDate());
            }
        }
    };

    static TreeSet<Booking> bookingTreeSet = new TreeSet<>(comparator);

    @Override
    public ArrayList<Customer> showCustomer() {
        TreeSet<Booking> treeSet = new TreeSet<>();

        treeSet = RepositoryBooking.getBookingTreeSet();
        System.out.println("Mời bạn nhập năm booking vào đây để được tặng voucher: ");
        int yearOfBooking = Integer.parseInt(scanner.nextLine());
        for (Booking booking : treeSet) {
            LocalDate localDate=booking.getBookingDate();
            int yearOfCheck=localDate.getYear();

            if (yearOfBooking == yearOfCheck) {
                bookingTreeSet.add(booking);
            }
        }
        System.out.println("Sau đây là danh sách người booking trễ đến sớm nhất  ");
        for (Booking booking:bookingTreeSet){

            System.out.println(booking);
        }

        System.out.println("Danh sách các khách hàng đã booking trong năm " + yearOfBooking + ":");
        ArrayList<Customer> customers = repositoryCustomer.showCustomer();

        for (Customer customer : customers) {
        for (Booking booking : bookingTreeSet) {

                if (customer.getCustomerCode().equals(booking.getCustomerCode())) {
                   customerArrayList.add(customer);
                }
            }
        }
        for (Customer customer: customerArrayList){
            System.out.println(customer);
        }

        return customerArrayList;
    }

    @Override
    public Stack<String> voucherStack() {
        System.out.println("mời bạn nhập số lượng từng voucher trong (Lưu ý:voucher phải bằng số lượng khách hàng không thiếu không dư)");
        System.out.println("mời bạn nhập số lượng cho Voucher 10% ");
        int percent10= scanner.nextInt();
        System.out.println("mời bạn nhập số lượng cho Voucher 20% ");
        int percent20=scanner.nextInt();
        System.out.println("mời bạn nhập số lượng cho Voucher 50% ");
        int percent50=scanner.nextInt();
        int totalVoucher=percent10+percent20+percent50;
        int currentPercent=10;
        for (int i = 0; i <totalVoucher ; i++) {
            if (i==percent10){
                currentPercent=20;
            }   else if (i==percent10+percent20){
                currentPercent=50;
            }
            if (i<customerArrayList.size()){

                voucherStack.push(customerArrayList.get(i)+" nhận được Voucher trị giá "+currentPercent+"%");

            }else {
                System.out.println(" không có khách hàng nào tồn tại để nhận voucher "+currentPercent+"%");
            }

        }
        while (!voucherStack.isEmpty()){
            System.out.println(voucherStack.pop());
        }
        return voucherStack;
    }
}