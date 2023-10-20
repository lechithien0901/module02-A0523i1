package protect_view_new.repository;

import protect_view_new.model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RepositoryTransportation implements IRepositoryTransportation {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<Oto> otoArrayList = new ArrayList<>();
    static ArrayList<Truck> truckArrayList = new ArrayList<>();
    static ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
    static final String FILE_OTO = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\protect_view_new\\oto.csv";
    static final String FILE_VEHICLE = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\protect_view_new\\vehicle.csv";
    static final String FILE_TRUCK = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\protect_view_new\\truck.csv";
    static final String FILE_MANUFACTUER = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\protect_view_new\\manufacturer.csv";

    public ArrayList<Oto> readOto() {
        ArrayList<Oto> arrayList = new ArrayList<>();
        try {

            File file = new File(FILE_OTO);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                String[] split = str.split(",");
                Oto oto = new Oto(split[0], split[1], split[2], split[3], split[4], split[5]);
                arrayList.add(oto);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không tìm thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("bạn đã bị lỗi rồi khi tìm File");
        }
        return arrayList;
    }

    public ArrayList<Truck> readTruck() {
        ArrayList<Truck> arrayList = new ArrayList<>();
        try {

            File file = new File(FILE_TRUCK);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                String[] split = str.split(",");
                Truck truck = new Truck(split[0], split[1], split[2], split[3], split[4]);
                arrayList.add(truck);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không tìm thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("bạn đã bị lỗi rồi khi tìm File");
        }
        return arrayList;
    }

    public ArrayList<Vehicle> readVehicle() {
        ArrayList<Vehicle> arrayList = new ArrayList<>();
        try {

            File file = new File(FILE_VEHICLE);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                String[] split = str.split(",");
                Vehicle vehicle = new Vehicle(split[0], split[1], split[2], split[3], split[4]);
                arrayList.add(vehicle);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không tìm thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("bạn đã bị lỗi rồi khi tìm File");
        }
        return arrayList;
    }

    public void writeOto(ArrayList<Oto> arrayList) {
        try {
            File file = new File(FILE_OTO);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Oto oto : arrayList) {
                bufferedWriter.write(oto.getControlOfVehicle() + "," + oto.getNameManufacturer() + "," + oto.getYearOfManufacture() + "," + oto.getOwnerOfVehicle() + "," + oto.getNumberOfSeat() + "," + oto.getVehicleType());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không tìm thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không thể truy cập");
        } catch (Exception e) {
            System.out.println("bạn đã bị lỗi gì đó");
        }

    }

    public void writeVehicle(ArrayList<Vehicle> arrayList) {
        try {
            File file = new File(FILE_VEHICLE);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Vehicle vehicle : arrayList) {
                bufferedWriter.write(vehicle.getControlOfVehicle() + "," + vehicle.getNameManufacturer() + "," + vehicle.getYearOfManufacture() + "," + vehicle.getOwnerOfVehicle() + "," + vehicle.getWattage());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không thể tìm được");
        } catch (IOException e) {
            System.out.println("File của bạn không thể truy cập");
        } catch (Exception e) {
            System.out.println("File của bạn đã bị lỗi một thứ gì đó");
        }
    }

    public ArrayList<Manufacturer> readManufacturer() {
        ArrayList<Manufacturer> arrayList = new ArrayList<>();
        try {
            File file = new File(FILE_MANUFACTUER);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                String[] split = str.split(",");
                Manufacturer manufacturer = new Manufacturer(split[0], split[1], split[2]);
                arrayList.add(manufacturer);

            }

        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không thể truy cập được");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("File của bạn đang bị lỗi gì đó");
        }
        return arrayList;
    }

    public void writeTruck(ArrayList<Truck> arrayList) {
        try {
            File file = new File(FILE_TRUCK);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Truck truck : arrayList) {
                bufferedWriter.write(truck.getControlOfVehicle() + "," + truck.getNameManufacturer() + "," + truck.getYearOfManufacture() + "," + truck.getOwnerOfVehicle() + "," + truck.getPayLoad());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không thể truy cập được");
        } catch (IOException e) {
            System.out.println("File của bạn không thể truy cập được");
        }
    }

    @Override
    public void showTransportation(int choice) {
        if (choice == 1) {
            System.out.println("bạn đã chọn hiển thị xe tải");
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Truck> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readTruck();
            for (Truck truck : arrayList) {
                System.out.println(truck);
            }
        }
        if (choice == 2) {
            System.out.println("bạn đã chọn hiển thị xe Oto");
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Oto> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readOto();
            for (Oto oto : arrayList) {
                System.out.println(oto);
            }
        }
        if (choice == 3) {
            System.out.println("bạn đã chọn hiển thị xe máy");
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Vehicle> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readVehicle();
            for (Vehicle vehicle : arrayList) {
                System.out.println(vehicle);
            }
        }

    }

    @Override
    public void addTransportation(int choice, Transportation transportation) {
        if (choice == 1) {
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();

            System.out.println("Sau đây là danh sách thêm mới xe tải");

            System.out.println("mời bạn nhập thêm mới biển kiểm soát");
            String controlOfVehicle = scanner.nextLine();

            ArrayList<Manufacturer> arrayListOfMe = repositoryTransportation.readManufacturer();
            for (Manufacturer manufacturer : arrayListOfMe) {
                System.out.println(manufacturer);
            }
            System.out.println("mời bạn nhập thêm tên hàng sản xuất");
            String nameManufacturer = scanner.nextLine();

            String str = "";
            for (Manufacturer manufacturer : arrayListOfMe) {
                if (manufacturer.getManufacturer().equals(nameManufacturer)) {
                    str = manufacturer.toString();
                }
            }
            System.out.println("mời bạn nhập thêm năm sản xuất");
            String yearOfManufacture = scanner.nextLine();
            System.out.println("mời bạn nhập chủ sở hữu");
            String ownerOfVehicle = scanner.nextLine();
            System.out.println("mời bạn nhập trọng tải");
            String payLoad = scanner.nextLine();
            Truck truck = new Truck(controlOfVehicle, str, yearOfManufacture, ownerOfVehicle, payLoad);
            ArrayList<Truck> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readTruck();
            arrayList.add(truck);
            repositoryTransportation.writeTruck(arrayList);
        }
        if (choice == 2) {
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            System.out.println("Sau đây là danh sách thêm mới xe Oto");
            System.out.println("mời bạn nhập thêm mới biển kiểm soát");
            String controlOfVehicle = scanner.nextLine();
            ArrayList<Manufacturer> arrayListOfMe = repositoryTransportation.readManufacturer();
            for (Manufacturer manufacturer : arrayListOfMe) {
                System.out.println(manufacturer);
            }
            System.out.println("mời bạn nhập thêm tên hàng sản xuất");
            String nameManufacturer = scanner.nextLine();
            String str = "";
            for (Manufacturer manufacturer : arrayListOfMe) {
                if (manufacturer.getManufacturer().equals(nameManufacturer)) {
                    str = manufacturer.toString();
                }
            }
            System.out.println("mời bạn nhập thêm năm sản xuất");
            String yearOfManufacture = scanner.nextLine();
            System.out.println("mời bạn nhập chủ sở hữu");
            String ownerOfVehicle = scanner.nextLine();
            System.out.println("mời bạn nhập số chỗ ngồi");
            String numberOfSeat = scanner.nextLine();
            System.out.println("mời bạn nhập số kiểu xe");
            String vehicleType = scanner.nextLine();
            Oto oto = new Oto(controlOfVehicle, str, yearOfManufacture, ownerOfVehicle, numberOfSeat, vehicleType);
            ArrayList<Oto> arrayList = new ArrayList<>();

            arrayList = repositoryTransportation.readOto();
            arrayList.add(oto);
            repositoryTransportation.writeOto(arrayList);

        }
        if (choice == 3) {
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            System.out.println("Sau đây là danh sách thêm mới của xe máy");
            System.out.println("mời bạn nhập thêm mới biển kiểm soát");
            String controlOfVehicle = scanner.nextLine();
            ArrayList<Manufacturer> arrayListOfMe = repositoryTransportation.readManufacturer();
            for (Manufacturer manufacturer : arrayListOfMe) {
                System.out.println(manufacturer);
            }
            System.out.println("mời bạn nhập thêm tên hàng sản xuất");
            String nameManufacturer = scanner.nextLine();
            String str = "";
            for (Manufacturer manufacturer : arrayListOfMe) {
                if (manufacturer.getManufacturer().equals(nameManufacturer)) {
                    str = manufacturer.toString();
                }
            }
            System.out.println("mời bạn nhập thêm năm sản xuất");
            String yearOfManufacture = scanner.nextLine();
            System.out.println("mời bạn nhập chủ sở hữu");
            String ownerOfVehicle = scanner.nextLine();
            System.out.println("mời bạn nhập công suất");
            String wattage = scanner.nextLine();
            Vehicle vehicle = new Vehicle(controlOfVehicle, str, yearOfManufacture, ownerOfVehicle, wattage);

            ArrayList<Vehicle> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readVehicle();
            arrayList.add(vehicle);
            repositoryTransportation.writeVehicle(arrayList);
        }

    }

    @Override
    public void editTransportation(int choice, String stringOfMe) {
        if (choice == 1) {
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Truck> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readTruck();
            boolean check = false;
            for (Truck truck : arrayList) {
                if (truck.getControlOfVehicle().equals(stringOfMe)) {
                    System.out.println("phần tử bạn cần sửa là đây");
                    System.out.println(truck);
                    ArrayList<Manufacturer> arrayList1 = repositoryTransportation.readManufacturer();
                    for (Manufacturer manufacturer : arrayList1) {
                        System.out.println(manufacturer);
                    }
                    System.out.println("mời bạn sửa lại tên hãng sản xuất");
                    String nameManufacturer = scanner.nextLine();
                    String str = "";
                    for (Manufacturer manufacturer : arrayList1) {
                        if (manufacturer.getManufacturer().equals(nameManufacturer)) {
                            str = manufacturer.toString();
                            truck.setNameManufacturer(str);
                        }
                    }

                    System.out.println("mời bạn sửa lại năm sản xuất");
                    truck.setYearOfManufacture(scanner.nextLine());
                    System.out.println("mời bạn sửa lại chủ sở hữu");
                    truck.setOwnerOfVehicle(scanner.nextLine());
                    System.out.println("mời bạn sửa lại trọng tải");
                    truck.setPayLoad(scanner.nextLine());
                    check = true;
                }


            }
            if (!check) {
                System.out.println("không tìm thấy đối tượng xe tải cần sửa");
            }
            if (check) {
                System.out.println("đã sửa đối tượng xe tải");
                repositoryTransportation.writeTruck(arrayList);
            }
        }
        if (choice == 2) {
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Oto> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readOto();
            boolean check = false;
            for (Oto oto : arrayList) {
                if (oto.getControlOfVehicle().equals(stringOfMe)) {
                    System.out.println("phần tử bạn cần sửa là đây");
                    System.out.println(oto);
                    ArrayList<Manufacturer> arrayList1 = repositoryTransportation.readManufacturer();
                    for (Manufacturer manufacturer : arrayList1) {
                        System.out.println(manufacturer);
                    }
                    System.out.println("mời bạn sửa lại tên hãng sản xuất");
                    String nameManufacturer = scanner.nextLine();
                    String str = "";
                    for (Manufacturer manufacturer : arrayList1) {
                        if (manufacturer.getManufacturer().equals(nameManufacturer)) {
                            str = manufacturer.toString();
                            oto.setNameManufacturer(str);
                        }
                    }

                    System.out.println("mời bạn sửa lại năm sản xuất");
                    oto.setYearOfManufacture(scanner.nextLine());
                    System.out.println("mời bạn sửa lại chủ sở hữu");
                    oto.setOwnerOfVehicle(scanner.nextLine());
                    System.out.println("mời bạn sửa lại số chỗ ngồi");
                    oto.setNumberOfSeat(scanner.nextLine());
                    System.out.println("mời bạn sửa lại kiểu xe");
                    oto.setVehicleType(scanner.nextLine());
                    check = true;
                }


            }
            if (!check) {
                System.out.println("không tìm thấy đối tượng xe tải cần sửa");
            }
            if (check) {
                System.out.println("đã sửa đối tượng xe tải");
                repositoryTransportation.writeOto(arrayList);
            }
        }
        if (choice == 3) {
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Vehicle> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readVehicle();
            boolean check = false;
            for (Vehicle vehicle : arrayList) {
                if (vehicle.getControlOfVehicle().equals(stringOfMe)) {
                    System.out.println("phần tử bạn cần sửa là đây");
                    System.out.println(vehicle);
                    ArrayList<Manufacturer> arrayList1 = repositoryTransportation.readManufacturer();
                    for (Manufacturer manufacturer : arrayList1) {
                        System.out.println(manufacturer);
                    }
                    System.out.println("mời bạn sửa lại tên hãng sản xuất");
                    String nameManufacturer = scanner.nextLine();
                    String str = "";
                    for (Manufacturer manufacturer : arrayList1) {
                        if (manufacturer.getManufacturer().equals(nameManufacturer)) {
                            str = manufacturer.toString();
                            vehicle.setNameManufacturer(str);
                        }
                    }

                    System.out.println("mời bạn sửa lại năm sản xuất");
                    vehicle.setYearOfManufacture(scanner.nextLine());
                    System.out.println("mời bạn sửa lại chủ sở hữu");
                    vehicle.setOwnerOfVehicle(scanner.nextLine());
                    System.out.println("mời bạn sửa lại công suất cho xe mạy");
                    vehicle.setWattage(scanner.nextLine());
                    check = true;
                }


            }
            if (!check) {
                System.out.println("không tìm thấy đối tượng xe tải cần sửa");
            }
            if (check) {
                System.out.println("đã sửa đối tượng xe tải");
                repositoryTransportation.writeVehicle(arrayList);
            }
        }

    }

    @Override
    public void deleteTransportation(int choice, String stringOfMe) {
        if (choice == 1) {
            System.out.println("bạn muốn xóa đối tượng xe tải");
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Truck> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readTruck();
            String stringOfDelete = "";
            boolean check = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getControlOfVehicle().equals(stringOfMe)) {
                    System.out.println("đây chính là đối tượng bạn cần xóa" + arrayList.get(i));
                    check = true;
                    System.out.println("Yes or No ");
                    stringOfDelete = scanner.nextLine();
                    if (stringOfDelete.equals("Yes")) {
                        System.out.println("bạn đã chọn muốn xóa đối tượng này");
                        arrayList.remove(i);
                        repositoryTransportation.writeTruck(arrayList);
                    } else {
                        System.out.println("bạn không xóa đối tượng");
                    }
                }

            }
            if (!check) {
                System.out.println("không có đối tượng bạn cần tìm trong này");
            }
        }
        if (choice == 2) {
            System.out.println("Bạn chọn xóa đối tượng xe Oto");
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Oto> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readOto();
            String stringOfDelete = "";
            boolean check = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getControlOfVehicle().equals(stringOfMe)) {
                    System.out.println("đây chính là đối tượng bạn cần xóa" + arrayList.get(i));
                    check = true;
                    System.out.println("Yes or No ");
                    stringOfDelete = scanner.nextLine();
                    if (stringOfDelete.equals("Yes")) {
                        System.out.println("bạn đã chọn muốn xóa đối tượng này");
                        arrayList.remove(i);
                        repositoryTransportation.writeOto(arrayList);
                    } else {
                        System.out.println("bạn không xóa đối tượng");
                    }
                }

            }
            if (!check) {
                System.out.println("không có đối tượng bạn cần tìm trong này");
            }
        }
        if (choice == 3) {
            System.out.println("Bạn chọn xóa đối tượng xe máy");
            RepositoryTransportation repositoryTransportation = new RepositoryTransportation();
            ArrayList<Vehicle> arrayList = new ArrayList<>();
            arrayList = repositoryTransportation.readVehicle();
            String stringOfDelete = "";
            boolean check = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getControlOfVehicle().equals(stringOfMe)) {
                    System.out.println("đây chính là đối tượng bạn cần xóa" + arrayList.get(i));
                    check = true;
                    System.out.println("Yes or No ");
                    stringOfDelete = scanner.nextLine();
                    if (stringOfDelete.equals("Yes")) {
                        System.out.println("bạn đã chọn muốn xóa đối tượng này");
                        arrayList.remove(i);
                        repositoryTransportation.writeVehicle(arrayList);
                    } else {
                        System.out.println("bạn không xóa đối tượng");
                    }
                }

            }
            if (!check) {
                System.out.println("không có đối tượng bạn cần tìm trong này");
            }
        }

    }
}
