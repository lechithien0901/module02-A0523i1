package ss016_text_file.pratice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> integerList(String path)throws  FileNotFoundException,Exception{
       List<Integer>integers=new ArrayList<>();
        File file=new File(path);
        if (!file.exists()){
            throw new FileNotFoundException("File bạn cần tim kiếm không có");
        }
      BufferedReader inputStreamReader=new BufferedReader(new FileReader(file));
        String b="";
      while ((b=inputStreamReader.readLine())!=null){
            integers.add(Integer.parseInt(b));

        }
      inputStreamReader.close();

return integers;
    }
    public void writePath(String isNewPath,int max) throws IOException {
        FileWriter fileWriter=new FileWriter(isNewPath,true);
     BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        System.out.println("");
       bufferedWriter.write("leaf"+max);
       bufferedWriter.close();

    }
    public int maxElement(List<Integer>integerList){
        int numOfInterger = integerList.get(0);
        for (int i = 0; i < integerList.size(); i++) {
            if (numOfInterger<=integerList.get(i)){
                numOfInterger=integerList.get(i);
            }
        }
        return numOfInterger;
    }
//C:\Users\ADMIN\IdeaProjects\module02\src\ss016_text_file\pratice
    //C:\Users\ADMIN\IdeaProjects\module02\src\ss016_text_file\pratice
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try{
            ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
            System.out.println("mời bạn nhập link đường dẫn cần đọc");
            String fileSource=scanner.nextLine();
            System.out.println("mời bạn nhập FILE cần ghi vào");
            String fileNew=scanner.nextLine();
            readAndWriteFile.writePath(fileNew,readAndWriteFile.maxElement(readAndWriteFile.integerList(fileSource)));

        }catch (FileNotFoundException e){
            System.out.println("file của bạn tìm không thấy");
        }catch (NullPointerException e){
            System.out.println("phân tử không có giá trị");

        }catch (IndexOutOfBoundsException e){
            System.out.println("ví trị không hợp lệ");
        }catch (Exception e){
            System.out.println("chương trình của bạn đang bị lỗi");
        }
    }
}
