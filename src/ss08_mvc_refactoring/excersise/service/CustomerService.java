package ss08_mvc_refactoring.excersise.service;

import ss08_mvc_refactoring.excersise.model.Customer;
import ss08_mvc_refactoring.excersise.repository.CustomerRepository;
import ss08_mvc_refactoring.excersise.repository.ICustomerRepository;

import java.util.Scanner;

public class CustomerService implements ICustomerService{
    Scanner scanner=new Scanner(System.in);
    ICustomerRepository iCustomerRepository=new CustomerRepository();
    @Override
    public Customer[] findAll() {
        Customer[]customers=iCustomerRepository.findAll();
        for (Customer customer:customers){
            System.out.println(customer);
        }
        return customers;
    }

    @Override
    public void addCustomer() {
        System.out.println(" mời bạn nhập id cần thêm mới : ");
        int idOfCustomer=Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập tên cần muốn thêm");
        String nameOfCustomer=scanner.nextLine();
        System.out.println("mời bạn nhập giá của sản phẩm");
        double salaryOfCustomer=Double.parseDouble(scanner.nextLine());
        System.out.println("mời bạn nhập những mô tả về sản phẩm");
        String productOfCustomer=scanner.nextLine();
        Customer customer=new Customer(idOfCustomer,nameOfCustomer,salaryOfCustomer,productOfCustomer);
        iCustomerRepository.addCustomer(customer);

    }


    @Override
    public void fixCustomer() {
        System.out.println("mời bạn nhập id cần muốn sửa");
        int idOfCustomer=Integer.parseInt(scanner.nextLine());
        boolean check=true;
        int choice=0;
        do{
            System.out.println("==================================================");
            System.out.println("1.Sửa tên");
            System.out.println("2.Sửa giá tiền");
            System.out.println("3.Sửa thông tin");
            System.out.println("4.Bấm số bất kì để thoát khỏi danh sách sửa đổi");
            System.out.println("==================================================");
            System.out.println("mời bạn nhập menu trên : ");
            choice=Integer.parseInt(scanner.nextLine());
Customer customer[]=iCustomerRepository.findAll();
            switch (choice){
                case 1:
                    for (int i = 0; i <iCustomerRepository.getSize() ; i++) {
                        if (idOfCustomer==customer[i].getId()){
                            System.out.println("bạn muốn sửa tên");
                            String nameOfCustomer=scanner.nextLine();
                            Customer customer1=new Customer(customer[i].getId(),nameOfCustomer,customer[i].getSalary(),customer[i].getProduct());
                            iCustomerRepository.fixCustomer(idOfCustomer,customer1);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i <iCustomerRepository.getSize() ; i++) {
                        if (idOfCustomer==customer[i].getId()){
                            System.out.println("bạn muốn sửa giá tiền");
                            double salary=Double.parseDouble(scanner.nextLine());
                            Customer customer1=new Customer(customer[i].getId(),customer[i].getName(),salary,customer[i].getProduct());
                            iCustomerRepository.fixCustomer(idOfCustomer,customer1);
                        }


                    }
                    break;
                case 3:
                    for (int i = 0; i <iCustomerRepository.getSize() ; i++) {
                        if (idOfCustomer==customer[i].getId()){
                            System.out.println("bạn muốn sửa thông tin sản phẩm");
                            String productOfCustomer=scanner.nextLine();
                        Customer customer1=new Customer(customer[i].getId(),customer[i].getName(),customer[i].getSalary(),productOfCustomer);
                            iCustomerRepository.fixCustomer(idOfCustomer,customer1);
                        }




                    }

                 ;
                    break;
            }
        }while (choice<=3&&choice>=0);




    }

    @Override
    public void findCustomer() {
        System.out.println("mời bạn nhập tên để tìm kiếm sản phẩm");
        String nameOfCustomer=scanner.nextLine();
        iCustomerRepository.findCustomer(nameOfCustomer);
    }

    @Override
    public void deleteCustomer() {
        System.out.println("mời bạn nhập vị trị bạn muốn xóa : ");
        int id=Integer.parseInt(scanner.nextLine());
        iCustomerRepository.deleteCustomer(id);


    }
}
