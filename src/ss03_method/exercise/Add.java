package ss03_method.exercise;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số lượng phần tử : ");
        int num=scanner.nextInt();
        int[] arr=new int[num];
        int [] arr1=new int[num+1];
        System.out.println("nhập giá trị của mảng vào đây");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("nhập giá trị phần tử thứ : "+ i);
            arr[i]=scanner.nextInt();


        }
        System.out.println("phần tử có trong mảng là");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("mời bạn nhập vị trí bạn muốn thêm vào đây : ");
        int b=scanner.nextInt();
        System.out.print("mời bạn nhập giá trị của chúng : ");
        int so=scanner.nextInt();

        for (int i = 0; i <arr1.length ; i++) {
            if (i<b){
                arr1[i]=arr[i];

            }
            else if (i==b){
                arr1[i]=so;
            }
            else {
                arr1[i]=arr[i-1];
            }

        }
        for (int c:arr1
        ) {
            System.out.println(c);

        }


    }
}