package ss017_binary_file.pratice.thuchanh1;

import ss017_binary_file.pratice.thuchanh2.Student;

import java.io.*;

public class ReadByteConsole {
    static final String FILE_SOURCE = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss017_binary_file\\pratice\\thuchanh1\\filesource";
    public static void main(String[] args)  {
        ObjectOutputStream objectOutputStream = null;
        try {
            // Khởi tạo objectOutputStream ở đây
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_SOURCE));
            Product product=new Product(1,"nguyen van a",3000,"cd");
            objectOutputStream.writeObject(product);
            objectOutputStream.flush();
        } catch (NullPointerException e) {
            System.out.println("lỗi thứ nhất");
        } catch (ObjectStreamException e) {
            System.out.println("lỗi thứ 2");
        } catch (IOException e) {
            System.out.println("lỗi thứ 3");
        } catch (Exception e) {
            e.getMessage();
        } finally {

            if (objectOutputStream != null) {
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("hoàn thành");
}}