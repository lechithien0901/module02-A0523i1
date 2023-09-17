package ss017_binary_file.pratice.thuchanh2;

import ss017_binary_file.pratice.thuchanh1.Product;
import ss017_binary_file.pratice.thuchanh1.Read;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestStudent {
    static final String FILE_SOURCE="C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss017_binary_file\\pratice\\thuchanh2\\filesource";
    public void write(List<Student>studentList,String path)throws FileNotFoundException, IOException,Exception {
      OutputStream outputStream=new FileOutputStream(path);
      ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
      objectOutputStream.writeObject(studentList);
      objectOutputStream.close();

    }
    public static List<Student>Read(String path)throws FileNotFoundException,IOException,Exception{
        List<Student>studentList=new ArrayList<>();
        File file=new File(path);
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        studentList=(List<Student>)objectInputStream.readObject();
    return studentList;
    }

    public static void main(String[] args) {
   ArrayList<Student>studentList=new ArrayList<>();
   studentList.add(new Student(1,"nguyen van a","DD"));
   studentList.add(new Student(2,"nguyen van b","DC"));
   studentList.add(new Student(3,"nguyen van c","DC"));
   studentList.add(new Student(4,"nguyen van d","DT"));
    TestStudent testStudent=new TestStudent();
    try {
        testStudent.write(studentList,FILE_SOURCE);
      List<Student>studentList1=(List<Student>) Read(FILE_SOURCE);
        for (Student student:studentList1
             ) {
            System.out.println(student);

        }
    }catch (FileNotFoundException e){
        System.out.println("file không tìm thấy");
    }catch (IOException e){
        System.out.println("file không cho phép truy cập");
    }catch (Exception e){
        System.out.println("lỗi gì đó");
    }

    }


}
