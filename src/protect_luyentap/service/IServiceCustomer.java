package protect_luyentap.service;

import protect_luyentap.model.Customer;

import java.util.ArrayList;

public interface IServiceCustomer {
    void addCustomer();
    ArrayList<Customer> showCustomer();
    void editCustomer();
    void deleteCustomer();
}
