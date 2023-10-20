package case_study_module02.task1.repository;

import case_study_module02.task1.model.Customer;

import java.util.ArrayList;

public interface IRepositoryCustomer {
    ArrayList<Customer> showCustomer();
    void addCustomer(Customer customer);
    void fixCustomer(String nameNeedFix);
    void deleteCustomer(String name);
}
