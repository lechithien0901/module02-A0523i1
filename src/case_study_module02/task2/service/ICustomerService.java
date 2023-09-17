package case_study_module02.task2.service;

public interface ICustomerService extends Service {
    void addCustomer(String nameCustomer);
    void deleteCustomer(int idCustomer);
}
