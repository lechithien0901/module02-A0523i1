package ss013_search_algorithm.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstringSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi của bạn:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");
        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));

        String longestSubstring; //
        longestSubstring = words[0];

        System.out.println("Chuỗi con có độ dài lớn nhất sau khi sắp xếp: " + longestSubstring);
    }
}