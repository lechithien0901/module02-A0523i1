package practice_exercises.service;

import practice_exercises.model.Customer;
import practice_exercises.repository.IRepositoryCustomer;
import practice_exercises.repository.RepositoryCustomer;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceCustomer implements IServiceCustomer {
    Scanner scanner = new Scanner(System.in);
    IRepositoryCustomer iRepositoryCustomer = new RepositoryCustomer();

    @Override
    public ArrayList<Customer> showCustomer() {
        RepositoryCustomer repositoryCustomer = new RepositoryCustomer();
        ArrayList<Customer> arrayList = new ArrayList<>();
        arrayList = repositoryCustomer.showCustomer();
        for (Customer customer : arrayList) {
            System.out.println(customer);
        }
        return arrayList;
    }

    @Override
    public void addCustomer() {
        System.out.println("mời bạn nhập mã của Khách hàng Customer");
        String customerCode = scanner.nextLine();
        System.out.println("mời bạn nhập tên của Khách hàng Customer");
        String customerName = scanner.nextLine();
        System.out.println("mời bạn nhập ngày sinh của khách hàng Customer");
        String customerBirthday = scanner.nextLine();
        System.out.println("mời bạn nhập giới tinh của khách hàng");
        String customerGender = scanner.nextLine();
        System.out.println("mời bạn nhập số CMND");
        String customerCMND = scanner.nextLine();
        System.out.println("mời bạn nhập số điện thoại");
        String customerPhone = scanner.nextLine();
        System.out.println("mời bạn nhập email");
        String customerEmail = scanner.nextLine();
        System.out.println("mời bạn nhập loại khách");
        String customerType = scanner.nextLine();
        System.out.println("mời bạn nhập địa chỉ");
        String customerAddress = scanner.nextLine();
        Customer customer = new Customer(customerCode, customerName, customerBirthday, customerGender, customerCMND, customerPhone, customerEmail, customerType, customerAddress);
        iRepositoryCustomer.addCustomer(customer);

    }

    @Override
    public void editCustomer() {
        System.out.println("mời bạn nhập chuỗi mình cần tìm kiếm");
        String id = scanner.nextLine() ;
        Customer customer = iRepositoryCustomer.findCustomer(id);
        if (customer != null) {
            System.out.println("mời bạn sửa lại tên");
            customer.setCustomerName(scanner.nextLine());
            System.out.println("mời bạn sửa lại ngày sinh");
            customer.setCustomerBirthday(scanner.nextLine());
            System.out.println("mời bạn sửa lại giới tính");
            customer.setCustomerGender(scanner.nextLine());
            System.out.println("mời bạn sửa lại chưng minh nhân dân ");
            customer.setCustomerCMND(scanner.nextLine());
            System.out.println("mời bạn sửa lại số điện thoại ");
            customer.setCustomerPhone(scanner.nextLine());
            System.out.println("mời bạn sửa lại email");
            customer.setCustomerEmail(scanner.nextLine());
            System.out.println("mời bạn sửa lại loại khách hàng");
            customer.setCustomerType(scanner.nextLine());
            System.out.println("mời bạn sửa lại địa chỉ khách hàng");
            customer.setCustomerAddress(scanner.nextLine());
            iRepositoryCustomer.editCustomer(id,customer);
        }else {
            System.out.println("khách hàng bạn tìm kiếm không thấy");
        }

    }

    @Override
    public void deleteCustomer() {

    }
}
