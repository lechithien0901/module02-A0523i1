package ss015_exception.pratice;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập kí tự x vào đây");
        int x=scanner.nextInt();
        System.out.println("mời bạn nhập giá trị y vào đây");
        int y=scanner.nextInt();
        CalculationExample calculationExample=new CalculationExample();
    try {
        calculationExample.isPerform(x,y);
    }catch (ArithmeticException e){
        System.out.println("lỗi chuong trình");
    }

    }
public void isPerform(int x,int y) throws ArithmeticException{

    int d=x/y;
    System.out.println(d);
}
}
