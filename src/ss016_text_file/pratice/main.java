package ss016_text_file.pratice;

import java.io.*;
import java.util.Scanner;

public class main {
 static  final String PATH_MAIN = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss016_text_file\\pratice\\main";
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập địa chỉ file của mình ");

        String path=scanner.nextLine();
        try{
            main main=new main();
            main.readFileText(path);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("lỗi một cái gì đó");
        }
    }
    public void readFileText(String path) throws FileNotFoundException,Exception{
        File file=new File(path);
        if (!file.exists()){
            throw new FileNotFoundException("lỗi file tìm không ra");
        }
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String line="";
        int sum=0;
      while ((line=bufferedReader.readLine())!=null){
          System.out.println(line);
          sum+=Integer.parseInt(line);

      }
        System.out.println(sum);
      bufferedReader.close();
    }
}
