package ss011_stack_queue.exercise;

import java.util.Scanner;
import java.util.Stack;

public  class ReverseElement {

    private Stack<Integer>stack=new Stack<>();
    private int[] arrReserve;
   public  int [] ArrReserve(int []elementOfArray){
       arrReserve=new int[elementOfArray.length];
       for (int i = 0; i <arrReserve.length ; i++) {

           arrReserve[i]=elementOfArray[i];
       }
       System.out.println("phần tử trong trước lúc đổi ngược");
       for (int i = 0; i <arrReserve.length ; i++) {
           System.out.println(arrReserve[i]);
       }
       for (int i = 0; i < arrReserve.length; i++) {
           stack.push(arrReserve[i]);

       };
      int []arrNewReserve=new int[arrReserve.length];
       for (int i = 0; i <arrNewReserve.length ; i++) {

arrNewReserve[i]=stack.pop();
       }
       System.out.println("phần tử sau khi đổi ngược");
       for (int i = 0; i < arrNewReserve.length; i++) {
           System.out.println(arrNewReserve[i]);

       }
    return arrNewReserve;
   }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập độ dài của mảng vào đây");
        int arrLen=scanner.nextInt();
        int newArr[]=new int[arrLen];
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("mời bạn nhập phần tử thứ = "+i);
            newArr[i]=scanner.nextInt();
        }
        ReverseElement reverseElement=new ReverseElement();
        reverseElement.ArrReserve(newArr);


    }

}
