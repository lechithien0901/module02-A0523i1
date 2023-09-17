package ss019_string.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    private final String regexOfMy="^[CAP]\\d{4}[GHIKLM]$";
    Pattern pattern=Pattern.compile(regexOfMy);
    public boolean checkValidate(String stringOfMe){
        Matcher matcher=pattern.matcher(stringOfMe);
        boolean check= matcher.matches();
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        boolean check=false;
        do {
            System.out.println("mời bạn nhập chuỗi");
            String strOfMe=scanner.nextLine();
            Validate validate=new Validate();
          boolean checkValidate= validate.checkValidate(strOfMe);
           if (checkValidate==true){
               System.out.println("chuỗi hợp lệ "+strOfMe);
               check=true;
           }
           if (checkValidate==false){
               System.out.println("chuỗi không hợp lệ buộc bạn phải nhập lại");
           }
        }while (check==false);





    }

}
