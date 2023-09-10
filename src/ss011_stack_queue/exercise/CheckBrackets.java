package ss011_stack_queue.exercise;

import ss03_method.pratice.Char;

import java.util.Scanner;
import java.util.Stack;

public class CheckBrackets {

    public boolean isCheckBrakets(String stringNeedCheck) {
        char charOfCheckBrakets[]=stringNeedCheck.toCharArray();
        Stack<Character> bStack = new Stack<>();
        for (char sym:charOfCheckBrakets){
            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            }else if (sym==')'||sym=='}'||sym==']'){

                if (bStack.isEmpty()){
                    return false;
                }
                char left=bStack.pop();
                if (sym==')'&&left!='('){
                    return false;
                }
                if (sym=='}'&&left!='{'){
                    return false;
                }
                if (sym==']'&&left!='['){
                    return false;
                }
            }



        }
        return true;


}

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập chuỗi cần thêm");
        String stringNeedCheck=scanner.nextLine();
        CheckBrackets checkBrackets=new CheckBrackets();
        System.out.println(        checkBrackets.isCheckBrakets(stringNeedCheck)
        );
        if (checkBrackets.isCheckBrakets(stringNeedCheck)){
            System.out.println("phép tính hoàn toàn đúng");
        }
        else if (!checkBrackets.isCheckBrakets(stringNeedCheck)){
            System.out.println("phép tính bạn đã cho nhầm dấu");
        }
    }
}
