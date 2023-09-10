package ss014_sort.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class illustrationSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập độ dài của mảng");
        int sizeOfArray=scanner.nextInt();
        int arrOfMe[]=new int[sizeOfArray];
        for (int i = 0; i <arrOfMe.length ; i++) {
            System.out.println("nhập giá trị tại "+i);
            arrOfMe[i]=scanner.nextInt();
        }
        for (int i = 0; i <arrOfMe.length ; i++) {
            int indexOfArray=i;
            int valueOfArray=arrOfMe[i];
            while (indexOfArray>0&&valueOfArray<arrOfMe[indexOfArray-1]){
                arrOfMe[indexOfArray]=arrOfMe[indexOfArray-1];
                indexOfArray--;

            }

            arrOfMe[indexOfArray]=valueOfArray;
            System.out.println(Arrays.toString(arrOfMe));

        }
    }
}
