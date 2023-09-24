package java_practice.WorkingWithFiles;

import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFIle {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter=new FileWriter("file_work.txt");
        String s="Her name is chomu";
        for (int i = 0; i < s.length(); i++) {

            fileWriter.write(s.charAt(i));
        }
        fileWriter.close();
    }
}
