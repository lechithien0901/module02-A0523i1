package case_study_module02.task6.servicebooking;

import case_study_module02.task4.model.Customer;
import case_study_module02.task4.repository.RepositoryCustomer;
import case_study_module02.task5.model.Facility;
import case_study_module02.task5.repository.FacilityRepository;
import case_study_module02.task6.model.Booking;
import case_study_module02.task6.model.Contract;
import case_study_module02.task6.repositorybooking.IRepositoryBooking;
import case_study_module02.task6.repositorybooking.RepositoryBooking;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceBooking implements IServiceBooking {
    Scanner scanner = new Scanner(System.in);
    static final String CHECK_DATE = "^(?:[2-9][0-9]|1[89])\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";
    IRepositoryBooking iRepositoryBooking=new RepositoryBooking();

    public boolean checkDate(String stringOfMe) {
        Pattern pattern = Pattern.compile(CHECK_DATE);
        Matcher matcher = pattern.matcher(stringOfMe);
        boolean check = matcher.matches();
        return check;
    }

    @Override
    public void addBooking() {

        boolean checkInput = false;
        while (!checkInput) {
            try {
                System.out.println("mời bạn nhập mã Booking");
                String bookingService = scanner.nextLine();

                String dateRent = "";
                boolean checkDate = false;
                while (!checkDate) {
                    System.out.println("mời bạn nhập ngày booking theo định dạng sau  yyyy-mm-dd");
                    dateRent = scanner.nextLine();
                    if (this.checkDate(dateRent)) {
                        System.out.println("bạn đã nhập đúng định dạng rồi");
                        checkDate = true;
                    } else {
                        System.out.println("bạn đã nhập sai vui lòng nhập lại");
                        checkDate = false;
                    }

                }
                String[] stringSplit = dateRent.split("-");
                Date dateOfRent = new Date(Integer.parseInt(stringSplit[0]), Integer.parseInt(stringSplit[1]), Integer.parseInt(stringSplit[2]));
                boolean checkStarDate = false;
                String starDate = "";
                while (!checkStarDate) {
                    System.out.println("mời bạn nhập ngày bắt đầu theo định dạng sau yyyy-mm-dd");
                    starDate = scanner.nextLine();
                    if (this.checkDate(starDate)) {
                        System.out.println("bạn đã nhập đúng mã định dạng rồi");
                        checkStarDate = true;
                    } else {
                        System.out.println("bạn đã nhập sai mã vui lòng nhập lại");
                        checkStarDate = false;
                    }

                }
                String[] stringSplitStarDate = starDate.split("-");
                Date dateStar = new Date(Integer.parseInt(stringSplitStarDate[0]), Integer.parseInt(stringSplitStarDate[1]), Integer.parseInt(stringSplitStarDate[2]));
                boolean checkEndDate = false;
                String endDate = "";
                while (!checkEndDate) {
                    System.out.println("mời bạn nhập ngày trả theo định dạng sau yyyy-mm-dd");
                    endDate = scanner.nextLine();
                    if (this.checkDate(endDate)) {
                        System.out.println("bạn đã nhập đúng định dạng rồi");
                        checkEndDate = true;
                    } else {
                        System.out.println("bạn đã nhập sai vui lòng nhập lại");
                        checkEndDate = false;
                    }
                }
                String[] stringSplitEndDate = endDate.split("-");

                Date dateEnd = new Date(Integer.parseInt(stringSplitEndDate[0]), Integer.parseInt(stringSplitEndDate[1]), Integer.parseInt(stringSplitEndDate[2]));

                System.out.println("================================================================================================");
                RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
                ArrayList<Customer> arrayList = repositoryCustomer.showCustomer();
                System.out.println("sau đây là danh sách của Customer");
                for (Customer customer : arrayList) {
                    System.out.println(customer);
                }
                FacilityRepository facilityRepository = new FacilityRepository();
                LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();
                System.out.println("đây là danh sách của phần dịch vụ");
                facilityIntegerLinkedHashMap = facilityRepository.showFacility();
                System.out.println("===============================================================================================");
                System.out.println("mời bạn dựa trên danh sách của Customer và danh sách dịch vụ vào nhập vào đây");
                System.out.println("mời bạn nhập mã khách hàng vào đây ");
                String customerCode = scanner.nextLine();
                System.out.println("mời bạn nhập mã dịch vụ vào đây");
                String serviceCode = scanner.nextLine();
                checkInput = true;
                Booking booking=new Booking(bookingService,dateOfRent,dateStar,dateEnd,customerCode,serviceCode);
                iRepositoryBooking.addBooking(booking);
            } catch (NumberFormatException e) {
                System.out.println("bạn đã nhập sai dữ liệu đầu vào");
                checkInput = false;
            } catch (NullPointerException e) {
                checkInput = false;
                System.out.println("có một phần tử của bạn bị Null");
            }

        }


    }

    @Override
    public void Edit() {
        RepositoryBooking repositoryBooking=new RepositoryBooking();
        System.out.println("mời bạn nhập số hợp đồng cần sửa");
        String someContracts=scanner.nextLine();
        Contract contract=repositoryBooking.checkContract(someContracts);
        if (contract!=null){
            System.out.println("mời bạn nhập mã booking");
            String bookingCode=scanner.nextLine();
            contract.setBookingCode(bookingCode);
            System.out.println("mời bạn số tiền cọc");
            double advanceDeposit=Double.parseDouble(scanner.nextLine());
            contract.setAdvanceDeposit(advanceDeposit);
            System.out.println("mời bạn nhập số tiền tổng cần trả");
            double totalPayment=Double.parseDouble(scanner.nextLine());
            contract.setTotalPayment(totalPayment);
            iRepositoryBooking.Edit(contract.getNumberContracts(),contract);
        }else {
            System.out.println("Phần tử không tìm thấy");
        }



    }

    @Override
    public TreeSet<Booking> showBooking() {
        TreeSet<Booking>bookingTreeSet=iRepositoryBooking.showBooking();
        return bookingTreeSet;
    }

    @Override
    public void addContract() {

        iRepositoryBooking.addContract();





    }

    @Override
    public Queue<Contract> showContract() {
        RepositoryBooking repositoryBooking=new RepositoryBooking();
        Queue<Contract>contracts=repositoryBooking.showContract();
        return contracts;
    }
}
