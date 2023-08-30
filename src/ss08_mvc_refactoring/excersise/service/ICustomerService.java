package ss08_mvc_refactoring.excersise.service;

import ss08_mvc_refactoring.excersise.model.Customer;

public interface ICustomerService {
    Customer[] findAll();
    void addCustomer();
    void fixCustomer();
    void deleteCustomer();
    void findCustomer();


}
