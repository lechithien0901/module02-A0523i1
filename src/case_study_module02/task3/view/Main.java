package case_study_module02.task3.view;

import case_study_module02.task3.controller.EmployeeController;

public class Main {
    public static void main(String[] args) {
        EmployeeController employeeController=new EmployeeController();
        employeeController.showEmployee();
    }
}
