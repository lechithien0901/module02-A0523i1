package case_study_module02.task4.service;

import case_study_module02.task4.model.Customer;
import case_study_module02.task4.repository.IRepositoryCustomer;
import case_study_module02.task4.repository.RepositoryCustomer;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceCustomer implements IServiceCustomer{
    Scanner scanner=new Scanner(System.in);
    IRepositoryCustomer repositoryCustomer=new RepositoryCustomer();
    @Override
    public ArrayList<Customer> showCustomer() {
        ArrayList<Customer> arrayList=new ArrayList();

    arrayList=repositoryCustomer.showCustomer();
        System.out.println("đây là danh sách của Customer");
    for (Customer customer:arrayList){
        System.out.println(customer);
    }
    return arrayList;
    }

    @Override
    public void addCustomer() {
        try{
            Customer customer;
            String customerCode="";
            String customerName="";
            String customerDate="";
            System.out.println("thêm giới tính của Customer");
            String customerGender=scanner.nextLine();
            String customerCmnd="";
            String customerPhoneCall="";
            System.out.println("thêm email cho Customer Vui Lòng phải nhập đúng định dạng sau (Số điện thoại phải bắt đầu từ 0 và đủ 10 số.)");
            String customerEmail=scanner.nextLine();
            System.out.println("mời bạn loại Customer");
            int choiceOfMe;

            String customerType="";
            do{
                System.out.println("đây là danh sách lựa chọn cho loại Customer");
                System.out.println("===========================================");
                System.out.println("1.Diamond");
                System.out.println("2.Platinum");
                System.out.println("3.Gold");
                System.out.println("4.Sliver");
                System.out.println("5.Member");
                System.out.println("===========================================");
                System.out.println("mời bạn nhập lựa chọn của mình");
                choiceOfMe=Integer.parseInt(scanner.nextLine());
                switch (choiceOfMe){
                    case 1:
                        System.out.println("bạn đã chọn Diamond");
                    customerType="Diamond";
                    break;
                    case 2:
                        System.out.println("bạn đã chọn Platinum");
                        customerType="Platinum";
                        break;
                    case 3:
                        System.out.println("bạn đã chọn Gold");
                        customerType="Gold";
                        break;
                    case 4:
                        System.out.println("bạn đã chọn Sliver");
                        customerType="Sliver";
                        break;
                    case 5:
                        System.out.println("bạn đã chọn Member ");
                        customerType="Member";
                        break;

                }
            }while (choiceOfMe>=1&&choiceOfMe<=5);
            System.out.println("thêm địa chỉ cho Customer");
            String customerAddress=scanner.nextLine();
            customer=new Customer(customerCode,customerName,customerDate,customerGender,customerCmnd,customerPhoneCall,customerEmail,customerType,customerAddress);
            repositoryCustomer.addCustomer(customer);
        }catch (NumberFormatException e){
            System.out.println("Bạn nhập sai dữ liệu đầu vào");
        }catch (NullPointerException e){
            System.out.println("Lỗi phần bạn nhập dữ liệu bị rỗng");
        }
    }

    @Override
    public void fixCustomer() {
        System.out.println("mời bạn nhập tên bạn cần muốn sửa vào đây");
        String nameOfFix=scanner.nextLine();
        repositoryCustomer.fixCustomer(nameOfFix);

    }

    @Override
    public void deleteCustomer() {

    }
}
