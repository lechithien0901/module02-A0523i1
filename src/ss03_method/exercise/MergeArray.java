package ss03_method.exercise;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời nhập số lượng phần tử của mảng thứ nhất 1 : ");
        int a=scanner.nextInt();
        System.out.println("mời nhập số lương phần tử của mảng thứ 2 : ");
        int b=scanner.nextInt();
        int arr1[]=new int[a];
        int arr2[]=new int[b];
        System.out.println("mời nhập từng giá trị của mảng thứ nhất  ");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("mời nhập giá trị phần tử thứ :  "+i);
            arr1[i]=scanner.nextInt();

        }
        System.out.println("mời nhập từng giá trị của mảng thứ hai  ");
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println("mời nhập giá trị phần tử thứ : "+i);
            arr2[i]=scanner.nextInt();
        }
        int arr3[]=new int[a+b];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];

        }
        int d=arr2.length;
        int x=0;
        for (int i = d; i < arr3.length ; i++) {
            arr3[i]=arr2[x];
            x++;

        }
        for (int c:arr3
        ) {
            System.out.println(c);

        }

    }
}