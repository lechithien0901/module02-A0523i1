package case_study_module02.task3.repository;

import case_study_module02.task3.model.Employee;

import java.util.ArrayList;

public class RepositoryEmployee implements IRepositoryEmployee{
    static ArrayList<Employee>employeeArrayList=new ArrayList<>();
    static {
        employeeArrayList.add(new Employee("CD01","Nguyen van a",9,"nam","09123123","0932123","nguyenvana@gmail.com,","Đại học","lê tân",3000));
    }
    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void deleteEmployee(String name) {

    }

    @Override
    public ArrayList<Employee> showEmployee() {
        return null;
    }

    @Override
    public void fixEmployee(String name) {

    }
}
