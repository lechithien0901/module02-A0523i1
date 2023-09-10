package ss014_sort.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class settingSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn độ dài của mảng");
        int sizeOfArray= scanner.nextInt();
        int []arrayOfMe=new int[sizeOfArray];
        for (int i = 0; i <arrayOfMe.length ; i++) {
            System.out.println("mời bạn nhập mảng tại ví trí "+i);
            arrayOfMe[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(isArrayOfMe(arrayOfMe)));
    }
    public static int[] isArrayOfMe(int []array){
        for (int i = 0; i <array.length ; i++) {
            int indexOfArray=i;
            int valueOfArray=array[i];
            while (indexOfArray>0&&valueOfArray<array[indexOfArray-1]){
                array[indexOfArray]=array[indexOfArray-1];
                indexOfArray--;
            }
            array[indexOfArray]=valueOfArray;
        }
        return array;
    }
}
