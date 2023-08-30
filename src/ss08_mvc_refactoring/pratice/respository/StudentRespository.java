package ss08_mvc_refactoring.pratice.respository;

import ss08_mvc_refactoring.pratice.model.Student;

import java.util.Scanner;

public class StudentRespository  implements IStudentRepository{
    Scanner scanner=new Scanner(System.in);
    static int size=0;
    static Student[]students=new Student[10];
    static {
        students[0]=new Student("nguyễn văn a",0,9,19);
        students[1]=new Student("nguyễn văn b",1,10,29);
        students[2]=new Student("nguyễn văn c",2,8.5,56);
        size=3;

    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public int getSize() {
        return size;
    }
 @Override
    public void addStudent(Student student) {
        students[size]=student;
        size++;
        
    }
    @Override
    public void fixStudent() {
        boolean checkIdStudent=true;
        int selectedStudent;
    do{
        System.out.println("mời bạn nhập Id cần muốn sửa");
        selectedStudent=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < getSize(); i++) {
            if (selectedStudent==students[i].getStudentOfId())     {
                checkIdStudent=false;
                int choiceStudent;
                do{
                    System.out.println(" ======================================== ");
                    System.out.println(" 1.Chức năng sửa tên");
                    System.out.println(" 2.Chức năng sửa điểm");
                    System.out.println(" 3.Chức năng sửa tuổi");
                    System.out.println(" Chọn một chức số khác để thoát");
                    System.out.println(" ========================================= ");
                    System.out.println("mời bạn nhập chức năng muốn chọn");
                    choiceStudent=Integer.parseInt(scanner.nextLine());
                    switch (choiceStudent){
                        case 1:
                            System.out.println("mời bạn nhập tên cần muốn sửa");
                            String newNameStudent=scanner.nextLine();
                            students[i].setStudentName(newNameStudent);
                            break;
                        case 2:
                            System.out.println("mời bạn nhập điểm bạn cần muốn sửa");
                            double newScoreStudent=Double.parseDouble(scanner.nextLine());
                            students[i].setStudentScore(newScoreStudent);
                            break;
                        case 3:
                            System.out.println("mời bạn nhập tuổi bạn cần muốn sửa");
                            int newCountStudent=Integer.parseInt(scanner.nextLine());
                            students[i].setStudentCount(newCountStudent);
                                  break;


                    }
                } while (choiceStudent>=1&&choiceStudent<=3);
            }

        }
        System.out.println("id bạn chọn không có trong mảng vui vòng chọn lại");


    }while (checkIdStudent);


        }

    @Override
    public void deleteStudent() {
        boolean checkIdOfStudent=true;

            int idOfStudent;

       do {
           System.out.println("mời bạn nhâp id của bạn cần muốn xóa ");
            idOfStudent=Integer.parseInt(scanner.nextLine());
           for (int i = 0; i <getSize() ; i++) {
               if (idOfStudent==students[i].getStudentOfId()){
                   checkIdOfStudent=false;
               }
           }
       }while(checkIdOfStudent);
         if (!checkIdOfStudent){
             for (int i = idOfStudent; i < getSize(); i++) {
                 students[i]=students[i+1];
             }
             students[getSize()]=null;
             size--;


         }

    }






     }



