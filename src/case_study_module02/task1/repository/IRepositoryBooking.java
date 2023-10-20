package case_study_module02.task1.repository;

import case_study_module02.task1.model.Booking;
import case_study_module02.task1.model.Contract;

import java.util.Queue;
import java.util.TreeSet;

public interface IRepositoryBooking {
    void addBooking(Booking booking);
    TreeSet<Booking> showBooking();
    void addContract();
    Queue<Contract> showContract();
    void Edit(String stringOfContract,Contract contract);
}
