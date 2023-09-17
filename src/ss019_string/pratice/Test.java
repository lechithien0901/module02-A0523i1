package ss019_string.pratice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String test="Hello,java 2-12-2018";
        Pattern pattern=Pattern.compile("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}");
        Matcher matcher= pattern.matcher(test);
        boolean match=matcher.matches();
        System.out.println(match);
        while(matcher.find()){
            System.out.println(test.substring(matcher.start(),matcher.end()));
        }
        String test1="2-12-2004";
        String test2="2-12-200a";
        System.out.println(pattern.matcher(test1).matches());
        System.out.println(pattern.matcher(test2).matches());
        String test4=test.replaceAll(test,test2);
        System.out.println(test4);
        String test6="apple,banana,le";
        String[]strings=test6.split(",",2);
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }
        String str="Welcome to gpcoder";
String regex=".*r$";
Pattern pattern1=Pattern.compile(regex);
Matcher matcher1=pattern1.matcher(str);
boolean matchh=matcher1.matches();
        System.out.println(matchh);
        String str1=String.join("?","le","thien");
        System.out.println(str1);
        //nối chuỗi
        String str3="nguyen van a";
        str3=str3.concat(str1);
        System.out.println(str3);
        //thay kí tự vào chuỗi
        String str4="nguyen van a";
       String str5=str4.replace("a","b");
        System.out.println(str5);
        //so sánh không phân biệt chữ hoa hay thường;
        String ad="nguyen van A";
        String ads="nguyen van a";
        boolean check=ads.equalsIgnoreCase(ad);
        System.out.println(check);
        String sd="        d     ";
        String std=sd.trim();
        System.out.println(std+"thien");
        //chuyển đôi kiểu dữ liệu
        int c=30;
        String tf=String.valueOf(c);
        System.out.println(tf+100);
    }


}
