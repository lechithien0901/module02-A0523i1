package case_study_module02.task1.service;

import case_study_module02.task1.model.Customer;
import case_study_module02.task1.repository.IRepositoryManagement;
import case_study_module02.task1.repository.RepositoryManagement;

import java.util.ArrayList;
import java.util.Stack;

public class ServiceManagement implements IServiceManagement{
    IRepositoryManagement iRepositoryManagement=new RepositoryManagement();
    @Override
    public ArrayList<Customer> showCustomer() {
       return iRepositoryManagement.showCustomer();
    }

    @Override
    public Stack<String> voucherStack() {

        return iRepositoryManagement.voucherStack();
    }
}
