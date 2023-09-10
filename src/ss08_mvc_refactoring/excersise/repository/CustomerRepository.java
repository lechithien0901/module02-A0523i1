package ss08_mvc_refactoring.excersise.repository;

import ss08_mvc_refactoring.excersise.model.Customer;
import ss08_mvc_refactoring.excersise.service.CustomerService;

public class CustomerRepository implements ICustomerRepository {
    static Customer[]customers=new Customer[10];

    static int size=0;
    static {
        customers[0]=new Customer(0,"nguyen van a",1000,"mau vàng");
        customers[1]=new Customer(1,"nguyen van b",2000,"mau đỏ");
        customers[2]=new Customer(2,"nguyễn văn c",3000,"màu tím");
        size=3;
    }
    @Override
    public Customer[] findAll() {
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
customers[size]=customer;
size++;
    }

    @Override
    public void fixCustomer(int id,Customer customer) {
        boolean check=true;
        for (int i = 0; i <getSize() ; i++) {
            if (customers[i].getId()==id) {
                check = false;
                customers[i].setName(customer.getName());
                customers[i].setSalary(customer.getSalary());
                customers[i].setProduct(customer.getProduct());
            }


        }

        if (!check){
            System.out.println("thông tại vị trí id thứ "+id+"đã được sửa những thứ bạn cần");
        }

    }

    @Override
    public void deleteCustomer(int id) {
        for (int i = id; i <getSize(); i++) {
            if (i==0){
                for (int j = 0; j <size-1 ; j++) {
                    System.out.println("phần tử được xóa đó là");
                    customers[j]=customers[j+1];



                }


            }
            else if(i==size){
                customers[size-1]=null;

            }else {
                System.out.println("phần tử được xóa đó là = "+customers[id].toString());
                customers[i]=customers[i+1];

            }

        }
        customers[size-1]=null;
        size--;

    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void findCustomer(String name) {
        boolean check=true;
        for (int i = 0; i < getSize(); i++) {
            if (customers[i].getName().equals(name)){
                check=false;
                System.out.println("sản phẩm bạn đã được tìm với những thông tin như sau = "+"có id = "+customers[i].getId()+"có giá = "+customers[i].getSalary()+" sản phẩm có nhân dạng là = "+customers[i].getProduct());

            }


        }
        if (check){
            System.out.println("sản phẩm của bạn không tìm kiếm được mời bạn nhập lại chức năng");
        }
    }
}
