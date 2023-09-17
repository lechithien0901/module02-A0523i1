package ss017_binary_file.pratice.thuchanh1;

import ss017_binary_file.pratice.thuchanh2.Student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
    static final String FILE_SOURCE = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss017_binary_file\\pratice\\thuchanh1\\filesource";

    public static void main(String[] args) {
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream=new FileInputStream(FILE_SOURCE);
            objectInputStream=new ObjectInputStream(fileInputStream);
           Product product =(Product) objectInputStream.readObject();
            System.out.println(product);
        }catch (FileNotFoundException e){
            System.out.println("lỗi thứ nhất");
        }catch (NullPointerException e){
            System.out.println("lỗi về null");
        }catch (IOException e){
            System.out.println("lỗi thứ 2");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("lỗi một thứ gì đó");
        }finally {
            if (objectInputStream!=null){ try {
                objectInputStream.close();
            }catch (IOException e){
                System.out.println("ádss");
            }}


        }

    }
}
