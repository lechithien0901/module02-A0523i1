package case_study_module02.task4.repository;

import case_study_module02.task4.model.Customer;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepositoryCustomer implements IRepositoryCustomer {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Customer> customerArrayList = new ArrayList<>();

    static {
        customerArrayList.add(new Customer("KH-0001", "Nguyen Van A", "2004-09-01", "Nam", "000000001", "0937275123", "nguyenvana@gmail.com", "Diamond", "Điện BIên Phủ"));
        customerArrayList.add(new Customer("KH-0002", "Nguyen Van B", "2003-03-02", "Nam", "000000002", "0937275124", "nguyenvanb@gmail.com", "Platinum", "Nguyễn Văn Linh"));
        customerArrayList.add(new Customer("KH-0003", "Nguyen Van B", "2001-03-03", "Nam", "000000003", "0937275125", "nguyenvanc@gamil.com", "Gold", "Hoàng Diệu"));
    }

    static final String FILE_SOURCE = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\case_study_module02\\task4\\customer.csv";
    static final String CHECK_CUSTOMER_CODE = "^KH+-+\\d{4}$";
    static final String CHECK_CUSTOMER_NAME = "^[A-Z][a-z]+\\s[A-z][a-z]+\\s[A-z][a-z]+$";
    static final String CHECK_CUSTOMER_AGE = "^(?:[2-9][0-9]|1[89])\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";
    static final String CHECK_CUSTOMER_CMND = "^\\d{9,12}$";
    static final String CHECK_CUSTOMER_PHONECALL = "^0+\\d{9}$";

    public boolean checkString(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        boolean check = matcher.matches();
        return check;
    }

    public boolean isLegalAge(String dateOfBirth) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {

            Date birthDate = dateFormat.parse(dateOfBirth);


            Calendar currentDate = Calendar.getInstance();


            Calendar birthDateCalendar = Calendar.getInstance();
            birthDateCalendar.setTime(birthDate);


            int age = currentDate.get(Calendar.YEAR) - birthDateCalendar.get(Calendar.YEAR);


            if (currentDate.get(Calendar.MONTH) < birthDateCalendar.get(Calendar.MONTH)
                    || (currentDate.get(Calendar.MONTH) == birthDateCalendar.get(Calendar.MONTH)
                    && currentDate.get(Calendar.DAY_OF_MONTH) < birthDateCalendar.get(Calendar.DAY_OF_MONTH))) {
                age--;
            }


            return age >= 18;
        } catch (ParseException e) {
            System.out.println("lỗi phần biến đổi giá trị");

            return false;
        }


    }

    public boolean checkAge(String ageOfCustomer) {
        Pattern pattern = Pattern.compile(CHECK_CUSTOMER_AGE);
        Matcher matcher = pattern.matcher(ageOfCustomer);
        boolean checkAge = false;

        if (matcher.matches()) {
            checkAge = true;
        }
        return checkAge;
    }

    public ArrayList<Customer> readCustomer() throws FileNotFoundException, IOException, Exception {
        ArrayList<Customer> arrayList = new ArrayList();
        File
                file = new File(FILE_SOURCE);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String stringOfMe = "";
        while ((stringOfMe = bufferedReader.readLine()) != null) {
            Customer customer = new Customer();
            String[] strings = stringOfMe.split(",");
            customer.setCustomerCode(strings[0]);
            customer.setCustomerName(strings[1]);
            customer.setCustomerDate(strings[2]);
            customer.setCustomerGender(strings[3]);
            customer.setCustomerCmnd(strings[4]);
            customer.setCustomerPhone(strings[5]);
            customer.setCustomerEmail(strings[6]);
            customer.setCustomerTypeOfGuest(strings[7]);
            customer.setCustomerAddress(strings[8]);
            arrayList.add(customer);
        }


        return (ArrayList<Customer>) arrayList;
    }

    public void writeCustomer(ArrayList<Customer> arrayList) {
        try {
            File file = new File(FILE_SOURCE);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : arrayList) {
                bufferedWriter.write(customer.getCustomerCode() + "," + customer.getCustomerName() + "," + customer.getCustomerDate() + "," + customer.getCustomerGender() + "," + customer.getCustomerCmnd() + "," + customer.getCustomerPhone() + "," + customer.getCustomerEmail() + "," + customer.getCustomerTypeOfGuest() + "," + customer.getCustomerAddress() + "\n");
            }
bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không thể tìm thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không thể truy cập được");
        } catch (Exception e) {
            System.out.println("File của bạn đang bị lỗi một thứ gì đó");
        }

    }


    @Override
    public ArrayList<Customer> showCustomer() {
        ArrayList<Customer> arrayList = new ArrayList<>();
        try {
            RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
            arrayList = repositoryCustomer.readCustomer();
        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không thể tìm thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không thể truy cập được");
        } catch (Exception e) {
            System.out.println("File của bạn đang bị lỗi một thứ gì đó");
        }
        return (ArrayList<Customer>) arrayList;
    }


    @Override
    public void addCustomer(Customer customer) {
        RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
        try {
            System.out.println("thêm Mã Customer Vui Lòng nhập đúng định dạng sau(Mã khách hàng phải đúng định dạng: KH-YYYY, với YYYY là các số từ 0-9) ");
            customer.setCustomerCode(scanner.nextLine());
            boolean checkCode = false;
            while (!checkCode) {
                if (repositoryCustomer.checkString(customer.getCustomerCode(), CHECK_CUSTOMER_CODE)) {
                    System.out.println("bạn đã nhập đúng mã của Costomer");

                } else {
                    System.out.println("bạn đã nhập sai Vui Lòng nhập đúng(Mã khách hàng phải đúng định dạng: KH-YYYY, với YYYY là các số từ 0-9)");
                    System.out.println("ví dụ KH-1009");
                    customer.setCustomerCode(scanner.nextLine());
                }
            }
            boolean checkName = false;
            System.out.println("thêm tên của Customer Vui Lòng nhập đúng định dạng sau (Tên khách hàng phải viết hoa các ký tự đầu của mỗi từ.)");
            customer.setCustomerName(scanner.nextLine());
            while (!checkName) {
                if (repositoryCustomer.checkString(customer.getCustomerName(), CHECK_CUSTOMER_NAME)) {
                    System.out.println("bạn đã nhập tên đúng của Customer");
                    checkName = true;
                } else {
                    System.out.println("bạn đã nhập sai Vui Lòng nhập đúng(Tên khách hàng phải viết hoa các ký tự đầu của mỗi từ.)");
                    System.out.println("ví dụ Nguyễn Văn An");
                    customer.setCustomerName(scanner.nextLine());
                }
            }
            boolean checkDate = false;
            System.out.println("thêm ngày sinh của Customer Vui Lòng phải đúng định dạng sau(yyyy-mm-dd) và (Phải đủ 18 tuổi (tính cả ngày + tháng))");
            customer.setCustomerDate(scanner.nextLine());
            while (!checkDate) {
                if (repositoryCustomer.checkAge(customer.getCustomerDate())) {
                    System.out.println("bạn đã nhập đúng đinh dạng của tuổi");
                    checkDate = true;
                    boolean checkAgeOfCustomer = false;
                    while (!checkAgeOfCustomer) {
                        if (repositoryCustomer.isLegalAge(customer.getCustomerDate())) {
                            System.out.println("bạn đã đủ 18 tuổi");

                            checkAgeOfCustomer = true;
                        } else {
                            System.out.println("bạn chưa đủ 18 tuổi (ví dụ:09/01/2004) đó là số tuổi của người 18 tuổi");
                            System.out.println("bạn vui lòng nhập lại số tuổi");
                            customer.setCustomerDate(scanner.nextLine());
                        }

                    }
                } else {
                    System.out.println("bạn đã nhập sai định dạng của tuổi Vui Lòng nhập đúng(phải đúng định dạng sau(yyyy-mm-dd) và (Phải đủ 18 tuổi (tính cả ngày + tháng))");
                    customer.setCustomerDate(scanner.nextLine());
                }
            }
            boolean checkCMND = false;
            System.out.println("Chứng Minh Nhân Dân cho Customer Vui Lòng nhập đúng định dạng sau (CMND phải đủ 9 hoặc 12 số.)");
            customer.setCustomerCmnd(scanner.nextLine());
            while (!checkCMND) {
                if (repositoryCustomer.checkString(customer.getCustomerCmnd(), CHECK_CUSTOMER_CMND)) {
                    System.out.println("bạn đã nhập đúng CMND của mình");
                    checkCMND = true;
                } else {
                    System.out.println("bạn chưa nhập đủ CMND hoặc có thể sai Vui Lòng nhập theo()CMND phải đủ 9 hoặc 12 số");
                    customer.setCustomerCmnd(scanner.nextLine());
                }
            }
            boolean checkPhoneCall = false;
            System.out.println("thêm số điện thoại cho Customer Vui Lòng phải đúng định dạng sau (Số điện thoại phải bắt đầu từ 0 và đủ 10 số.)");
            customer.setCustomerPhone(scanner.nextLine());
            while (!checkPhoneCall) {
                if (repositoryCustomer.checkString(customer.getCustomerPhone(), CHECK_CUSTOMER_PHONECALL)) {
                    System.out.println("bạn đã nhập đúng số điện thoại ");
                    checkPhoneCall = true;
                } else {
                    System.out.println("bạn đã nhập sai số điện thoại có thể thiếu hoặc đủ Vui Lòng(Số Điện Thoại phải bắt đầu từ số không và đủ 10 sô)");
                    customer.setCustomerPhone(scanner.nextLine());
                }
            }

            customerArrayList.add(customer);

            repositoryCustomer.writeCustomer(customerArrayList);

        } catch (NullPointerException e) {
            System.out.println("phần tử của bạn bị NUll điều đó dẫn đến không kiểm tra được ");
        }


    }

    @Override
    public void fixCustomer(String nameNeedFix) {
        try {
            RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
            ArrayList<Customer> arrayList = new ArrayList<>();
            arrayList = repositoryCustomer.readCustomer();
boolean check=true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getCustomerName().equals(nameNeedFix)) {
                    check=false;
                    int choiceOfMe;
                    do {
                        System.out.println("sau đây là danh sửa đối tượng : " + arrayList.get(i));
                        System.out.println("====================================================");
                        System.out.println("1.sửa mã Customer");
                        System.out.println("2.sửa tên của Customer");
                        System.out.println("3.sửa ngày sinh của Customer");
                        System.out.println("4.sửa giới tính của Customer");
                        System.out.println("5.sửa cmnd cho Customer");
                        System.out.println("6.sửa số điện thoại cho Customer");
                        System.out.println("7.sửa email cho customer");
                        System.out.println("8.sửa loại khách cho customer");
                        System.out.println("9.sửa địa chỉ cho customer");
                        System.out.println("====================================================");
                        System.out.println("mời bạn nhập lựa chọn của mình");
                        choiceOfMe = Integer.parseInt(scanner.nextLine());
                        switch (choiceOfMe) {
                            case 1:
                                System.out.println("bạn đã chọn sửa mà cho Customer");
                                System.out.println("mời bạn nhập mã để sửa Customer Vui Lòng nhập đúng định dạng sau(Mã khách hàng phải đúng định dạng: KH-YYYY, với YYYY là các số từ 0-9) ");
                                arrayList.get(i).setCustomerCode(scanner.nextLine());
                                boolean checkCode = false;
                                while (!checkCode) {
                                    if (repositoryCustomer.checkString(arrayList.get(i).getCustomerCode(), CHECK_CUSTOMER_CODE)) {
                                        System.out.println("bạn đã nhập đúng mã của Costomer");
                                        System.out.println("mã customer đã được sửa");
                                        checkCode = true;
                                    } else {
                                        System.out.println("bạn đã nhập sai Vui Lòng nhập đúng(Mã khách hàng phải đúng định dạng: KH-YYYY, với YYYY là các số từ 0-9)");
                                        System.out.println("ví dụ KH-1009");
                                        arrayList.get(i).setCustomerCode(scanner.nextLine());
                                    }
                                }
                                break;
                            case 2:
                                boolean checkName = false;
                                System.out.println("mời bạn nhập để sửa tên của Customer Vui Lòng nhập đúng định dạng sau (Tên khách hàng phải viết hoa các ký tự đầu của mỗi từ.)");
                                arrayList.get(i).setCustomerName(scanner.nextLine());
                                while (!checkName) {
                                    if (repositoryCustomer.checkString(arrayList.get(i).getCustomerName(), CHECK_CUSTOMER_NAME)) {
                                        System.out.println("bạn đã nhập tên đúng của Customer");
                                        checkName = true;
                                    } else {
                                        System.out.println("bạn đã nhập sai Vui Lòng nhập đúng(Tên khách hàng phải viết hoa các ký tự đầu của mỗi từ.)");
                                        System.out.println("ví dụ Nguyễn Văn An");
                                        arrayList.get(i).setCustomerName(scanner.nextLine());
                                    }
                                }
                                break;
                            case 3:
                                boolean checkDate = false;
                                System.out.println("mời bạn nhập để sửa ngày sinh của Customer Vui Lòng phải đúng định dạng sau(yyyy-mm-dd) và (Phải đủ 18 tuổi (tính cả ngày + tháng))");
                                arrayList.get(i).setCustomerDate(scanner.nextLine());
                                while (!checkDate) {
                                    if (repositoryCustomer.checkAge(arrayList.get(i).getCustomerDate())) {
                                        System.out.println("bạn đã nhập đúng đinh dạng của tuổi");
                                        checkDate = true;
                                        boolean checkAgeOfCustomer = false;
                                        while (!checkAgeOfCustomer) {
                                            if (repositoryCustomer.isLegalAge(arrayList.get(i).getCustomerDate())) {
                                                System.out.println("bạn đã đủ 18 tuổi");

                                                checkAgeOfCustomer = true;
                                            } else {
                                                System.out.println("bạn chưa đủ 18 tuổi (ví dụ:09/01/2004) đó là số tuổi của người 18 tuổi");
                                                System.out.println("bạn vui lòng nhập lại số tuổi");
                                                arrayList.get(i).setCustomerDate(scanner.nextLine());
                                            }

                                        }
                                    } else {
                                        System.out.println("bạn đã nhập sai định dạng của tuổi Vui Lòng nhập đúng(phải đúng định dạng sau(yyyy-mm-dd) và (Phải đủ 18 tuổi (tính cả ngày + tháng))");
                                        arrayList.get(i).setCustomerDate(scanner.nextLine());
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("mời bạn nhập để sửa giới tính");
                                arrayList.get(i).setCustomerGender(scanner.nextLine());
                                break;

                            case 5:
                                boolean checkCMND = false;
                                System.out.println("Chứng Minh Nhân Dân cho Customer Vui Lòng nhập đúng định dạng sau (CMND phải đủ 9 hoặc 12 số.)");
                                arrayList.get(i).setCustomerCmnd(scanner.nextLine());
                                while (!checkCMND) {
                                    if (repositoryCustomer.checkString(arrayList.get(i).getCustomerCmnd(), CHECK_CUSTOMER_CMND)) {
                                        System.out.println("bạn đã nhập đúng CMND của mình");
                                        checkCMND = true;
                                    } else {
                                        System.out.println("bạn chưa nhập đủ CMND hoặc có thể sai Vui Lòng nhập theo()CMND phải đủ 9 hoặc 12 số");
                                        arrayList.get(i).setCustomerCmnd(scanner.nextLine());
                                    }
                                }
                                break;
                            case 6:
                                boolean checkPhoneCall = false;
                                System.out.println("mời bạn nhập để sửa số điện thoại cho Customer Vui Lòng phải đúng định dạng sau (Số điện thoại phải bắt đầu từ 0 và đủ 10 số.)");
                                arrayList.get(i).setCustomerPhone(scanner.nextLine());
                                while (!checkPhoneCall) {
                                    if (repositoryCustomer.checkString(arrayList.get(i).getCustomerPhone(), CHECK_CUSTOMER_PHONECALL)) {
                                        System.out.println("bạn đã nhập đúng số điện thoại ");
                                        checkPhoneCall = true;
                                    } else {
                                        System.out.println("bạn đã nhập sai số điện thoại có thể thiếu hoặc đủ Vui Lòng(Số Điện Thoại phải bắt đầu từ số không và đủ 10 sô)");
                                        arrayList.get(i).setCustomerPhone(scanner.nextLine());
                                    }
                                }
                                break;
                            case 7:
                                System.out.println("mời bạn nhập để sửa gmail");
                                arrayList.get(i).setCustomerEmail(scanner.nextLine());
                                break;
                            case 8:
                                int choiceOfMeType;

                                String customerType = "";
                                do {
                                    System.out.println("đây là danh sách lựa chọn cho loại Customer");
                                    System.out.println("===========================================");
                                    System.out.println("1.Diamond");
                                    System.out.println("2.Platinum");
                                    System.out.println("3.Gold");
                                    System.out.println("4.Sliver");
                                    System.out.println("5.Member");
                                    System.out.println("===========================================");
                                    System.out.println("mời bạn nhập lựa chọn của mình");
                                    choiceOfMeType = Integer.parseInt(scanner.nextLine());
                                    switch (choiceOfMe) {
                                        case 1:
                                            System.out.println("bạn đã chọn Diamond");
                                            customerType = "Diamond";
                                            break;
                                        case 2:
                                            System.out.println("bạn đã chọn Platinum");
                                            customerType = "Platinum";
                                            break;
                                        case 3:
                                            System.out.println("bạn đã chọn Gold");
                                            customerType = "Gold";
                                            break;
                                        case 4:
                                            System.out.println("bạn đã chọn Sliver");
                                            customerType = "Sliver";
                                            break;
                                        case 5:
                                            System.out.println("bạn đã chọn Member ");
                                            customerType = "Member";
                                            break;

                                    }
                                } while (choiceOfMeType >= 1 && choiceOfMeType <= 5);
                                arrayList.get(i).setCustomerTypeOfGuest(customerType);
                                break;
                            case 9:
                                System.out.println("mời bạn nhập để sửa địa chỉ");
                                arrayList.get(i).setCustomerAddress(scanner.nextLine())
                                ;
                                break;


                        }

                    } while (choiceOfMe >= 1 && choiceOfMe <= 9);
                }
            }

            if (check){
                System.out.println("tên Customer bạn nhập không trùng khớp để sửa");
            }
            if (!check){
                System.out.println("đã sửa thành công");
                repositoryCustomer.writeCustomer(arrayList);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không thể mở được");

        } catch (IOException e) {
            System.out.println("FIle của bạn không thể truy cập được ");
        } catch (Exception e) {
            System.out.println("File của bạn đang bị lỗi một thứ gì đó");
        }


    }

    @Override
    public void deleteCustomer(String name) {

    }
}
