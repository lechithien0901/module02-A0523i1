package protect_view.repository;

import protect_view.model.Oto;
import protect_view.model.Transportation;
import protect_view.model.Truck;
import protect_view.model.Vehicle;

import java.io.*;
import java.util.ArrayList;

public class RepositoryTransportation implements IRepositoryTransportation {
    static ArrayList<Transportation> arrayList = new ArrayList<>();
    static final String FILE_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\protect_view\\vehicle.csv";
    static {
        arrayList.add(new Oto("oto","43C-012.34","Huyndai","2019","Nguyen van a","6","du lich"));
        arrayList.add(new Vehicle("xemay","43-K1-678.56","Honda","2019","Nguyen van b","150"));
    }
public void writeTransportation(ArrayList<Transportation> arrayList) {

    try {
        File file =new File(FILE_PATH);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (Transportation transportation:arrayList){
            if (transportation instanceof Oto){
                Oto oto =new Oto();
                bufferedWriter.write(oto.getNameVehicle()+","+oto.getControlOfVehicle()+","+oto.getNameManufacturer()+","+oto.getYearOfManufacture()+","+oto.getOwnerOfVehicle()+","+oto.getNumberOfSeat()+","+oto.getVehicleType());
                bufferedWriter.newLine();

            }if (transportation instanceof Truck){
                Truck truck=new Truck();
                bufferedWriter.write(truck.getNameVehicle()+","+truck.getControlOfVehicle()+","+truck.getNameManufacturer()+","+truck.getYearOfManufacture()+","+truck.getOwnerOfVehicle()+","+truck.getPayLoad());

            }if (transportation instanceof Vehicle){
                Vehicle vehicle=new Vehicle();
                bufferedWriter.write(vehicle.getNameVehicle()+","+vehicle.getControlOfVehicle()+","+vehicle.getNameManufacturer()+","+vehicle.getYearOfManufacture()+","+vehicle.getOwnerOfVehicle()+","+vehicle.getWattage());
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();

    } catch ( FileNotFoundException e) {
        System.out.println("File của bạn không tìm thấy");
    }catch (IOException e){
        System.out.println("File của bạn không thể truy cập");
    }


}
    public ArrayList<Transportation> readTransportation() {
        try {
            ArrayList<Transportation> arrayList = new ArrayList<>();
            File file = new File(FILE_PATH);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                String[] stringsSplit = str.split(",");
                String nameOfVehicle = stringsSplit[0];
                if (nameOfVehicle.equals("oto")) {
                    Oto oto = new Oto(nameOfVehicle, stringsSplit[1], stringsSplit[2], stringsSplit[3], stringsSplit[4], stringsSplit[5], stringsSplit[6]);
                    arrayList.add(oto);
                }
                if (nameOfVehicle.equals("xetai")) {
                    Truck truck = new Truck(nameOfVehicle, stringsSplit[1], stringsSplit[2], stringsSplit[3], stringsSplit[4], stringsSplit[5]);
                    arrayList.add(truck);
                }else if (nameOfVehicle.equals("xemay")){
                    Vehicle vehicle=new Vehicle(nameOfVehicle,stringsSplit[1],stringsSplit[2],stringsSplit[3],stringsSplit[4],stringsSplit[5]);
                    arrayList.add(vehicle);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("mời của bạn tìm không thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("bạn đã bị lỗi gì đó khi tìm File");

        }
        return arrayList;
    }


    @Override
    public ArrayList<Transportation> showTransportation() {
        this.writeTransportation(arrayList);
        ArrayList<Transportation>arrayList=this.readTransportation();

        return arrayList;
    }

    @Override
    public void addTransportation(Transportation transportation) {

    }

    @Override
    public void editTransportation(String nameVehicle) {

    }

    @Override
    public void deleteTransportation(String nameVehicle) {

    }
}
