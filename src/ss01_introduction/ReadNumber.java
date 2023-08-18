package ss01_introduction;

import java.util.Scanner;

public class ReadNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number you Want Read");
        int num=Integer.parseInt(scanner.nextLine());
        String str="";
        if (num>=1000) System.out.println("out of ability");
        else if(num>=100){
            switch (num/100){
                case 1:
                    str+="one hundred";
                    break;
                case 2:
                    str+="two hundred";
                    break;
                case 3:
                    str+="three hundred";
                    break;
                case 4:
                    str+="four hundred";
                    break;
                case 5:
                    str+="five hundred";
                    break;
                case 6:
                    str+="six hundred";
                    break;
                case 7:
                    str+="seven hundred";
                    break;
                case 8:
                    str+="eight hundred";
                    break;
                case 9:
                    str+="nine hundred";

            }
            if ((num%100)>=20){
                switch ((num%100)/10){
                    case 2:
                        str+=" and twenty";
                        break;
                    case 3:
                        str+="and thirty";
                        break;
                    case 4:
                        str+="and forty";
                        break;
                    case 5:
                        str+="and fifty";
                        break;
                    case 6:
                        str+="and sixty";
                        break;
                    case 7:
                        str+="and seventy";
                        break;
                    case 8:
                        str+="and eighty";
                        break;
                    case 9:
                        str+="and ninety";
                        break;
                }

                switch ((num%100)%10){
                    case 0:
                        break;
                    case 1:
                        str+="one";
                        break;
                    case 2:
                        str+="two";
                        break;
                    case 3:
                        str+="three";
                        break;
                    case 4:
                        str+="four";
                        break;
                    case 5:
                        str+="five";
                        break;
                    case 6:
                        str+="six";
                        break;
                    case 7:
                        str+="seven";
                        break;
                    case 8:
                        str+="eight";
                        break;
                    case 9:
                        str+="nine";
                        break;

                }

            }if ((num%100)<20&&(num%100)>=10){
                switch (num%100){
                    case 10:
                        str+="ten";
                        break;
                    case 11:
                        str+="eleven";
                        break;
                    case 12:
                        str+="twelve";
                        break;
                    case 13:
                        str+="thirteen";
                        break;
                    case 14:
                        str+="fourteen";
                        break;
                    case 15:
                        str+="fifteen";
                        break;
                    case 16:
                        str+="sixteen";
                        break;
                    case 17:
                        str+="seventeen";
                        break;
                    case 18:
                        str+="eighteen";
                        break;
                    case 19:
                        str+="nineteen";
                        break;
                } switch ((num % 100) % 10) {
                    case 0:
                        break;
                    case 1:
                        str += " one";
                        break;
                    case 2:
                        str += " two";
                        break;
                    case 3:
                        str += " three";
                        break;
                    case 4:
                        str += " four";
                        break;
                    case 5:
                        str += " five";
                        break;
                    case 6:
                        str += " six";
                        break;
                    case 7:
                        str += " seven";
                        break;
                    case 8:
                        str += " eight";
                        break;
                    case 9:
                        str += " nine";
                        break;
                }
            }  else if ((num % 100) >= 10 && (num % 100) < 20) {
                switch (num % 100) {
                    case 10:
                        str += " and ten";
                        break;
                    case 11:
                        str += " and eleven";
                        break;
                    case 12:
                        str += " and twelve";
                        break;
                    case 13:
                        str += " and thirteen";
                        break;
                    case 14:
                        str += " and fourteen";
                        break;
                    case 15:
                        str += " and fifteen";
                        break;
                    case 16:
                        str += " and sixteen";
                        break;
                    case 17:
                        str += " and seventeen";
                        break;
                    case 18:
                        str += " and eighteen";
                        break;
                    case 19:
                        str += " and nineteen";
                        break;
                }
            } else if ((num % 100) < 10) {
                switch (num % 100) {
                    case 0:
                        break;
                    case 1:
                        str += " and one";
                        break;
                    case 2:
                        str += " and two";
                        break;
                    case 3:
                        str += " and three";
                        break;
                    case 4:
                        str += " and four";
                        break;
                    case 5:
                        str += " and five";
                        break;
                    case 6:
                        str += " and six";
                        break;
                    case 7:
                        str += " and seven";
                        break;
                    case 8:
                        str += " and eight";
                        break;
                    case 9:
                        str += " and nine";
                        break;
                }
            }
        } else if (num < 100) {
            if (num >= 20) {
                switch (num / 10) {
                    case 2:
                        str += "twenty";
                        break;
                    case 3:
                        str += "thirty";
                        break;
                    case 4:
                        str += "forty";
                        break;
                    case 5:
                        str += "fifty";
                        break;
                    case 6:
                        str += "sixty";
                        break;
                    case 7:
                        str += "seventy";
                        break;
                    case 8:
                        str += "eighty";
                        break;
                    case 9:
                        str += "ninety";
                        break;
                }
                switch (num % 10) {
                    case 0:
                        break;
                    case 1:
                        str += " one";
                        break;
                    case 2:
                        str += " two";
                        break;
                    case 3:
                        str += " three";
                        break;
                    case 4:
                        str += " four";
                        break;
                    case 5:
                        str += " five";
                        break;
                    case 6:
                        str += " six";
                        break;
                    case 7:
                        str += " seven";
                        break;
                    case 8:
                        str += " eight";
                        break;
                    case 9:
                        str += " nine";
                        break;
                }
            } else if (num >= 10) {
                switch (num) {
                    case 10:
                        str += "ten";
                        break;
                    case 11:
                        str += "eleven";
                        break;
                    case 12:
                        str += "twelve";
                        break;
                    case 13:
                        str += "thirteen";
                        break;
                    case 14:
                        str += "fourteen";
                        break;
                    case 15:
                        str += "fifteen";
                        break;
                    case 16:
                        str += "sixteen";
                        break;
                    case 17:
                        str += "seventeen";
                        break;
                    case 18:
                        str += "eighteen";
                        break;
                    case 19:
                        str += "nineteen";
                        break;
                }
            } else if (num < 10 && num >= 0) {
                switch (num) {
                    case 0:
                        str += "zero";
                        break;
                    case 1:
                        str += "one";
                        break;
                    case 2:
                        str += "two";
                        break;
                    case 3:
                        str += "three";
                        break;
                    case 4:
                        str += "four";
                        break;
                    case 5:
                        str += "five";
                        break;
                    case 6:
                        str += "six";
                        break;
                    case 7:
                        str += "seven";
                        break;
                    case 8:
                        str += "eight";
                        break;
                    case 9:
                        str += "nine";
                        break;
                }
            } else System.out.println("out of ability");
        }
        System.out.println(str);
    }
}