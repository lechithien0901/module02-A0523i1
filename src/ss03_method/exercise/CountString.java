package ss03_method.exercise;

import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập kí tự của bạn vào đây");
        String str=scanner.nextLine();
        char isCharacters=str.charAt(0);
        int isNum=str.length();
        int count=0;
        for (int i = 0; i <isNum ; i++) {
            if (isCharacters==str.charAt(i)){
                count++;
            }

        }
        System.out.println(count);
    }
}