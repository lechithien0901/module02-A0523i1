package ss015_exception.exercise;

import ss015_exception.pratice.MyException;

import java.util.Scanner;

public class IllegalTriangleException {
    public void checkTriangle(int a, int b, int c) throws ExceptionOfMy {

        if (a + b < c) {

            throw new ExceptionOfMy("2 cạnh nó không lớn hơn cạnh còn lại nên nó không phải là tam giác");

        }
        if (a + c < b) {

            throw new ExceptionOfMy("2 cạnh nó không lớn hơn cạnh còn lại nên nó không phải là tam giác");
        }
        if (b + c < a) {

            throw new ExceptionOfMy("2 cạnh nó không lớn hơn cạnh còn lại nên nó không phải là tam giác");
        }
        if (a < 0 || b < 0 || c < 0) {

            throw new ExceptionOfMy("cạnh số âm không thỏa mãn mời bạn nhập lại");
        }


    }

    public static void main(String[] args) {
        IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("mời bạn nhập cạnh a");
            int aOfTriangle = scanner.nextInt();
            System.out.println("mời bạn nhập lại cạnh b");
            int bOfTriangle = scanner.nextInt();
            System.out.println("mời bạn nhập canh c");
            int cOfTriangle = scanner.nextInt();

            try {
                illegalTriangleException.checkTriangle(aOfTriangle, bOfTriangle, cOfTriangle);
                check = false;
                System.out.println("Đây chính là tam giác chính xác");
            } catch (ExceptionOfMy e) {
                check = true;
                System.out.println(e.getGetMessageOfMy());
                System.out.println("mời bạn nhập lại 3 cạnh của tam giác");
            }
        }


    }
}
