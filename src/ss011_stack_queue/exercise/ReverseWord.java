package ss011_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWord {
    private Stack<Character>stack=new Stack<>();
    private  char[]arrReserve;
    public String arrOfReserve(String charOfArray){
        for (int i = 0; i <charOfArray.length() ; i++) {
stack.push(charOfArray.charAt(i));
        }
        System.out.println("kí tự trước khi đổi ngược");
        for (int i = 0; i <charOfArray.length(); i++) {
            System.out.println(charOfArray.charAt(i));
        }
        String wWord="";
        for (int i = 0; charOfArray.length() > i; i++) {
            wWord+=stack.pop();
        }
        System.out.println(" kí tự sau khi đổi ngược ");
        System.out.println(wWord+"\t");
        return wWord;


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập chuỗi muốn thay đổi vào đây");
        String wWord=scanner.nextLine();
        ReverseWord reverseWord=new ReverseWord();
        reverseWord.arrOfReserve(wWord);
    }
}
