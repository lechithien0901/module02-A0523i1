package ss013_search_algorithm.exercise;

import org.jetbrains.annotations.NotNull;
import ss012_java_collection.exercise.BrowesMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortInAscendingOrder {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Character>arrayList=new ArrayList<>();
        System.out.println("mời bạn nhập  chuỗi vào đây");
         String stringOfMy=scanner.nextLine();
         char[] charOfMy=stringOfMy.toCharArray();
        for (int i = 0; i <charOfMy.length ; i++) {
            arrayList.add(charOfMy[i]);

        }
        Comparator<Character>comparator=new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(arrayList);
        System.out.println("danh sách đã được sắp xếp");
        System.out.println(arrayList);

    }
}
