package case_study_module02.task3.service;

import case_study_module02.task3.model.Employee;
import case_study_module02.task3.repository.IRepositoryEmployee;
import case_study_module02.task3.repository.RepositoryEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceEmployee implements IServiceEmployee {
    Scanner scanner =new Scanner(System.in);
    IRepositoryEmployee iRepositoryEmployee=new RepositoryEmployee();

    @Override
    public void addEmployee() {
        try{System.out.println("mời bạn nhập mã nhân viên phải đúng với định dạng sau NV-YYYY,với YYYY là các số từ 0-9 ");
            String employCode=scanner.nextLine();
            System.out.println("mời bạn tên nhân viên với tên là mỗi từ phải viết hoa chữ cái đầu");
            String nameOfEmployee=scanner.nextLine();
            System.out.println("mời bạn nhập ngày sinh");
            String dateOfEmployee=scanner.nextLine();
            System.out.println("mời bạn nhập giới tính của nhân viên");
            String genderOfEmployee= scanner.nextLine();
            System.out.println("mời bạn nhập CMND (Bắt buộc chứng minh nhân dân phải đủ 9 hoặc 12 số)");
            String idOfEmployee= scanner.nextLine();
            System.out.println("mời bạn nhập số điện thoại (Bắt buộc phải từ 0 đến 12 số)");
            String numberCallOfEmployee=scanner.nextLine();
            System.out.println("mời bạn nhập email phải đúng đinh dạng ví dụ(nguyenvana12@gmail.com)");
            String emailOfEmployee= scanner.nextLine();
            System.out.println("mời bạn nhập trình độ của nhân viên");
            String level="";
            int choice;
            do{
                System.out.println("=======================================");
                System.out.println("danh sách trình độ mà bạn cần là");
                System.out.println("1.Trung cấp");
                System.out.println("2.Cao Đẳng");
                System.out.println("3.Đại học");
                System.out.println("4.Sau Đại học");
                System.out.println("=======================================");
                System.out.println("mời bạn chọn lựa chọn của mình");
                choice=Integer.parseInt(scanner.nextLine());

                switch (choice){
                    case 1:
                        System.out.println("bạn đã chọn là Trung cấp");
                        level="Trung cấp";
                        break;
                    case 2:
                        System.out.println("bạn đã chọn là Cao Đẳng");
                        level="Cao Đẳng";
                        break;
                    case 3:
                        System.out.println("bạn đã chọn là Đại Học");
                        level="Đại Học";
                        break;
                    case 4:
                        System.out.println("bạn đã chọn là sau đại học");
                        level="Sau Đại Học";
                        break;
                }
            }while (choice>=1&&choice<=4);
            System.out.println("mời bạn nhập vị trí của nhân viên");
            String location="";
            int choiceOfMe;
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
                choiceOfMe=Integer.parseInt(scanner.nextLine());
                switch (choiceOfMe){
                    case 1:
                        System.out.println("bạn đã chọn chức vụ chính là Lê Tân" );
                        location="Lê Tân";
                        break;
                    case 2:
                        System.out.println("bạn đã chọn chức vụ chính là Phuc vụ");
                        location="Phục Vụ";
                        break;
                    case 3:
                        System.out.println("bạn đã chọn chức vụ chính là Chuyên Viên");
                        location="Chuyên Viên";
                        break;
                    case 4:
                        System.out.println("bạn đã chọn chức vụ chính là Giám Sát");
                        location="Giám Sát";
                        break;
                    case 5:
                        System.out.println("bạn đã chọn chức vụ chính là Quản lí");
                        location="Quản Lí";
                        break;
                    case 6:
                        System.out.println("bạn đã chọn chức vụ chính là Giám đốc");
                        location="Giám Đốc";
                        break;
                }
            }while (choiceOfMe>=1&&choiceOfMe<=6);



            System.out.println("mời bạn nhập lương của nhân viên");
            double salaryOfEmployee=Double.parseDouble(scanner.nextLine());

            Employee employee=new Employee(employCode,nameOfEmployee,dateOfEmployee,genderOfEmployee,idOfEmployee,numberCallOfEmployee,emailOfEmployee,level,location,salaryOfEmployee);
            iRepositoryEmployee.addEmployee(employee);
        }
        catch (NullPointerException e){
            System.out.println("phần tử  bạn nhập bị rỗng không có giá trị");
        }catch (NumberFormatException e){
            System.out.println("Phần tử bạn nhập không khớp có thể là bạn nhập sai giá trị yêu cầu của đề xuất");
        }



    }

    @Override
    public void deleteEmployee() {
        System.out.println("mời bạn nhập tên đối tượng cần xóa");
        String nameNeedDelete="";
        iRepositoryEmployee.deleteEmployee(nameNeedDelete);

    }

    @Override
    public ArrayList<Employee> showEmployee() {
        ArrayList<Employee> arrayList=new ArrayList();
        arrayList=iRepositoryEmployee.showEmployee();
        for (Employee employee:arrayList
             ) {
            System.out.println(employee);
        }
        return arrayList;
    }

    @Override
    public void fixEmployee() {
        try {
            System.out.println("mời bạn nhập tên của Employee cần để kiểm tra");
            String stringOfMe=scanner.nextLine();
            iRepositoryEmployee.fixEmployee(stringOfMe);
        }catch (NumberFormatException e){
            System.out.println("Phần tử bạn nhập không khớp có thể là bạn nhập sai giá trị yêu cầu của đề xuất");
        }


    }
}
