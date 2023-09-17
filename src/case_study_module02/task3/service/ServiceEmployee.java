package case_study_module02.task3.service;

import case_study_module02.task2.service.IEmployeeService;
import case_study_module02.task3.model.Employee;

import java.util.ArrayList;

public class ServiceEmployee implements IServiceEmployee {
    @Override
    public void addEmployee() {
        System.out.println("mời bạn nhập ");

    }

    @Override
    public void deleteEmployee() {

    }

    @Override
    public ArrayList<Employee> showEmployee() {
        return null;
    }

    @Override
    public void fixEmployee() {

    }
}
