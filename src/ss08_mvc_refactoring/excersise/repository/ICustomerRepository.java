package ss08_mvc_refactoring.excersise.repository;

import ss08_mvc_refactoring.excersise.model.Customer;

public interface ICustomerRepository {
    Customer[] findAll();
    void addCustomer(Customer customer);
    void fixCustomer(int id,Customer customer);
    void deleteCustomer(int id);
    int getSize();
    void findCustomer(String name);

}
