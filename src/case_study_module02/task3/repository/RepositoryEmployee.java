package case_study_module02.task3.repository;

import case_study_module02.task3.model.Employee;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepositoryEmployee implements IRepositoryEmployee {
    Scanner scanner = new Scanner(System.in);
    static final String FILE_SOURCE = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\case_study_module02\\task3\\filesource";
    static final String CHECK_NV = "^NV-\\d{4}$";
    static final String NAME_NV = "^[A-Z][a-z]+\\s[A-Z][a-z]+\\s[A-Z][a-z]+$";
    static final String EMAIL_CHECK = "^[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+$";
    static final String CMND_CHECK = "^\\d{9,12}$";
    static final String PHONE_CALl = "^(0+\\d{9})$";
    static final String CHECK_DATE="^(?:[2-9][0-9]|1[89])\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";
    public boolean checkAge(String age){
        Pattern pattern=Pattern.compile(CHECK_DATE);
        Matcher matcher=pattern.matcher(age);
        boolean check=false;
       if (matcher.matches()){
           check=true;

       }
       return check;
    }
public  boolean isLegalAge(String dateOfBirth){
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

    static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    static {
        employeeArrayList.add(new Employee("NV-1235", "Nguyen Van A", "12/09/2004", "nam", "091231233333", "0932123214", "nguyenvana@gmail.com,", "Đại học", "lê tân", 3000));
        employeeArrayList.add(new Employee("NV-1233", "Nguyen Van B", "11/07/2004", "nam", "091231232222", "0932123213", "nguyenvanb@gmail.com,", "Đại học", "lê tân", 4000));
        employeeArrayList.add(new Employee("NV-1444", "Nguyen Van C", "13/07/2004", "nam", "091231231111", "0932123567", "nguyenvanc@gmail.com,", "Đại học", "lê tân", 5000));
    }

    public ArrayList<Employee> readArraylist() throws IOException, FileNotFoundException, Exception {
        File file = new File(FILE_SOURCE);
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList = (ArrayList<Employee>) objectInputStream.readObject();
        return arrayList;

    }


    public boolean checkString(String stringOfMe, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(stringOfMe);
        boolean check = matcher.matches();
        return check;
    }

    public void writeArrayList(ArrayList<Employee> employeeArrayList) throws FileNotFoundException, IOException, Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_SOURCE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employeeArrayList);

    }

    @Override
    public void addEmployee(Employee employee) {

        try {
            RepositoryEmployee repositoryEmployee = new RepositoryEmployee();
            boolean checkAll = true;
            while (checkAll) {

                boolean check = repositoryEmployee.checkString(employee.getEmployeeCode(), CHECK_NV);
                if (check) {
                    System.out.println("Mã nhân viên bạn nhập hoàn toàn chính xác");
                    checkAll = false;
                }
                if (!check) {
                    System.out.println("mời bạn nhập lại cho đúng yêu cầu với định dạng (NV-YYYY)");
                    employee.setEmployeeCode(scanner.nextLine());
                    checkAll = false;
                }
            }
            boolean checkName = true;
            while (checkName) {
                boolean check = repositoryEmployee.checkString(employee.getNameEmployee(), NAME_NV);
                if (check) {
                    System.out.println("Tên bạn nhập hoàn toàn chính xác");
                    checkName = false;
                }
                if (!check) {
                    System.out.println("mời bạn nhập lại tên cho đúng yêu cầu với mỗi từ là một chữ cái viết hoa và yêu cầu của việc nhập tên này là tên phải dưới 3 chữ");
                    employee.setNameEmployee(scanner.nextLine());
                    checkName = false;
                }

            }
            boolean checkAge=true;
            while (checkAge){
                System.out.println("mời bạn nhập lại tên ngày sinh để được kiểm tra kĩ hơn");
                employee.setDateOfEmployee(scanner.nextLine());
                boolean check=repositoryEmployee.checkString(employee.getDateOfEmployee(),CHECK_DATE);
                if (check){
                    checkAge=false;
                    System.out.println("tuổi bạn nhập đúng định dạng");
                    boolean checkAgeOfMe=false;
                    while (!checkAgeOfMe){
                        if (isLegalAge(employee.getDateOfEmployee())){
                            System.out.println("bạn đã đủ 18 tuổi");
                            checkAgeOfMe=true;

                        }else {
                            System.out.println("bạn chưa đủ 18 tuổi");
                            System.out.println("mời bạn nhập lại tuổi của mình");
                            employee.setDateOfEmployee(scanner.nextLine());

                        }

                    }
                }else {
                    System.out.println("bạn không đúng định dạng mời bạn nhập nhập cho đúng yyyy-MM-dd");
                }
            }
            boolean checkEmail = true;
            while (checkEmail) {
                boolean check = repositoryEmployee.checkString(employee.getEmailOfEmployee(), EMAIL_CHECK);
                if (check) {
                    System.out.println("email bạn nhập hoàn toàn chính xác");
                    checkEmail = false;

                }
                if (!check) {
                    System.out.println("mời bạn nhập lại email với đúng định dạng của nó ");
                    employee.setEmailOfEmployee(scanner.nextLine());
                    checkEmail = false;
                }
            }
            boolean checkCMND = true;
            while (checkCMND) {
                boolean check = repositoryEmployee.checkString(employee.getIdCard(), CMND_CHECK);
                if (check) {
                    System.out.println("chứng minh nhân dân bạn nhập trên đã đúng");
                    checkCMND = false;

                }
                if (!check) {
                    System.out.println("mời bạn nhập CMND đủ 9 đén 12 số");
                    employee.setEmailOfEmployee(scanner.nextLine());
                    checkCMND = false;
                }
            }
            boolean checkPhone = true;
            while (checkPhone) {
                boolean check = repositoryEmployee.checkString(employee.getNumberCallOfEmployee(), PHONE_CALl);
                if (check) {
                    System.out.println("số điện thoại bạn nhập hoàn toàn đúng");
                    checkPhone = false;

                }
                if (!check) {
                    System.out.println("mời bạn nhập lại số điện thoại bắt đầu bằng 0 và đủ 10 số ");
                    employee.setNumberCallOfEmployee(scanner.nextLine());

                    checkPhone = false;
                }
            }
            employeeArrayList.add(employee);
            repositoryEmployee.writeArrayList(employeeArrayList);
        } catch (FileNotFoundException e) {
            System.out.println("file không tìm thấy ");
        } catch (IOException e) {
            System.out.println("file không cho phép truy cập");

        } catch (Exception e) {
            System.out.println("File bị lỗi gì đó");
        }
    }

    @Override
    public void deleteEmployee(String name) {
        try {
            ArrayList<Employee>arrayList=new ArrayList<>();
            RepositoryEmployee repositoryEmployee=new RepositoryEmployee();
            arrayList=repositoryEmployee.readArraylist();
            boolean check = false;
          while (!check){
              name=scanner.nextLine();
              for (int i = 0; i <arrayList.size() ; i++) {
                  if (arrayList.get(i).equals(name)){
                      System.out.println("đối tượng này có trong danh sách");
                      System.out.println(arrayList.get(i));
                      arrayList.remove(i);
                      check=true;
                      break;
                  }

              }
              if(!check){
                  System.out.println("mời bạn nhập lại tên để kiểm tra đúng hơn");
              }

          }
            repositoryEmployee.writeArrayList(arrayList);

        }catch (FileNotFoundException e){
            System.out.println("File của bạn không tìm thấy");
        }catch (IOException e){
            System.out.println("File của bạn không cho phép được truy câp");
        }catch (Exception e){
            System.out.println("File của bạn bị lỗi một thứ gì đó");
        }
        }


    @Override
    public ArrayList<Employee> showEmployee() {
        ArrayList<Employee> arrayList = new ArrayList<>();
        try {

            RepositoryEmployee repositoryEmployee = new RepositoryEmployee();
            arrayList = (ArrayList<Employee>) repositoryEmployee.readArraylist();

        } catch (FileNotFoundException e) {
            System.out.println("bạn bạn muốn đọc đối tượng không được tìm thấy");

        } catch (IOException e) {
            System.out.println("File bạn muốn đọc không cho phép truy cập vào");
        } catch (Exception e) {
            System.out.println("File của bạn đang bị lỗi một thứ gì đó");
        }

        return arrayList;
    }

    @Override
    public void fixEmployee(String name) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        try {

            RepositoryEmployee repositoryEmployee = new RepositoryEmployee();
            arrayList = (ArrayList<Employee>) repositoryEmployee.readArraylist();
            boolean check=false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (name.equals(arrayList.get(i).getNameEmployee())) {
                    System.out.println(" tên "+name+" có trong danh sách");
                    check=true;
                    int choiceOfMe;
                    do {
                        System.out.println("Đây là danh sách của bạn cần sửa");
                        System.out.println("======================================================");
                        System.out.println("1.Sửa mã định dạng nhân viên");
                        System.out.println("2.Sửa tên nhân viên");
                        System.out.println("3.Sửa ngày sinh");
                        System.out.println("4.Sửa giới tính");
                        System.out.println("5.Sửa CMND");
                        System.out.println("6.Sửa số điện thoại");
                        System.out.println("7.Sửa email");
                        System.out.println("8.Sửa trình độ ");
                        System.out.println("9.sửa vị trí nhân viên");
                        System.out.println("10.Sửa lương");
                        System.out.println("mời bạn bấm số cao hơn 10 để thoát");
                        System.out.println("======================================================");
                        System.out.println("mời bạn nhâp cần muốn sửa");
                        choiceOfMe = Integer.parseInt(scanner.nextLine());
                        switch (choiceOfMe) {

                            case 1:
                                boolean checkEmployeeCode = false;
                                String employeeCode;
                                while (!checkEmployeeCode) {
                                    System.out.println("bạn đã chọn sửa mã định dạng nhân viên Vui Lòng(Mã nhân viên phải đúng định dạng: NV-YYYY, với YYYY là các số từ 0-9)");
                                    employeeCode = scanner.nextLine();
                                    if (repositoryEmployee.checkString(employeeCode, CHECK_NV)) {
                                        System.out.println("Mã nhân viên bạn nhập đã đúng");
                                        arrayList.get(i).setEmployeeCode(employeeCode);
                                        checkEmployeeCode = true;
                                    } else {
                                        System.out.println("mã bạn nhập không đúng");
                                    }
                                }
                                break;
                            case 2:
                                boolean checkEmployeeName = false;
                                String employeeName;
                                while (!checkEmployeeName) {
                                    System.out.println("mời bạn nhập tên của Employee đúng định dạng sau Vui lòng(Tên nhân viên phải viết hoa các ký tự đầu của mỗi từ) ");
                                    employeeName = scanner.nextLine();
                                    if (repositoryEmployee.checkString(employeeName, NAME_NV)) {
                                        System.out.println("bạn nhập tên đã đúng với yêu cầu");
                                        arrayList.get(i).setNameEmployee(employeeName);
                                        checkEmployeeName = true;
                                    } else {
                                        System.out.println("bạn nhập tên chưa đúng nhập lại");
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("bạn chọn sửa ngày sinh");

                                boolean checkAge=true;
                                while (checkAge){
                                    System.out.println("mời bạn nhập tuổi vui lòng ( yyyy-MM-dd) năm trước tháng rồi tới ngày");
                                    arrayList.get(i).setDateOfEmployee(scanner.nextLine());
                                    boolean checkOfAge=repositoryEmployee.checkString(arrayList.get(i).getDateOfEmployee(),CHECK_DATE);
                                    if (checkOfAge){
                                        checkAge=false;
                                        System.out.println("tuổi bạn nhập đúng định dạng");
                                        boolean checkAgeOfMe=false;
                                        while (!checkAgeOfMe){
                                            if (isLegalAge(arrayList.get(i).getDateOfEmployee())){
                                                System.out.println("bạn đã đủ 18 tuổi");
                                                checkAgeOfMe=true;

                                            }else {
                                                System.out.println("bạn chưa đủ 18 tuổi");
                                                System.out.println("mời bạn nhập lại tuổi của mình");
                                                arrayList.get(i).setDateOfEmployee(scanner.nextLine());

                                            }

                                        }
                                    }else {
                                        System.out.println("bạn không đúng định dạng mời bạn nhập nhập cho đúng yyyy-MM-dd");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("bạn đã chọn sửa giới tính");
                                System.out.println("mời bạn nhập giới tính mới (nam hoặc nữ)");
                                String employeeGender = scanner.nextLine();
                                arrayList.get(i).setGenderOfEmployee(employeeGender);
                                break;
                            case 5:
                                boolean checkEmployeeCmnd = true;
                                String employeeCmnd;
                                while (checkEmployeeCmnd) {
                                    System.out.println("bạn đã chọn sửa chứng minh nhân dân vui lòng (CMND phải đủ 9 hoặc 12 số.)");
                                    employeeCmnd = scanner.nextLine();
                                    if (repositoryEmployee.checkString(employeeCmnd, CMND_CHECK)) {
                                        System.out.println("bạn nhập CMND đã đúng  ");
                                        arrayList.get(i).setIdCard(employeeCmnd);
                                        checkEmployeeCmnd = false;
                                    } else {
                                        System.out.println("bạn nhập đã sai ");
                                    }
                                }
                                break;
                            case 6:
                                boolean checkNumberCall = true;
                                String employeeNumberCall;
                                while (checkNumberCall) {
                                    System.out.println("bạn đã chọn sửa số điện thoại Vui Lòng nhập đúng (Số điện thoại phải bắt đầu từ 0 và đủ 10 số)");
                                    employeeNumberCall = scanner.nextLine();
                                    if (repositoryEmployee.checkString(employeeNumberCall, PHONE_CALl)) {
                                        System.out.println("bạn đã nhập đúng số điện thoại");
                                      arrayList.get(i).setNumberCallOfEmployee(employeeNumberCall);
                                        checkNumberCall = false;
                                    } else {
                                        System.out.println("bạn nhập không đúng số điện thoại");
                                    }

                                }
                                break;
                            case 7:
                                boolean checkEmail = true;
                                String emailOfEmployee;
                                while (checkEmail) {
                                    System.out.println("bạn đã chọn sửa email");
                                    emailOfEmployee = scanner.nextLine();
                                    if (repositoryEmployee.checkString(emailOfEmployee, EMAIL_CHECK)) {
                                        System.out.println("bạn đã nhập email hoàn toàn đúng");
                                        arrayList.get(i).setEmailOfEmployee(emailOfEmployee);
                                        checkEmail = false;
                                    } else {
                                        System.out.println("bạn nhập email không đúng ");
                                    }
                                }
                                break;

                            case 8:
                                System.out.println("bạn đã chọn sửa trình độ");
                                String level = "";
                                int choice;
                                do {
                                    System.out.println("=======================================");
                                    System.out.println("danh sách trình độ mà bạn cần là");
                                    System.out.println("1.Trung cấp");
                                    System.out.println("2.Cao Đẳng");
                                    System.out.println("3.Đại học");
                                    System.out.println("4.Sau Đại học");
                                    System.out.println("5.Mời bạn bấm nút bất kì để thoát");
                                    System.out.println("=======================================");
                                    System.out.println("mời bạn chọn lựa chọn của mình");
                                    choice = Integer.parseInt(scanner.nextLine());

                                    switch (choice) {
                                        case 1:
                                            System.out.println("bạn đã chọn là Trung cấp");
                                            level = "Trung cấp";
                                            break;
                                        case 2:
                                            System.out.println("bạn đã chọn là Cao Đẳng");
                                            level = "Cao Đẳng";
                                            break;
                                        case 3:
                                            System.out.println("bạn đã chọn là Đại Học");
                                            level = "Đại Học";
                                            break;
                                        case 4:
                                            System.out.println("bạn đã chọn là sau đại học");
                                            level = "Sau Đại Học";
                                            break;
                                    }
                                } while (choice >= 1 && choice <= 4);
                                arrayList.get(i).setLevel(level);
                                break;
                            case 9:
                                System.out.println("bạn đã chọn sửa vị trí");
                                String location = "";
                                int choiceOfMee;
                                do {
                                    System.out.println("====================================================");
                                    System.out.println("1.Lễ Tân,");
                                    System.out.println("2.Phục vụ");
                                    System.out.println("3.Chuyên Viên");
                                    System.out.println("4.Giám sát");
                                    System.out.println("5.Quản Lí");
                                    System.out.println("6.Giám Đốc");
                                    System.out.println("====================================================");
                                    System.out.println("mời bạn nhập lựa chọn của mình");
                                    choiceOfMee = Integer.parseInt(scanner.nextLine());
                                    switch (choiceOfMee) {
                                        case 1:
                                            System.out.println("bạn đã chọn chức vụ chính là Lê Tân");
                                            location = "Lễ Tân";
                                            break;
                                        case 2:
                                            System.out.println("bạn đã chọn chức vụ chính là Phuc vụ");
                                            location = "Phục Vụ";
                                            break;
                                        case 3:
                                            System.out.println("bạn đã chọn chức vụ chính là Chuyên Viên");
                                            location = "Chuyên Viên";
                                            break;
                                        case 4:
                                            System.out.println("bạn đã chọn chức vụ chính là Giám Sát");
                                            location = "Giám Sát";
                                            break;
                                        case 5:
                                            System.out.println("bạn đã chọn chức vụ chính là Quản lí");
                                            location = "Quản Lí";
                                            break;
                                        case 6:
                                            System.out.println("bạn đã chọn chức vụ chính là Giám đốc");
                                            location = "Giám Đốc";
                                            break;
                                    }
                                } while (choiceOfMe >= 1 && choiceOfMe <= 6);
                                arrayList.get(i).setLocation(location);
                                break;
                            case 10:
                                System.out.println("bạn đã chọn sửa lương");
                                double salaryOfEmployee = scanner.nextDouble();
                                arrayList.get(i).setSalary(salaryOfEmployee);
                                break;
                        }
                    } while (choiceOfMe >= 1 && choiceOfMe <= 10);
                }
            }
            if (!check){
                System.out.println("tên bạn nhập không đúng để xóa"+name);
            }
            if (check){

                repositoryEmployee.writeArrayList(arrayList);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File của bạn tìm không thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("Có một sự cố gì đó với File của bạn");
        }


    }
}
