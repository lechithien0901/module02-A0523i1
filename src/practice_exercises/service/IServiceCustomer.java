package practice_exercises.service;

import practice_exercises.model.Customer;

import java.util.ArrayList;

public interface IServiceCustomer {
    ArrayList<Customer>showCustomer();
    void addCustomer();
    void editCustomer();
    void deleteCustomer();

}
