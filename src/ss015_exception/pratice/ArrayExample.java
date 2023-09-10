package ss015_exception.pratice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatFuntion(){

        Random random=new Random();
        Integer[]integers=new Integer[100];
        for (int i = 0; i < integers.length ; i++) {
            integers[i]= random.nextInt(100);
            System.out.println(integers[i]);
        }
        return integers;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample=new ArrayExample();
        Integer[]integers=arrayExample.creatFuntion();
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập giá trị cần tìm trong mảng");

        try {
            int value=scanner.nextInt();
            System.out.println("vị trí trong mảng là "+value+"giá trị của nó là"+integers[value]);

        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage()+"bạn nhập chỉ số không đúng"
                    );

        }
    }
}
