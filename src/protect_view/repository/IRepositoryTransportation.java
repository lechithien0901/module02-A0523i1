package protect_view.repository;

import protect_view.model.Transportation;

import java.util.ArrayList;

public interface IRepositoryTransportation {
    ArrayList<Transportation> showTransportation();
    void addTransportation(Transportation transportation);
    void editTransportation(String nameVehicle);
    void deleteTransportation(String nameVehicle);
}
