package case_study_module02.task6.servicebooking;

import case_study_module02.task6.model.Booking;
import case_study_module02.task6.model.Contract;

import java.util.Queue;
import java.util.TreeSet;

public interface IServiceBooking {
    void addBooking();
    TreeSet<Booking> showBooking();
    void addContract();
    Queue<Contract>showContract();
    void Edit();


}
