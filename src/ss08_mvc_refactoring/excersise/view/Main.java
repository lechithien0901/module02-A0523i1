package ss08_mvc_refactoring.excersise.view;

import ss08_mvc_refactoring.excersise.controller.CustomerController;

public class Main {
    public static void main(String[] args) {
        CustomerController customerController=new CustomerController();
        customerController.disPlay();
    }
}
