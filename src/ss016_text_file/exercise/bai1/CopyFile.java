package ss016_text_file.exercise.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFile {
    public static int countVariables(String chainOfMe) {
        char[] charsOfMe = chainOfMe.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        int numNodes = 0;
        for (int i = 0; i < charsOfMe.length; i++) {
            arrayList.add(charsOfMe[i]);
            numNodes++;
        }
        return numNodes;
    }

    public String readFileYouNeed(String fileSource) throws IOException, FileNotFoundException {
        File file = new File(fileSource);
FileInputStream fileInputStream=new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String myString = "";
        String myNewString = "";
        while ((myString = bufferedReader.readLine()) != null) {

            myNewString += myString;
        }
        return myNewString;
    }

    public void writeFileYouNeed(String fileNew, String myString) throws IOException, FileNotFoundException {
        BufferedWriter bufferedWriter;
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileNew)) {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
            bufferedWriter.write(myString);
            bufferedWriter.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            final String FILESOURCE = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss016_text_file\\exercise\\bai1\\copyfilesource";
            final String FILENEW = "C:\\Users\\ADMIN\\IdeaProjects\\module02\\src\\ss016_text_file\\exercise\\bai1\\copyfilenew";
            CopyFile copyFile = new CopyFile();
            copyFile.writeFileYouNeed(FILENEW, copyFile.readFileYouNeed(FILESOURCE));
            System.out.println("đây là số lượng kí tự có trong file"
            );
            System.out.println(countVariables(copyFile.readFileYouNeed(FILESOURCE)));
        } catch (FileNotFoundException e) {
            System.out.println("file của bạn không thể tìm thấy");
        } catch (IOException e) {
            System.out.println("file không tồn tại không cho phép truy cập");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}