package case_study_module02.task1.repository;

import case_study_module02.task1.model.Booking;
import case_study_module02.task1.model.Contract;
import case_study_module02.task1.model.Facility;

import java.time.LocalDate;
import java.util.*;

public class RepositoryBooking implements IRepositoryBooking{
    Scanner scanner = new Scanner(System.in);
    static TreeSet<Booking> bookingTreeSet = new TreeSet<>(Booking::compareTo);
    static Queue<Booking> bookingQueue = new LinkedList<>();
    static Queue<Contract> contractQueue = new LinkedList<>();

    static {
        bookingTreeSet.add(new Booking("B0000", LocalDate.of(2023, 9, 5),LocalDate.of(2023, 9, 10), LocalDate.of(2023, 9, 15), "KH-0001", "SVVL-0000"));
        bookingTreeSet.add(new Booking("B0001", LocalDate.of(2023, 9, 5), LocalDate.of(2023, 9, 10), LocalDate.of(2023, 9, 11), "KH-0002", "SVVL-0001"));
        bookingTreeSet.add(new Booking("B0002", LocalDate.of(2023, 8, 5),LocalDate.of(2023, 8, 9), LocalDate.of(2023, 8, 11), "KH-0003", "SVVL-0002"));
    }

    static FacilityRepository facilityRepository = new FacilityRepository();

    static LinkedHashMap<Facility, Integer> facilityInterger = facilityRepository.saveLiked();

    public LinkedHashMap<Facility, Integer> saveFacilityOfBoooking() {
        return facilityInterger;
    }

    public static TreeSet<Booking> getBookingTreeSet() {
        return bookingTreeSet;
    }

    public Queue<Booking> saveFacilityOfBookingQueue() {
        return bookingQueue;
    }
    public  Queue<Contract>saveContracQueue(){
        return contractQueue;
    }

    @Override
    public void Edit(String stringOfContract,Contract contract) {
        Queue<Contract>contractQueueOfMe=new LinkedList<>();
        contractQueueOfMe=contractQueue;


        boolean check=false;
        for (Contract contract2:contractQueueOfMe){
            if (contract2.getNumberContracts().equals(stringOfContract)){
                contract2.setBookingCode(contract.getBookingCode());
                contract2.setAdvanceDeposit(contract.getAdvanceDeposit());
                contract2.setTotalPayment(contract.getTotalPayment());
                check=true;
            }

        }
        if (check){

            System.out.println("sau khi sửa");
            for (Contract contract2:contractQueueOfMe){
                if (stringOfContract.equals(contract2.getNumberContracts())){
                    System.out.println(contract2);
                }
            }
        }
        else {
            System.out.println("phần tử không tìm thấy trong danh sách");
        }



    }

    public void transferBookingToQueue() {
        for (Booking booking : bookingTreeSet) {
            bookingQueue.offer(booking);
        }
    }


    @Override
    public void addBooking(Booking booking) {
        bookingTreeSet.add(booking);
        System.out.println("danh sách thêm mới của bạn thành công");

        boolean check = false;
        for (Map.Entry<Facility, Integer> facilityIntegerMap : facilityInterger.entrySet()) {
            Facility facility = facilityIntegerMap.getKey();
            if (facility.getServiceCode().equals(booking.getServiceCode())) {
                System.out.println("mã dịch vụ của bạn có trong danh sách của Facility");
                int intergerOfFacility = facilityIntegerMap.getValue();
                facilityInterger.put(facility, intergerOfFacility + 1);
                check = true;
            }
        }
        if (!check) {
            System.out.println(booking.getServiceCode() + "phần tử này không có trong phần dịch vụ nên nó là phần tử mới");
        }
        System.out.println("Sau đây là danh sách đã được cập nhật");
        for (Map.Entry<Facility, Integer> map : facilityInterger.entrySet()) {
            Facility facility = map.getKey();
            int interger = map.getValue();
            System.out.println(facility + " với số lần sử dụng " + interger);
        }
    }

    @Override
    public TreeSet<Booking> showBooking() {
        TreeSet<Booking> bookings = new TreeSet<>(Booking::compareTo);
        bookings = bookingTreeSet;
        System.out.println("Sau đây là danh sách đã được sắp xếp");
        for (Booking booking : bookings) {
            System.out.println(booking.toString());
        }
        return bookings;


    }

    @Override
    public void addContract() {
        this.transferBookingToQueue();
        System.out.println("Sau đây là danh sách bạn cần sử lí Hợp Đồng");
        for (Booking booking : bookingTreeSet) {
            System.out.println(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Contract contract=new Contract();
            System.out.println(" Mời bạn làm hợp Động với Đối tượng dưới đây ");
            Booking booking = bookingQueue.poll();
            System.out.println(booking);
            System.out.println("mời bạn nhập số hợp động cần cho dịch vụ và khách hàng trên");
            String numberOfContract = scanner.nextLine();
            contract.setNumberContracts(numberOfContract);
            System.out.println("Mã Booking");
            contract.setBookingCode(booking.getBookingCode());
            System.out.println(contract.getBookingCode());
            System.out.println("mời bạn cọc số tiền trước");
            contract.setAdvanceDeposit(Double.parseDouble(scanner.nextLine()));
            System.out.println("mời bạn nhập số tiền thanh toán của mình");
            contract.setTotalPayment(Double.parseDouble(scanner.nextLine()));
            contractQueue.add(contract);
        }
        if (bookingQueue.isEmpty()){
            System.out.println("không Còn danh sách booking để thêm hợp đồng");
        }
    }

    @Override
    public Queue<Contract> showContract() {
        Queue<Contract>contractOfQueue=contractQueue;
        for (Contract contract:contractOfQueue){
            System.out.println(contract);
        }

        return contractOfQueue;
    }
    public Contract checkContract(String stringCheckContract){
        Queue<Contract>contracts=contractQueue;

        for (Contract contract:contracts){
            if (contract.getNumberContracts().equals(stringCheckContract)){
                System.out.println("số hợp động đã được tìm thấy");
                System.out.println(contract);
                return contract;
            }
        }
        return null;


    }
}
