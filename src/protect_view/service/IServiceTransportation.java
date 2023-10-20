package protect_view.service;

import protect_view.model.Transportation;

import java.util.ArrayList;

public interface IServiceTransportation {
    ArrayList<Transportation> showTransportation();
    void addTransportation();
    void editTransportation();
    void deleteTransportation();
}
