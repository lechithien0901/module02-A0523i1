package protect_view_new.service;

import protect_view_new.model.Oto;
import protect_view_new.model.Truck;
import protect_view_new.model.Vehicle;
import protect_view_new.repository.IRepositoryTransportation;
import protect_view_new.repository.RepositoryTransportation;

import java.util.Scanner;

public class ServiceTransportation implements IServiceTransportation{
    Scanner scanner=new Scanner(System.in);
    IRepositoryTransportation iRepositoryTransportation=new RepositoryTransportation();
    @Override
    public void showTransportation(int choice) {
        iRepositoryTransportation.showTransportation(choice);

    }

    @Override
    public void addTransportation(int choice) {
      if (choice==1){
          System.out.println("bạn đã chọn thêm Xe tải");
          String controlOfVehicle="";
          String  nameManufacturer="";
          String yearOfManufacture="";
          String ownerOfVehicle="";
          String payLoad="";
          Truck truck=new Truck(controlOfVehicle,nameManufacturer,yearOfManufacture,ownerOfVehicle,payLoad);
          iRepositoryTransportation.addTransportation(choice,truck);

      }
      if (choice==2){
          System.out.println("bạn đã chọn thêm mới xe Oto");
          String controlOfVehicle="";
          String  nameManufacturer="";
          String yearOfManufacture="";
          String ownerOfVehicle="";
          String numberOfSeat="";
          String vehicleType="";
          Oto oto=new Oto(controlOfVehicle,nameManufacturer,yearOfManufacture,ownerOfVehicle,numberOfSeat,vehicleType);
          iRepositoryTransportation.addTransportation(choice,oto);

      }
      if (choice==3){
          System.out.println("bạn đã chọn thêm mới xe máy");
          String controlOfVehicle="";
          String  nameManufacturer="";
          String yearOfManufacture="";
          String ownerOfVehicle="";
          String wattage="";
          Vehicle vehicle=new Vehicle(controlOfVehicle,nameManufacturer,yearOfManufacture,ownerOfVehicle,wattage);
          iRepositoryTransportation.addTransportation(choice,vehicle);

      }
    }

    @Override
    public void editTransportation(int choice) {
        iRepositoryTransportation.showTransportation(choice);
        System.out.println("mời bạn nhập Biển kiểm soát để xóa");
        String control=scanner.nextLine();
        iRepositoryTransportation.editTransportation(choice,control);

    }

    @Override
    public void deleteTransportation(int choice) {
        iRepositoryTransportation.showTransportation(choice);
        System.out.println("mời bạn nhập Biển kiểm tra để xóa");
        String control=scanner.nextLine();
        iRepositoryTransportation.deleteTransportation(choice,control);

    }
}
