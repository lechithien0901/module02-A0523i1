package protect_luyentap.service;

import protect_luyentap.model.Customer;
import protect_luyentap.repository.IRepositoryCustomer;
import protect_luyentap.repository.RepositoryCustomer;

import java.util.ArrayList;

public class ServiceCustomer implements IServiceCustomer{
    IRepositoryCustomer iRepositoryCustomer=new RepositoryCustomer();
    @Override
    public void addCustomer() {
        Customer customer =new Customer();
        iRepositoryCustomer.addCustomer(customer);
    }

    @Override
    public ArrayList<Customer> showCustomer() {
        return null;
    }

    @Override
    public void editCustomer() {

    }

    @Override
    public void deleteCustomer() {

    }
}
