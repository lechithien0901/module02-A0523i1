package ss019_string.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String regexOfMe="^(\\d{2})+-+(0\\d{9})$";
    Pattern pattern=Pattern.compile(regexOfMe);
    public boolean checkPhone(String stringOfMe){
        Matcher matcher=pattern.matcher(stringOfMe);
        boolean check=matcher.matches();
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean check=false;
        do {
            System.out.println("mời bạn nhập số điện thoại");
            String str=scanner.nextLine();
            ValidatePhone validatePhone=new ValidatePhone();
            boolean checkPhone= validatePhone.checkPhone(str);
            if (checkPhone==true){
                System.out.println("số điện thoại chính xác " +str);
                check=true;
            }
            if (checkPhone==false){
                System.out.println("bạn buột phải nhập lại chuỗi vì số điện thoại này không thỏa mãn"+str);
            }

        }while (check==false);
    }

}
