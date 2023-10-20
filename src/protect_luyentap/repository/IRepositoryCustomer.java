package protect_luyentap.repository;

import protect_luyentap.model.Customer;

import java.util.ArrayList;

public interface IRepositoryCustomer {
    void addCustomer(Customer customer);
    ArrayList<Customer> showCustomer();
    void editCustomer(String codeCustomer);
    void deleteCustomer(String codeCustomer);
}
