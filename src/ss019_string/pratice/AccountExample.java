package ss019_string.pratice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    Scanner scanner=new Scanner(System.in);
    private static final String regex="^[_a-z0-9]{6,}$";
    Pattern pattern =Pattern.compile(regex);
    public boolean checkAccount(String account){
        Matcher matcher= pattern.matcher(account);
        boolean check=matcher.matches();
        return check;
    }

    public static void main(String[] args) {
        final String []str1=new String[]{"_abc123","______"};
        final String[]strings=new String[]{"@.123","123+"};
        AccountExample accountExample;
        for (String str:str1
             ) {
            accountExample=new AccountExample();
            boolean check=accountExample.checkAccount(str);
            System.out.println(check);
        }
        for (String str:strings
        ) {
            accountExample=new AccountExample();
            boolean check=accountExample.checkAccount(str);
            System.out.println(check);
        }
    }
}
