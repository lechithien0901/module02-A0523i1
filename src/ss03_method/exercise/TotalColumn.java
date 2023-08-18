package ss03_method.exercise;
import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập số lượng của hàng : ");
        int isRow=scanner.nextInt();
        System.out.println("mời bạn nhập số lượng của cột : ");
        int isCol=scanner.nextInt();
        int[][] isArr=new int[isRow][isCol];
        for (int i = 0; i < isArr.length ; i++) {
            for (int j = 0; j <isArr[i].length ; j++) {
                System.out.println("mời bạn nhập giá trị của hàng thứ : "+(i+1)+"và cột thứ : "+(j+1));
                isArr[i][j]=scanner.nextInt();

            }

        }
        System.out.println("mảng bạn vừa nhập là : ");
        for (int i = 0; i <isArr.length ; i++) {
            for (int j = 0; j <isArr[i].length ; j++) {
                System.out.print(isArr[i][j]+"\t");

            }
            System.out.println("");

        }

        int isColumnTotal;
        do {
            System.out.println("mời nhập số cột bạn muốn tính tổng vào đây : ");
            isColumnTotal=scanner.nextInt();
        } while (isColumnTotal>=2&&isColumnTotal<=0);
        int isSum=0;
        for (int i = 0; i < isArr.length; i++) {
            for (int j = 0; j < isArr[i].length; j++) {
                if (j==isColumnTotal){
                    isSum+=isArr[i][isColumnTotal];


                }

            }

        }
        System.out.println();
        System.out.println(isSum
        );
    }
}