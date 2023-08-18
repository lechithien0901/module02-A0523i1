package ss03_method.exercise;

import java.util.Scanner;

public class TotalDiagonal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời nhập số lượng của hàng : ");
        int isRow=scanner.nextInt();
        System.out.println("mời nhập số lượng của cột : ");
        int isCol=scanner.nextInt();
        int [][]isArr=new int[isRow][isCol];
        for (int i = 0; i < isArr.length ; i++) {
            for (int j = 0; j < isArr[i].length; j++) {
                System.out.println("mời nhập giá trị hàng thứ : "+(i+1)+" và cột thứ : "+(j+1));
                isArr[i][j]=scanner.nextInt();

            }

        }
        for (int i = 0; i <isArr.length ; i++) {
            for (int j = 0; j < isArr[i].length; j++) {
                System.out.print(isArr[i][j]+"\t");

            }
            System.out.println("");

        }
        int isTotal=0;
        for (int i = 0; i <isArr.length ; i++) {
            for (int j = 0; j <isArr[i].length ; j++) {
                if (i==j){
                    isTotal+=isArr[i][j];
                }

            }

        }
        System.out.println("tổng các số ở đường chéo chính : "+isTotal);
    }
}