package case_study_module02.task5.repository;

import case_study_module02.task5.model.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository {
    LinkedHashMap<Facility,Integer> showFacility();
    void addFacility(int choice,Facility facility);
    void fixFacility();
}
