package ss017_binary_file.pratice.thuchanh2;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    static String FILE_SOURCE="C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss017_binary_file\\pratice\\thuchanh2\\filesource";
    static String FILE_NEW="C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss017_binary_file\\pratice\\thuchanh2\\filenew";
    void copyFileUsingJava7Files(File source,File dest)throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    void copyFileUsingStream(File source,File dest)throws FileNotFoundException,IOException,Exception {
        InputStream inputStream=null;
        OutputStream outputStream=null;
        inputStream =new FileInputStream(source);
        outputStream=new FileOutputStream(dest);
        byte[]bytes=new byte[1024];
        int i=-1;
        while ((i=inputStream.read(bytes))!=-1){
          String str=new String(bytes,0,i);
            System.out.println(str);
        }
        outputStream.close();

    }

    public static void main(String[] args) {
        try {
            File fileSource=new File(FILE_SOURCE);
            File fileNew=new File(FILE_NEW);
Main main=new Main();
main.copyFileUsingJava7Files(fileSource,fileNew);
        }catch (FileNotFoundException e){
            System.out.println("file không tìm thấy");
        }catch (IOException e){
            System.out.println("file của bạn không thể truy cập được ");

        }catch (Exception e){
            System.out.println("lỗi một thứ gì đó");
        }
        finally {
            System.out.println("chương trình đã chạy xong");
        }

    }
}
