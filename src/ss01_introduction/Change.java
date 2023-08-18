package ss01_introduction;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        float usd;
        float vnd=23000;
        System.out.println("Enter the USD:");
        usd=value.nextFloat();
        float change=usd*vnd;
        System.out.println("sau khi quy doi:"+change);
    }
}
