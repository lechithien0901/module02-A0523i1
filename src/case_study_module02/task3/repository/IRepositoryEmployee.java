package case_study_module02.task3.repository;

import case_study_module02.task3.model.Employee;

import java.util.ArrayList;

public interface IRepositoryEmployee {
    void addEmployee(Employee employee);
    void deleteEmployee(String name);
    ArrayList<Employee> showEmployee();
    void fixEmployee(String name);
}
