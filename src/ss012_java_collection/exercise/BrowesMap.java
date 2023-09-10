package ss012_java_collection.exercise;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BrowesMap {
    public void elementMap(String strElement) {
        char documentElement[] = strElement.toCharArray();
        Map<Character, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < documentElement.length; i++) {
            if (integerMap.containsKey(documentElement[i])) {
                System.out.println("phần tử đã có trước đó rồi");
                int count=integerMap.get(documentElement[i]);
                integerMap.put(documentElement[i],count+1);


            } else {
                System.out.println("phần tử mới được thêm vào");
                integerMap.put(documentElement[i],1);


            }


        }
        for (Map.Entry<Character, Integer> entry:integerMap.entrySet()){
            Character key=entry.getKey();
Integer value= entry.getValue();
            System.out.println("Khóa: " + key + ", Giá trị: " + value);


        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập chuỗi vào đây");
        String strNeedBrowes=scanner.nextLine();
        BrowesMap browesMap = new BrowesMap();
        browesMap.elementMap(strNeedBrowes);

    }
}
