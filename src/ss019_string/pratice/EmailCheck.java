package ss019_string.pratice;

import javax.management.monitor.StringMonitor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
  private   static  final String str="^[A-Za-z0-9]+[A-Za-z0-9]?@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    Pattern pattern=Pattern.compile(str);
    public boolean checkMail(String email){
        Matcher matcher=pattern.matcher(email);
        boolean check=matcher.matches();
     return check;
    }

    public static void main(String[] args) {
final String[]strings1=new String[]{"nguyenvana@gmail.com","nguyenvanb@gmail.com","nguyenvanc@gmail.com","lechithien0901@gmail"};
final String[]strings2=new String[]{"123asd","ádasdsd"};
EmailCheck emailCheck;
        for (int i = 0; i <strings1.length ; i++) {
            emailCheck=new EmailCheck();
            boolean check= emailCheck.checkMail(strings1[i]);
            System.out.println(check);
        }
        for (int i = 0; i <strings2.length ; i++) {
            emailCheck=new EmailCheck();
            boolean check= emailCheck.checkMail(strings2[i]);
            System.out.println(check);
        }
    }
}
