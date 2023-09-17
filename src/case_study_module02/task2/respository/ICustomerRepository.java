package case_study_module02.task2.respository;

public interface ICustomerRepository extends Repository{
    void addCustomer(String nameCustomer);
    void deleteCustomer(int idCustomer);
}
