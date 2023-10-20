package case_study_module02.task5.repository;

import case_study_module02.task5.model.Facility;
import case_study_module02.task5.model.House;
import case_study_module02.task5.model.Room;
import case_study_module02.task5.model.Villa;
import case_study_module02.task6.repositorybooking.RepositoryBooking;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FacilityRepository implements IFacilityRepository {
    Scanner scanner = new Scanner(System.in);
    static final String CHECK_FACILITY_SERVICE_CODE_VILLA = "^SVVL+-+\\d{4}$";
    static final String CHECK_FACILITY_SERVICE_CODE_HOUSE = "^SVHO+-+\\d{4}$";
    static final String CHECK_FACILITY_SERVICE_CODE_ROOM = "^SVRO+-+\\d{4}$";
    static final String CHECK_FACILITY_NAME = "^[A-Z][a-z]*$";
    static final String CHECK_FACILITY_AREA = "^(3[0-9]|[4-9][0-9]|[1-9][0-9]{2,})\\.\\d+$";
    static final String CHECK_FACILITY_RENTALCOST = "^[1-9][0-9]*$";
    static final String CHECK_FACILITY_MAXOCCUPANCY = "^(0?[1-9]|1\\d)$";
    static final String CHECK_FACILITY_FLOOR = "^[1-9][0-9]*$";
    static final String CHECK_FACILITY_RENTYPE = "^[A-Z][a-z]*$";
    static final String CHECK_FACILITY_ROOMSTARD = "^[A-Z][a-z]*$";
    static LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap = new LinkedHashMap<>();


    static {

        facilityIntegerLinkedHashMap.put(new Villa("SVVL-0000", "Villa", 40, 40, 11, "Gio", "Vip", 40, 7), 0);
        facilityIntegerLinkedHashMap.put(new Villa("SVVL-0001", "Villa", 40, 40, 11, "Gio", "Vip", 40, 7), 0);
        facilityIntegerLinkedHashMap.put(new Villa("SVVL-0002", "Villa", 40, 40, 11, "Gio", "Vip", 40, 7), 0);


    }

    public boolean checkString(String stringOfMe, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringOfMe);
        boolean checkStringOfMe = matcher.matches();
        return checkStringOfMe;
    }

public static LinkedHashMap<Facility,Integer>saveLiked(){
        return facilityIntegerLinkedHashMap;
}
    @Override
    public LinkedHashMap<Facility, Integer> showFacility() {
        RepositoryBooking repositoryBooking=new RepositoryBooking();
        LinkedHashMap<Facility, Integer> facilityIntegerLinkedHashMap1 = new LinkedHashMap<>();
        facilityIntegerLinkedHashMap1 = repositoryBooking.saveFacilityOfBoooking();
        for (Map.Entry<Facility, Integer> facilityIntegerMap : facilityIntegerLinkedHashMap1.entrySet()) {
            Facility facility = facilityIntegerMap.getKey();
            Integer integer = facilityIntegerMap.getValue();
            System.out.println(facility + " với giá trị của nó là " + integer);
        }
        return facilityIntegerLinkedHashMap1;
    }

    @Override
    public void addFacility(int choice, Facility facility) {
        if (choice == 1) {
            boolean checkAll = false;
            while (!checkAll) {
                try {

                    System.out.println("sau đây là danh sách thêm của Villa");
                    boolean checkServiceCode = false;
                    System.out.println("mời bạn nhập mã Dịch vụ phải đúng định dạng SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                            "\n" +
                            "+ Nếu là Villa thì XX sẽ là VL\n" +
                            "+ Nếu là House thì XX sẽ là HO\n" +
                            "+ Nếu Room thì XX sẽ là RO");
                    facility.setServiceCode(scanner.nextLine());
                    while (!checkServiceCode) {
                        if (this.checkString(facility.getServiceCode(), CHECK_FACILITY_SERVICE_CODE_VILLA)) {
                            System.out.println("bạn đã nhập đúng định dạng cho Villa");
                            checkServiceCode = true;


                        } else {
                            System.out.println("mời bạn nhập mã Dịch vụ phải đúng định dạng SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                                    "\n" +
                                    "+ Nếu là Villa thì XX sẽ là VL\n" +
                                    "+ Nếu là House thì XX sẽ là HO\n" +
                                    "+ Nếu Room thì XX sẽ là RO");
                            facility.setServiceCode(scanner.nextLine());
                            checkServiceCode = false;
                        }

                    }

                    boolean checkServiceName = false;
                    System.out.println("mời bạn nhập tên của dịch vụ Villa Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                    facility.setServiceName(scanner.nextLine());
                    while (!checkServiceName) {
                        if (this.checkString(facility.getServiceName(), CHECK_FACILITY_NAME)) {
                            System.out.println("bạn đã nhập đúng tên định dạng của dịch vụ Villa");
                            checkServiceName = true;
                        } else {
                            System.out.println("bạn đã nhập sai tên của dịch vụ Villa Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                            facility.setServiceName(scanner.nextLine());

                        }

                    }
                    boolean checkArea = false;
                    System.out.println("mời bạn nhập diện tích đã sử dụng cho Villa (Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2)");
                    Double parstArea = facility.setArea(Double.parseDouble(scanner.nextLine()));
                    String parstOfArea = parstArea.toString();
                    while (!checkArea) {
                        if (this.checkString(parstOfArea, CHECK_FACILITY_AREA)) {
                            System.out.println("bạn đã nhập đúng diện tích yêu cầu đề ra cho Villa");
                            facility.setArea(Double.parseDouble(parstOfArea));
                            checkArea = true;
                        } else {
                            System.out.println("bạn đã nhập sai diện tích cho Villa (Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2)");
                            parstArea = facility.setArea(Double.parseDouble(scanner.nextLine()));
                            parstOfArea = parstArea.toString();
                        }
                    }
                    boolean checkRental = false;
                    System.out.println("mời bạn nhập chi phí thuê phải là số dương");
                    Double parstRentalCost = facility.setRentalCost(Double.parseDouble(scanner.nextLine()));
                    String pastOfRentalCost = parstRentalCost.toString();
                    while (!checkRental) {
                        if (this.checkString(pastOfRentalCost, CHECK_FACILITY_AREA)) {
                            System.out.println("bạn đã nhập đúng chi phí thuê của Villa");
                            facility.setRentalCost(Double.parseDouble(pastOfRentalCost));
                            checkRental = true;
                        } else {
                            System.out.println("Bạn đã nhập sai chi phí thuê của Villa(hi phí thuê phải là số dương)");
                            parstRentalCost = facility.setRentalCost(Double.parseDouble(scanner.nextLine()));
                            pastOfRentalCost = parstRentalCost.toString();
                            checkRental = false;

                        }
                    }
                    boolean checkMaxOccupancy = false;
                    System.out.println("mời bạn nhập số lượng có thể chứa được trong Villa Vui Lòng(Số lượng người tối đa phải >0 và nhỏ hơn <20)");
                    Integer parstMaxOccupancy = facility.setMaxOccupancy(Integer.parseInt(scanner.nextLine()));
                    String parstOfMaxccupancy = parstMaxOccupancy.toString();
                    while (!checkMaxOccupancy) {
                        if (this.checkString(parstOfMaxccupancy, CHECK_FACILITY_MAXOCCUPANCY)) {
                            System.out.println("bạn đã nhập đúng số người quy định của Villa");
                            facility.setMaxOccupancy(Integer.parseInt(parstOfMaxccupancy));
                            checkMaxOccupancy = true;
                        } else {
                            System.out.println("bạn đã nhập số lượng yêu cầu của Villa Vui Lòng (Số lượng người tối đa phải >0 và nhỏ hơn <20)");
                            parstMaxOccupancy = facility.setMaxOccupancy(Integer.parseInt(scanner.nextLine()));
                            parstOfMaxccupancy = parstMaxOccupancy.toString();
                            checkMaxOccupancy = false;
                        }

                    }
                    boolean checkRentType = false;
                    System.out.println("mời bạn nhập Kiểu thuê cho Villa Vui Lòng(Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ)");
                    System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                    facility.setRentType(scanner.nextLine());
                    while (!checkRentType) {
                        if (this.checkString(facility.getRentType(), CHECK_FACILITY_RENTYPE)) {
                            System.out.println("bạn đã nhập đúng kiểu thuê cho Villa");
                            checkRentType = true;
                        } else {
                            System.out.println("bạn đã nhập sai Vui Lòng(Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ)");
                            System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                            facility.setRentType(scanner.nextLine());
                            checkRentType = false;
                        }
                    }
                    boolean checkStardRoom = false;
                    System.out.println("mời bạn nhập tiêu chuẩn phòng cho Villa Vui Lòng((Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ))");
                    System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                    ((Villa) facility).setStardardRoom(scanner.nextLine());
                    while (!checkStardRoom) {
                        if (this.checkString(((Villa) facility).getStardardRoom(), CHECK_FACILITY_ROOMSTARD)) {
                            System.out.println("bạn đã nhập đúng Tiêu chuẩn phòng cho Villa");
                            checkStardRoom = true;
                        } else {
                            System.out.println("bạn đã nhập sai Vui Lòng(Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ)");
                            System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                            ((Villa) facility).setStardardRoom(scanner.nextLine());
                            checkStardRoom = false;
                        }

                    }
                    boolean checkPoolArea = false;
                    System.out.println("mời bạn nhập diện tích hồ bơi đã sử dụng cho Villa (Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2)");
                    Double parstPoolArea = ((Villa) facility).setPoolArea(Double.parseDouble(scanner.nextLine()));
                    String parstOfPoolArea = parstPoolArea.toString();
                    while (!checkPoolArea) {
                        if (this.checkString(parstOfPoolArea, CHECK_FACILITY_AREA)) {
                            System.out.println("bạn đã nhập đúng diện tích yêu cầu đề ra cho Villa");
                            ((Villa) facility).setPoolArea(Double.parseDouble(parstOfArea));
                            checkPoolArea = true;
                        } else {
                            System.out.println("bạn đã nhập sai diện tích hồ bơi cho Villa (Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2)");
                            parstPoolArea = ((Villa) facility).setPoolArea(Double.parseDouble(scanner.nextLine()));
                            parstOfPoolArea = parstPoolArea.toString();
                        }
                    }
                    boolean checkDoubleOfFloor = false;
                    System.out.println("mời bạn nhập sô tầng,Số tầng phải là số nguyên dương.");
                    Integer parstDoubleOfFloor = ((Villa) facility).setDoubleOfFloor(Integer.parseInt(scanner.nextLine()));
                    String parstDoubleOfFloorOfMe = parstDoubleOfFloor.toString();
                    while (!checkDoubleOfFloor) {
                        if (this.checkString(parstDoubleOfFloorOfMe, CHECK_FACILITY_MAXOCCUPANCY)) {
                            System.out.println("bạn đã nhập đúng sô tầng của Villa");
                            ;
                            ((Villa) facility).setDoubleOfFloor(Integer.parseInt(parstDoubleOfFloorOfMe));
                            checkDoubleOfFloor = true;
                            checkAll = true;
                        } else {
                            System.out.println("bạn đã nhập sai số lượng tầng của Villa (Vui Lòng là số dương)");
                            parstDoubleOfFloor = ((Villa) facility).setDoubleOfFloor(Integer.parseInt(scanner.nextLine()));
                            parstDoubleOfFloorOfMe = parstDoubleOfFloor.toString();
                            checkDoubleOfFloor = false;
                        }

                    }
                    facility = new Villa(facility.getServiceCode(), facility.getServiceName(), facility.getArea(), facility.getRentalCost(), facility.getMaxOccupancy(), facility.getRentType(), ((Villa) facility).getStardardRoom(), ((Villa) facility).getPoolArea(), ((Villa) facility).getDoubleOfFloor());

                  facilityIntegerLinkedHashMap.put(facility,0);


                } catch (NumberFormatException e) {
                    System.out.println("bạn đã nhập sai dữ liệu đầu vào khi thêm Villa");
                    checkAll = false;
                } catch (NullPointerException e) {
                    System.out.println("Có một phần tử của bạn bị Null khi thêm ");
                    checkAll = false;
                }

            }

        }
        if (choice == 2) {
            boolean checkAll = false;
            while (!checkAll) {
                try {
                    System.out.println("sau đây là danh sách thêm của House");
                    boolean checkServiceCode = false;
                    System.out.println("mời bạn nhập mã Dịch vụ phải đúng định dạng SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                            "\n" +
                            "+ Nếu là Villa thì XX sẽ là VL\n" +
                            "+ Nếu là House thì XX sẽ là HO\n" +
                            "+ Nếu Room thì XX sẽ là RO");
                    facility.setServiceCode(scanner.nextLine());
                    while (!checkServiceCode) {
                        if (this.checkString(facility.getServiceCode(), CHECK_FACILITY_SERVICE_CODE_HOUSE)) {
                            System.out.println("bạn đã nhập đúng định dạng cho House");
                            checkServiceCode = true;
                        } else {
                            System.out.println("mời bạn nhập mã Dịch vụ phải đúng định dạng SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                                    "\n" +
                                    "+ Nếu là Villa thì XX sẽ là VL\n" +
                                    "+ Nếu là House thì XX sẽ là HO\n" +
                                    "+ Nếu Room thì XX sẽ là RO");
                            facility.setServiceCode(scanner.nextLine());
                            checkServiceCode = false;
                        }

                    }
                    boolean checkServiceName = false;
                    System.out.println("mời bạn nhập tên của dịch vụ House Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                    facility.setServiceName(scanner.nextLine());
                    while (!checkServiceName) {
                        if (this.checkString(facility.getServiceName(), CHECK_FACILITY_NAME)) {
                            System.out.println("bạn đã nhập đúng tên định dạng của dịch vụ House");
                            checkServiceName = true;
                        } else {
                            System.out.println("bạn đã nhập sai tên của dịch vụ House Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                            facility.setServiceName(scanner.nextLine());
                            facility.setServiceName(scanner.nextLine());
                        }

                    }
                    boolean checkArea = false;
                    System.out.println("mời bạn nhập diện tích đã sử dụng cho House (Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2)");
                    Double parstArea = facility.setArea(Double.parseDouble(scanner.nextLine()));
                    String parstOfArea = parstArea.toString();
                    while (!checkArea) {
                        if (this.checkString(parstOfArea, CHECK_FACILITY_AREA)) {
                            System.out.println("bạn đã nhập đúng diện tích yêu cầu đề ra cho House");
                            facility.setArea(Double.parseDouble(parstOfArea));
                            checkArea = true;
                        } else {
                            System.out.println("bạn đã nhập sai diện tích cho House (Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2)");
                            parstArea = facility.setArea(Double.parseDouble(scanner.nextLine()));
                            parstOfArea = parstArea.toString();
                        }
                    }
                    boolean checkRental = false;
                    System.out.println("mời bạn nhập chi phí thuê phải là số dương");
                    Double parstRentalCost = facility.setRentalCost(Double.parseDouble(scanner.nextLine()));
                    String pastOfRentalCost = parstRentalCost.toString();
                    while (!checkRental) {
                        if (this.checkString(pastOfRentalCost, CHECK_FACILITY_AREA)) {
                            System.out.println("bạn đã nhập đúng chi phí thuê của House");
                            facility.setRentalCost(Double.parseDouble(pastOfRentalCost));
                            checkRental = true;
                        } else {
                            System.out.println("Bạn đã nhập sai chi phí thuê của House(hi phí thuê phải là số dương)");
                            parstRentalCost = facility.setRentalCost(Double.parseDouble(scanner.nextLine()));
                            pastOfRentalCost = parstRentalCost.toString();
                            checkRental = false;

                        }
                    }
                    boolean checkMaxOccupancy = false;
                    System.out.println("mời bạn nhập số lượng có thể chứa được trong House Vui Lòng(Số lượng người tối đa phải >0 và nhỏ hơn <20)");
                    Integer parstMaxOccupancy = facility.setMaxOccupancy(Integer.parseInt(scanner.nextLine()));
                    String parstOfMaxccupancy = parstMaxOccupancy.toString();
                    while (!checkMaxOccupancy) {
                        if (this.checkString(parstOfMaxccupancy, CHECK_FACILITY_MAXOCCUPANCY)) {
                            System.out.println("bạn đã nhập đúng số người quy định của House");
                            facility.setMaxOccupancy(Integer.parseInt(parstOfMaxccupancy));
                            checkMaxOccupancy = true;
                        } else {
                            System.out.println("bạn đã nhập số lượng yêu cầu của House Vui Lòng (Số lượng người tối đa phải >0 và nhỏ hơn <20)");
                            parstMaxOccupancy = facility.setMaxOccupancy(Integer.parseInt(scanner.nextLine()));
                            parstOfMaxccupancy = parstMaxOccupancy.toString();
                            checkMaxOccupancy = false;
                        }

                    }
                    boolean checkRentType = false;
                    System.out.println("mời bạn nhập Kiểu thuê cho House Vui Lòng(Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ)");
                    System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                    facility.setRentType(scanner.nextLine());
                    while (!checkRentType) {
                        if (this.checkString(facility.getRentType(), CHECK_FACILITY_RENTYPE)) {
                            System.out.println("bạn đã nhập đúng kiểu thuê cho House");
                            checkRentType = true;
                        } else {
                            System.out.println("bạn đã nhập sai Vui Lòng(Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ)");
                            System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                            facility.setRentType(scanner.nextLine());
                            checkRentType = false;
                        }
                    }
                    boolean checkStardRoom = false;
                    System.out.println("mời bạn nhập tiêu chuẩn phòng cho House Vui Lòng((Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ))");
                    System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                    ((House) facility).setRoomStardard(scanner.nextLine());
                    while (!checkStardRoom) {
                        if (this.checkString(((House) facility).getRoomStardard(), CHECK_FACILITY_ROOMSTARD)) {
                            System.out.println("bạn đã nhập đúng Tiêu chuẩn phòng cho House");
                            checkStardRoom = true;
                        } else {
                            System.out.println("bạn đã nhập sai Vui Lòng(Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ)");
                            System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                            ((House) facility).setRoomStardard(scanner.nextLine());
                            checkStardRoom = false;
                        }

                    }

                    boolean checkDoubleOfFloor = false;
                    System.out.println("mời bạn nhập sô tầng,Số tầng phải là số nguyên dương.");
                    Integer parstDoubleOfFloor = ((House) facility).setNumberOfFloor(Integer.parseInt(scanner.nextLine()));
                    String parstDoubleOfFloorOfMe = parstDoubleOfFloor.toString();
                    while (!checkDoubleOfFloor) {
                        if (this.checkString(parstDoubleOfFloorOfMe, CHECK_FACILITY_MAXOCCUPANCY)) {
                            System.out.println("bạn đã nhập đúng sô tầng của House");
                            ;
                            ((House) facility).setNumberOfFloor(Integer.parseInt(parstDoubleOfFloorOfMe));
                            checkDoubleOfFloor = true;
                            checkAll = true;
                        } else {
                            System.out.println("bạn đã nhập sai số lượng tầng của House (Vui Lòng là số dương)");
                            parstDoubleOfFloor = ((House) facility).setNumberOfFloor(Integer.parseInt(scanner.nextLine()));
                            parstDoubleOfFloorOfMe = parstDoubleOfFloor.toString();
                            checkDoubleOfFloor = false;
                        }

                    }
                    facility = new House(facility.getServiceCode(), facility.getServiceName(), facility.getArea(), facility.getRentalCost(), facility.getMaxOccupancy(), facility.getRentType(), ((House) facility).getRoomStardard(), ((House) facility).getNumberOfFloor());

                   facilityIntegerLinkedHashMap.put(facility,0);


                } catch (NumberFormatException e) {
                    System.out.println("bạn đã nhập sai dữ liệu đầu vào khi thêm House");
                    checkAll = false;
                } catch (NullPointerException e) {
                    System.out.println("Có một phần tử của bạn bị Null khi thêm House ");
                    checkAll = false;
                }

            }

        }
        if (choice == 3) {
            boolean checkAll = false;
            while (!checkAll) {
                try {
                    System.out.println("sau đây là danh sách thêm của Room");
                    boolean checkServiceCode = false;
                    System.out.println("mời bạn nhập mã Dịch vụ phải đúng định dạng SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                            "\n" +
                            "+ Nếu là Villa thì XX sẽ là VL\n" +
                            "+ Nếu là House thì XX sẽ là HO\n" +
                            "+ Nếu Room thì XX sẽ là RO");
                    facility.setServiceCode(scanner.nextLine());
                    while (!checkServiceCode) {
                        if (this.checkString(facility.getServiceCode(), CHECK_FACILITY_SERVICE_CODE_ROOM)) {
                            System.out.println("bạn đã nhập đúng định dạng cho Room");
                            checkServiceCode = true;
                        } else {
                            System.out.println("mời bạn nhập mã Dịch vụ phải đúng định dạng SVXX-YYYY, với YYYY là các số từ 0-9, XX là:\n" +
                                    "\n" +
                                    "+ Nếu là Villa thì XX sẽ là VL\n" +
                                    "+ Nếu là House thì XX sẽ là HO\n" +
                                    "+ Nếu Room thì XX sẽ là RO");
                            facility.setServiceCode(scanner.nextLine());
                            checkServiceCode = false;
                        }

                    }
                    boolean checkServiceName = false;
                    System.out.println("mời bạn nhập tên của dịch vụ Room Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                    facility.setServiceName(scanner.nextLine());
                    while (!checkServiceName) {
                        if (this.checkString(facility.getServiceName(), CHECK_FACILITY_NAME)) {
                            System.out.println("bạn đã nhập đúng tên định dạng của dịch vụ Room");
                            checkServiceName = true;
                        } else {
                            System.out.println("bạn đã nhập sai tên của dịch vụ Room Tên dịch vụ phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                            facility.setServiceName(scanner.nextLine());
                            facility.setServiceName(scanner.nextLine());
                        }

                    }
                    boolean checkArea = false;
                    System.out.println("mời bạn nhập diện tích đã sử dụng cho Room (Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2)");
                    Double parstArea = facility.setArea(Double.parseDouble(scanner.nextLine()));
                    String parstOfArea = parstArea.toString();
                    while (!checkArea) {
                        if (this.checkString(parstOfArea, CHECK_FACILITY_AREA)) {
                            System.out.println("bạn đã nhập đúng diện tích yêu cầu đề ra cho Room");
                            facility.setArea(Double.parseDouble(parstOfArea));
                            checkArea = true;
                        } else {
                            System.out.println("bạn đã nhập sai diện tích cho Room (Diện tích sử dụng và diện tích hồ bơi phải là số thực lớn hơn 30m 2)");
                            parstArea = facility.setArea(Double.parseDouble(scanner.nextLine()));
                            parstOfArea = parstArea.toString();
                        }
                    }
                    boolean checkRental = false;
                    System.out.println("mời bạn nhập chi phí thuê phải là số dương");
                    Double parstRentalCost = facility.setRentalCost(Double.parseDouble(scanner.nextLine()));
                    String pastOfRentalCost = parstRentalCost.toString();
                    while (!checkRental) {
                        if (this.checkString(pastOfRentalCost, CHECK_FACILITY_AREA)) {
                            System.out.println("bạn đã nhập đúng chi phí thuê của Room");
                            facility.setRentalCost(Double.parseDouble(pastOfRentalCost));
                            checkRental = true;
                        } else {
                            System.out.println("Bạn đã nhập sai chi phí thuê của Room(hi phí thuê phải là số dương)");
                            parstRentalCost = facility.setRentalCost(Double.parseDouble(scanner.nextLine()));
                            pastOfRentalCost = parstRentalCost.toString();
                            checkRental = false;

                        }
                    }
                    boolean checkMaxOccupancy = false;
                    System.out.println("mời bạn nhập số lượng có thể chứa được trong Room Vui Lòng(Số lượng người tối đa phải >0 và nhỏ hơn <20)");
                    Integer parstMaxOccupancy = facility.setMaxOccupancy(Integer.parseInt(scanner.nextLine()));
                    String parstOfMaxccupancy = parstMaxOccupancy.toString();
                    while (!checkMaxOccupancy) {
                        if (this.checkString(parstOfMaxccupancy, CHECK_FACILITY_MAXOCCUPANCY)) {
                            System.out.println("bạn đã nhập đúng số người quy định của Room");
                            facility.setMaxOccupancy(Integer.parseInt(parstOfMaxccupancy));
                            checkMaxOccupancy = true;
                        } else {
                            System.out.println("bạn đã nhập số lượng yêu cầu của Room Vui Lòng (Số lượng người tối đa phải >0 và nhỏ hơn <20)");
                            parstMaxOccupancy = facility.setMaxOccupancy(Integer.parseInt(scanner.nextLine()));
                            parstOfMaxccupancy = parstMaxOccupancy.toString();
                            checkMaxOccupancy = false;
                        }

                    }
                    System.out.println("mời bạn nhập kiểu đi kèm miễn phí  cho Room");
                    ((Room) facility).setAccompaniedService(scanner.nextLine());
                    boolean checkRentType = false;
                    System.out.println("mời bạn nhập Kiểu thuê cho Room Vui Lòng(Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ)");
                    System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                    facility.setRentType(scanner.nextLine());
                    while (!checkRentType) {
                        if (this.checkString(facility.getRentType(), CHECK_FACILITY_RENTYPE)) {
                            System.out.println("bạn đã nhập đúng kiểu thuê cho Room");
                            checkRentType = true;
                            checkAll = true;
                        } else {
                            System.out.println("bạn đã nhập sai Vui Lòng(Kiểu thuê, Tiêu chuẩn phòng chuẩn hóa dữ liệu giống tên dịch vụ)");
                            System.out.println("phải viết hoa ký tự đầu, các ký tự sau là ký tự bình thường");
                            facility.setRentType(scanner.nextLine());
                            checkRentType = false;
                        }
                    }

                    facility = new Room(facility.getServiceCode(), facility.getServiceName(), facility.getArea(), facility.getRentalCost(), facility.getMaxOccupancy(), facility.getRentType(), ((Room) facility).getAccompaniedService());
                    facilityIntegerLinkedHashMap.put(facility,0);


                } catch (NumberFormatException e) {
                    System.out.println("bạn đã nhập sai dữ liệu đầu vào khi thêm Room");
                    checkAll = false;
                } catch (NullPointerException e) {
                    System.out.println("Có một phần tử của bạn bị Null khi thêm Room ");
                    checkAll = false;
                }

            }

        }

    }


    @Override
    public void fixFacility() {
        System.out.println("Sau đây là danh sách bảo dưỡng");
        RepositoryBooking repositoryBooking=new RepositoryBooking();
        LinkedHashMap<Facility, Integer> linkedHashMap = repositoryBooking.saveFacilityOfBoooking();
        boolean check=false;
        for (Map.Entry<Facility, Integer> map : linkedHashMap.entrySet()) {
            Facility facility = map.getKey();
            Integer integer = map.getValue();
            if (integer == 5) {
                check=true;
                System.out.println("đối tượng này cần được sửa vì đã nó đạt tới 5 lần sử dụng rồi");
                System.out.println(facility + " " + " với giá trị sử dụng " + integer);
            }
        }
        if (!check){
            System.out.println("Hiện tại chưa có dịch vụ nào sử dụng đến 5");
        }

    }

}


