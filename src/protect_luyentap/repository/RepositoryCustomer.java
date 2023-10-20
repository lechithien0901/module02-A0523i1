package protect_luyentap.repository;

import protect_luyentap.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepositoryCustomer implements IRepositoryCustomer{
    static final String FILE_CUSTOMER="C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\protect_luyentap\\customer.csv";
    static final String CHECK_CODECUSTOMER="^KH-\\d{4}$";
    static final String CHECK_NAMECUSTOMER="^[A-Z][a-z]+\\s+[A-Z][a-z]+\\s[A-Z][a-z]$";
    public ArrayList<Customer> readCustomer(){
        ArrayList<Customer>arrayList=new ArrayList<>();
        try{
            File file=new File(FILE_CUSTOMER);
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                String []split=line.split(",");
                Customer customer=new Customer(split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8]);
                arrayList.add(customer);
            }
            bufferedReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File của bạn không thể tìm thấy");
        }catch (IOException e){
            System.out.println("File của bạn không cho phép truy cập");
        }catch (Exception e){
            System.out.println("File của bạn đang bị lỗi một thứ gì đó");
        }
        return arrayList;
    }
    public  void writeCustomer(ArrayList<Customer>arrayList){
        ArrayList<Customer>arrayListCustomer=new ArrayList<>();
        try {
            File file=new File(FILE_CUSTOMER);
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (Customer customer:arrayList){
                bufferedWriter.write(customer.getCodeCustomer()+","+customer.getNameCustomer()+","+customer.getBirthdayCustomer()+","+customer.getGenderCustomer()+","+customer.getCmndCustomer()+","+customer.getPhoneCustomer()+","+customer.getEmailCustomer()+","+customer.getTypeCustomer()+","+customer.getAddressCustomer());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch (FileNotFoundException e){
            System.out.println("File của bạn không tìm thấy");
        }catch (IOException e){
            System.out.println("File của bạn không cho phép truy cập");
        }catch (Exception e){
            System.out.println("file của bạn đang bị lỗi một thứ gì đó");
        }
    }
    public boolean checkString(String regex,String stringOfMe){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(stringOfMe);
        boolean check=matcher.matches();
        return check;
    }
    @Override
    public void addCustomer(Customer customer) {



    }

    @Override
    public ArrayList<Customer> showCustomer() {
        return null;
    }

    @Override
    public void editCustomer(String codeCustomer) {

    }

    @Override
    public void deleteCustomer(String codeCustomer) {

    }
}
