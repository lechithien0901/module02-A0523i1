package ss03_method.exercise;

import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập số lượng hàng : ");
        int isRow=scanner.nextInt();
        System.out.println("mời bạn nhập số lượng cột : ");
        int isCol=scanner.nextInt();
        int[][] isArr=new int[isRow][isCol];
        for (int i = 0; i <isArr.length ; i++) {
            for (int j = 0; j <isArr[i].length ; j++) {
                System.out.println("mời bạn nhập phần tử hàng thứ : "+(i+1)+"và cột thứ : "+(j+1));
                isArr[i][j]=scanner.nextInt();



            }

        }
        for (int i = 0; i <isArr.length ; i++) {
            for (int j = 0; j <isArr[i].length ; j++) {
                System.out.print(isArr[i][j]+"\t");

            }
            System.out.println("");

        }
        int isMin=isArr[0][0];
        int isNum=0;
        int isSo=0;
        for (int i = 0; i < isArr.length; i++) {
            for (int j = 1; j < isArr[i].length; j++) {
                if (isMin>isArr[i][j]){
                    isMin=isArr[i][j];
                    isNum=i;
                    isSo=j;
                }

            }

        }
        System.out.println("giá trị nhỏ nhất của mảng là : "+isMin);
        System.out.println("Giá trị nhỏ nhất của nó nằm ở hàng thứ : "+isNum+" và nằm ở cột thứ : "+isSo);
    }
}