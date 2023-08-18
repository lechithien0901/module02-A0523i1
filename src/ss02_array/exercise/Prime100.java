package ss02_array.exercise;

import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("số nguyên tố dưới 100 : ");


        String str="2,";
        for (int i = 3; i <100 ; i++) {
            boolean check=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    check=false;
                    break;
                }


            }
            if (check){
                str+=i+" , ";
            }

        }
        System.out.println("các số nguyên tố nhỏ hơn một trăm là  " + str);
    }
}