package case_study_module02.task5.service;

import case_study_module02.task5.model.Facility;
import case_study_module02.task5.model.House;
import case_study_module02.task5.model.Room;
import case_study_module02.task5.model.Villa;
import case_study_module02.task5.repository.FacilityRepository;
import case_study_module02.task5.repository.IFacilityRepository;

import java.util.LinkedHashMap;

public class FacilityService implements IFacilityService{
    IFacilityRepository iFacilityRepository=new FacilityRepository();
    @Override
    public LinkedHashMap<Facility, Integer> showFacility() {
        FacilityRepository facilityRepository=new FacilityRepository();
        LinkedHashMap<Facility,Integer>facilityIntegerLinkedHashMap=facilityRepository.showFacility();
        return facilityIntegerLinkedHashMap;
    }

    @Override
    public void addFacility(int choice) {
       int choiceOfMe=choice;
        if (choiceOfMe==1){
            Villa villa;
            System.out.println("bạn đã chọn Thêm Villa");
            String serviceCode="";
            String serviceName="";
            double area=0;
            double rentalCost=0;
            int maxOccupancy=0;
            String rentType="";
            String stardardRoom="";
            double poolArea=0;
            int doubleOfFloor=0;
            villa=new Villa(serviceCode,serviceName,area,rentalCost,maxOccupancy,rentType,stardardRoom,poolArea,doubleOfFloor);
            iFacilityRepository.addFacility(choiceOfMe,villa);
        }
        if (choiceOfMe==2){
            House house;
            System.out.println("bạn đã chọn thêm House");
            String serviceCode="";
            String serviceName="";
            double area=0;
            double rentalCost=0;
            int maxOccupancy=0;
            String rentType="";
            String roomStardard="";
            int numberOfFloor=0;
            house=new House(serviceCode,serviceName,area,rentalCost,maxOccupancy,rentType,roomStardard,numberOfFloor);
            iFacilityRepository.addFacility(choiceOfMe,house);

        }
        if (choiceOfMe==3){
            Room room;
            System.out.println("bạn đã chọn thêm Room");
            String serviceCode="";
            String serviceName="";
            double area=0;
            double rentalCost=0;
            int maxOccupancy=0;
            String rentType="";
            String accompaniedService="";
            room=new Room(serviceCode,serviceName,area,rentalCost,maxOccupancy,rentType,accompaniedService);
            iFacilityRepository.addFacility(choiceOfMe,room);
        }

    }

    @Override
    public void fixFacility() {
        System.out.println("Để bảo trì bảo dưỡng các dịch vụ Furama cũng có quy định mỗi một dịch vụ khi sử\n" +
                "dụng liên tục 5 lần sẽ được đội kỹ thuật kiểm tra bảo dưỡng các trang thiết bị");
        iFacilityRepository.fixFacility();

    }
}
