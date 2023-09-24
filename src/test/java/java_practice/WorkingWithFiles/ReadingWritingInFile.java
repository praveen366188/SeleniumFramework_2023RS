package java_practice.WorkingWithFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingWritingInFile {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("extent_index.html");
        FileWriter fileWriter=new FileWriter("file_work.txt");
        int ch;
        while ((ch=fileReader.read())!=-1){
            fileWriter.write((char)ch);

        }


    }
}
