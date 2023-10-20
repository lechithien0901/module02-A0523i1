package case_study_module02.task1.service;

import case_study_module02.task1.model.Customer;

import java.util.ArrayList;
import java.util.Stack;

public interface IServiceManagement {
    ArrayList<Customer> showCustomer();
    Stack<String> voucherStack();

}
