package ss011_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalBinary {
    Stack<Integer>stack=new Stack<>();
    public void binaryConvert(int numOfBinary){
        int num=numOfBinary;
        int numCount;
        while (num>0){
            numCount=num%2;
            stack.push(numCount);
            num/=2;

        }
        String stringOfBinary="";
     while (!stack.empty()){
         stringOfBinary+=stack.pop();
     }
        System.out.println(stringOfBinary);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" mời bạn nhập số vào đây ");
        int numOfBinary=scanner.nextInt();
        ConvertDecimalBinary convertDecimalBinary=new ConvertDecimalBinary();
        convertDecimalBinary.binaryConvert(numOfBinary);
    }

}
