package case_study_module02.task3.service;

import case_study_module02.task3.model.Employee;

import java.util.ArrayList;

public interface IServiceEmployee {
    void addEmployee();
    void deleteEmployee();
    ArrayList<Employee>showEmployee();
    void fixEmployee();
}
