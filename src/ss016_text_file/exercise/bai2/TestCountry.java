package ss016_text_file.exercise.bai2;

import java.io.*;
import java.util.ArrayList;

public class TestCountry {
    public ArrayList<Country> readCountry(String fileSource) throws IOException, FileNotFoundException {
        ArrayList<Country> countryArrayList = new ArrayList<>();
        File file = new File(fileSource);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String stringOfCountry ="";
        while ((stringOfCountry = bufferedReader.readLine()) != null) {
            Country country = new Country();
            String[] stringSplit = stringOfCountry.split(",");
            country.setIdOfCountry(Integer.parseInt(stringSplit[0]));
            country.setNameOfCountry(stringSplit[1]);
            country.setCodeOfCountry(stringSplit[2]);
            countryArrayList.add(country);
        }
        return countryArrayList;
    }
    public void writeCountry(String fileNew, ArrayList<Country> countryArrayList)throws IOException,FileNotFoundException {
        FileWriter fileWriter=new FileWriter(fileNew);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(String.valueOf(countryArrayList));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static void main(String[] args) {
       try{
           final String FILESOURCE="C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss016_text_file\\exercise\\bai2\\country.csv";
           final String FILENEW="C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss016_text_file\\exercise\\bai2\\filenew";
           TestCountry testCountry=new TestCountry();
           testCountry.writeCountry(FILENEW, testCountry.readCountry(FILESOURCE));

       }
       catch (FileNotFoundException e){
           System.out.println("file không được tìm thấy");
       }catch (IOException e){
           System.out.println("file không cho phép truy cập");
       }catch (Exception e){
         e.printStackTrace();
       }

    }
}
