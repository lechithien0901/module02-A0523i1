package ss02_array.exercise;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("mời bạn nhập số lượng số nguyên tố : ");
        int num=scanner.nextInt();
        System.out.print("số lương số nguyên tố bao gồm 2 ;");
        int count=1;
        int x=3;
        while(count<num){
            boolean check=true;
            for (int i = 2; i <x ; i++) {

                if (x%i==0){
                    check=false;
                    break;

                }

            }
            if (check){
                System.out.print(x+" ; ");
                count+=1;
            }
            x+=1;
        }
    }}