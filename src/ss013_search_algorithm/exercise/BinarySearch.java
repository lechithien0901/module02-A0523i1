package ss013_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập độ dài của mảng:");
        int sizeOfArray = scanner.nextInt();
        int[] arrayOfMe = new int[sizeOfArray];
        for (int i = 0; i < arrayOfMe.length; i++) {
            System.out.println("Mời bạn nhập giá trị tại vị trí thứ " + i + ":");
            arrayOfMe[i] = scanner.nextInt();
        }
     Arrays.sort(arrayOfMe);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arrayOfMe));

        System.out.println("Mời bạn nhập giá trị cần tìm trong mảng:");
        int valueToFind = scanner.nextInt();

        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(arrayOfMe, 0, arrayOfMe.length - 1, valueToFind);

        if (result != -1) {
            System.out.println("Giá trị đã được tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Giá trị không tìm thấy trong mảng.");
        }
    }

    public int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                return binarySearch(array, left, mid - 1, value);
            } else {
                return binarySearch(array, mid + 1, right, value);
            }
        }
        return -1;
    }
}