package java_practice.WorkingWithFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

    public static void main(String[] args) throws IOException {
    int ch;
        FileReader fileReader=new FileReader("file_work.txt");
        while ((ch=fileReader.read())!=-1){
            System.out.print((char) ch);
        }
        fileReader.close();

    }

}
