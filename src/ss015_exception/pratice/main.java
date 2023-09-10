package ss015_exception.pratice;

import java.util.Scanner;

public class main {
    public int isPerform(int a,int b) throws MyException{
        int d;
        try {
           d=a/b;
            System.out.println(d);
        }catch (Exception e){
            throw new MyException("lỗi không thể chia được");

        }
        return d;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("mời bạn nhập giá trị a vào đây");
        int a=scanner.nextInt();
        System.out.println("mời bạn nhập giá trị b vào đây ");
        int b=scanner.nextInt();
        main main=new main();
        try{
            main.isPerform(a,b);
        }catch (MyException e){
            System.out.println(e.getGetMessage());

        }

    }

}
