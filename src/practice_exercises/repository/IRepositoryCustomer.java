package practice_exercises.repository;

import practice_exercises.model.Customer;

import java.util.ArrayList;

public interface IRepositoryCustomer {
    ArrayList<Customer> showCustomer();
    void addCustomer(Customer customer);
    void editCustomer(String id,Customer customer);
    void deleteCustomer(String id);
    Customer findCustomer(String id);
}
