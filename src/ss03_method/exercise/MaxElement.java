package ss03_method.exercise;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời nhập số lượng của hàng");
        int isRow=scanner.nextInt();
        System.out.println("mời nhập số lượng của cột");
        int isCol=scanner.nextInt();
        int [][]isArr=new int[isRow][isCol];
        for (int i = 0; i < isArr.length ; i++) {
            for (int j = 0; j <isArr[i].length ; j++) {
                System.out.println("mời nhập phần tử của hàng thứ : "+(i+1) +" và cột thứ : "+(j+1));
                isArr[i][j]=scanner.nextInt();

            }

        }
        for (int i = 0; i <isArr.length ; i++) {

            for (int j = 0; j <isArr[i].length ; j++) {
                System.out.print(isArr[i][j]+"\t");


            }
            System.out.println("");

        }
        int isMax=isArr[0][0];
        int isNum=0;
        int isNum1=0;
        for (int i = 0; i < isArr.length ; i++) {
            for (int j = 1; j <isArr[i].length ; j++) {
                if (isMax<isArr[i][j]){
                    isMax=isArr[i][j];
                    isNum=i;
                    isNum1=j;
                }

            }

        }
        System.out.println("vậy giá trị lớn nhất trong mảng là "+isMax);
        System.out.println("Giá trị lớn nhất nằm ở hàng : "+(isNum+1)+" cột thứ : "+(isNum1+1));

    }
}