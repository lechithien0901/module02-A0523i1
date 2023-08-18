package ss03_method.exercise;

import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhập số lượng của mảng ");
        int num=scanner.nextInt();
        int arr[]=new int[num];
        System.out.println("nhập giá trị tại mỗi index");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("nhập giá trị tại index thứ " + (i));
            arr[i]=scanner.nextInt();

        }
        System.out.println("mảng bạn vừa nhập là");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);

        }
        System.out.println("nhập vị trí index bạn muốn xóa");
        int x= scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (i==x) {
                while (i < arr.length-1) {
                    arr[i] = arr[i + 1];
                    i++;
                }
                arr[arr.length - 1] = 0;
                break;

            }

        }

        System.out.println("mang ban vừa xóa giá trị x là"+x);
        for (int arr1:arr
        ) {
            System.out.print(arr1+"\t");
        }

    }

}