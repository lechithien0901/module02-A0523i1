package ss011_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public boolean isStringPalindrome(String isLength){
        Stack<Character>stack=new Stack<>();
        int countingVariable=isLength.length();
        for (int i = 0; i <countingVariable-1 ; i++) {
           stack.push(isLength.charAt(i));
        }
        for (int i = 0; i <countingVariable-1 ; i++) {
            if (isLength.charAt(i)!=stack.pop()){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập chuỗi cần kiểm tra");
        String checkString=scanner.nextLine();
        Palindrome palindrome=new Palindrome();

        System.out.println(palindrome.isStringPalindrome(checkString));
    }
}
