package case_study_module02.task1.service;


import case_study_module02.task1.model.Customer;

import java.util.ArrayList;

public interface IServiceCustomer {
    ArrayList<Customer> showCustomer();
    void addCustomer();
    void fixCustomer();
    void deleteCustomer();
}
