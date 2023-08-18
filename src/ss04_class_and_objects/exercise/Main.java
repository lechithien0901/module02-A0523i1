package ss04_class_and_objects.exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("mời nhập số a");
        double isA=scanner.nextInt();
        System.out.println("mời nhập số b");
        double isB=scanner.nextInt();
        System.out.println("mời nhập số c");
        double isC=scanner.nextInt();
        QuadraticEquation quadraticEquation=new QuadraticEquation(isA,isB,isC);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println(quadraticEquation.getRoot()+"và"+quadraticEquation.getRoot2());
        }
        else if (quadraticEquation.getDiscriminant()==0){
            System.out.println(quadraticEquation.getRoot3());
        }
        else {
            System.out.println("phương trình vô nghiệm");
        }


    }
}