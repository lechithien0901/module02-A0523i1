package ss02_array.exercise;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choose;


        do{

            System.out.println("---------------------------");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle  ");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("select the function you want to draw");
            choose=scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Please enter your height");
                    int h=scanner.nextInt();
                    System.out.println("Please enter width");
                    int w=scanner.nextInt();
                    String arr[][]=new String[h][w];

                    for (int i = 0; i <h ; i++) {
                        for (int j = 0; j <w ; j++) {
                            arr[i][j]="*";
                            System.out.print(arr[i][j]);


                        }
                        System.out.println("");

                    }
                    break;
                case 2:
                    System.out.println("enter the side of the triangle");
                    int b=scanner.nextInt();
                    String arr2[][]=new String[b][b];
                    for (int i = 0; i <b ; i++) {
                        for (int j = 0; j <=i ; j++) {
                            arr2[i][j]="*";
                            System.out.print(arr2[i][j]);

                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    System.out.println("Nhập cạnh của hình tam giác 2");
                    h = scanner.nextByte();
                    String[][] triangle2 = new String[h][h];
                    for (int i = 0; i < h; i++) {
                        for (int j = 0; j < h; j++) {
                            if (j < i) triangle2[i][j] = "* ";
                            else triangle2[i][j] = " ";
                            System.out.print(triangle2[i][j]);
                        }
                        System.out.println("");

                    }

            }

        }
        while(choose>=1&&choose<4);

    }
}