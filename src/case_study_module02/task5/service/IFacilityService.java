package case_study_module02.task5.service;

import case_study_module02.task5.model.Facility;

import java.util.LinkedHashMap;

public interface IFacilityService {
    LinkedHashMap<Facility,Integer>showFacility();
    void addFacility(int choice);
    void fixFacility();

}
