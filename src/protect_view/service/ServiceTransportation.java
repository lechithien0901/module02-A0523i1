package protect_view.service;

import protect_view.model.Transportation;
import protect_view.repository.IRepositoryTransportation;
import protect_view.repository.RepositoryTransportation;

import java.util.ArrayList;

public class ServiceTransportation implements IServiceTransportation {
    IRepositoryTransportation iRepositoryTransportation=new RepositoryTransportation();
    @Override
    public ArrayList<Transportation> showTransportation() {
        RepositoryTransportation repositoryTransportation=new RepositoryTransportation();
        ArrayList<Transportation>arrayList= repositoryTransportation.showTransportation();
        for (Transportation transportation:arrayList){
            System.out.println(transportation);
        }
        return arrayList;
    }

    @Override
    public void addTransportation() {


    }

    @Override
    public void editTransportation() {

    }

    @Override
    public void deleteTransportation() {

    }
}
