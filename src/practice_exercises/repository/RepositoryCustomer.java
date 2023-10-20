package practice_exercises.repository;

import practice_exercises.model.Customer;

import java.io.*;
import java.util.ArrayList;

public class RepositoryCustomer implements IRepositoryCustomer {
    static final String FILE_PATH = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\practice_exercises\\customer.csv";
    static ArrayList<Customer> customerArrayList = new ArrayList<>();

    public ArrayList<Customer> readCustomer() throws FileNotFoundException, IOException, Exception {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        File file = new File(FILE_PATH);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = "";
        while ((str = bufferedReader.readLine()) != null) {
            Customer customer = new Customer();
            String[] splitLine = str.split(",");
            customer.setCustomerCode(splitLine[0]);
            customer.setCustomerName(splitLine[1]);
            customer.setCustomerBirthday(splitLine[2]);
            customer.setCustomerGender(splitLine[3]);
            customer.setCustomerCMND(splitLine[4]);
            customer.setCustomerPhone(splitLine[5]);
            customer.setCustomerEmail(splitLine[6]);
            customer.setCustomerType(splitLine[7]);
            customer.setCustomerAddress(splitLine[8]);
            customerArrayList.add(customer);
        }
        return customerArrayList;
    }

    public void WriteCustomer(ArrayList<Customer> arrayList) throws IOException, FileNotFoundException, Exception {
        FileWriter fileWriter = new FileWriter(new File(FILE_PATH));
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Customer customer : arrayList) {
            bufferedWriter.write(customer.getCustomerCode() + "," + customer.getCustomerName() + "," + customer.getCustomerBirthday() + "," + customer.getCustomerGender() + "," + customer.getCustomerCMND() + "," + customer.getCustomerPhone() + "," + customer.getCustomerEmail() + "," + customer.getCustomerType() + "," + customer.getCustomerAddress());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }

    @Override
    public ArrayList<Customer> showCustomer() {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        try {
            customerArrayList = this.readCustomer();
        } catch (FileNotFoundException e) {
            System.out.println("file của bạn không tìm thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("Fil của bạn đang bị lỗi gì đó");
        }

        return customerArrayList;
    }

    @Override
    public void addCustomer(Customer customer) {


        try {
            customerArrayList.add(customer);
            this.WriteCustomer(customerArrayList);
        } catch (FileNotFoundException e) {
            System.out.println("File của bạn không thể tìm thấy");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("File của bạn không thể truy cập được");
        } catch (Exception e) {
            System.out.println("bạn đã bị lỗi gì đó");
        }

    }


    @Override
    public Customer findCustomer(String id) {
        ArrayList<Customer> arrayList = new ArrayList<>();
        try {
            arrayList = this.readCustomer();
            for (Customer customer1 : arrayList) {
                if (customer1.getCustomerCode().equals(id)) {
                    return customer1;
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("file cuả bạn không thể tìm kiếm được");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("bạn đã bị lỗi một thứ gì đó");
        }

        return null;
    }


    @Override
    public void editCustomer(String id, Customer customer) {
        try {
            boolean checkEdit = false;
            ArrayList<Customer> arrayList = this.readCustomer();
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).getCustomerCode().equals(id)) {
                    arrayList.get(i).setCustomerName(customer.getCustomerName());
                    arrayList.get(i).setCustomerBirthday(customer.getCustomerBirthday());
                    arrayList.get(i).setCustomerGender(customer.getCustomerGender());
                    arrayList.get(i).setCustomerCMND(customer.getCustomerCMND());
                    arrayList.get(i).setCustomerPhone(customer.getCustomerPhone());
                    arrayList.get(i).setCustomerEmail(customer.getCustomerEmail());
                    arrayList.get(i).setCustomerType(customer.getCustomerType());
                    arrayList.get(i).setCustomerAddress(customer.getCustomerAddress());
                    checkEdit = true;

                }

            }
            if (!checkEdit) {
                System.out.println("phần tử của bạn không tìm thấy trong danh sách");
            } else {
                this.WriteCustomer(arrayList
                );
            }


        } catch (FileNotFoundException e) {
            System.out.println("File của bạn tìm kiếm không thấy");
        } catch (IOException e) {
            System.out.println("File của bạn không cho phép truy cập");
        } catch (Exception e) {
            System.out.println("File của bạn đang bị lỗi một thứ gì đó");
        }

    }

    @Override
    public void deleteCustomer(String id) {

    }
}
