package protect_view_new.repository;

import protect_view_new.model.Transportation;

public interface IRepositoryTransportation {
    void showTransportation(int choice);
    void addTransportation(int choice, Transportation transportation);
    void editTransportation(int choice,String stringOfMe);
    void deleteTransportation(int choice,String stringOfMe);
}
