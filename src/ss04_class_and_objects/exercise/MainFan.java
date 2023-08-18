package ss04_class_and_objects.exercise;

import java.util.Scanner;

public class MainFan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Fan isFan=new Fan();
        System.out.println("mời nhập giá trị lớn nhất của speed là 3 vào đây : ");
        int isNum=scanner.nextInt();
        System.out.println("mời nhập bán kính của quạt vào đây là 10 : ");
        int isRadius=scanner.nextInt();
        System.out.println("mời nhập màu của quạt vào đây là màu vàng : ");
        String isColor=scanner.next();
        boolean isTrue=true;
        Fan isFan1=new Fan(isNum,isTrue,isRadius,isColor);
        System.out.println(isFan1);
        System.out.println("===========================================");
        System.out.println("đối tượng quạt thứ 2 ");
        System.out.println("mời nhập giá trị trung bình của quạt là 2 ");
        int isSpeed2=scanner.nextInt();
        System.out.println("mời nhập bán kính của quạt là 5 ");
        int isRadius2=scanner.nextInt();
        System.out.println("mời nhập màu của cánh quạt là màu xanh ");
        String isColor2=scanner.next();
        Fan isFan2=new Fan(isSpeed2,isFan.isON(),isRadius,isColor2);
        System.out.println(isFan2);

    }
}