package case_study_module02.task1.service;

import case_study_module02.task1.model.Facility;

import java.util.LinkedHashMap;

public interface IFacilityService {
    LinkedHashMap<Facility,Integer> showFacility();
    void addFacility(int choice);
    void fixFacility();
}
