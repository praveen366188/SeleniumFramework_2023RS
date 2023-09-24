package java_practice.WorkingWithFiles;

import java.io.File;
import java.io.IOException;

public class FileCreation
{

    public static void main(String[] args) throws IOException {
        File f=new File("file_work.txt");
        if(f.createNewFile()){
            System.out.println("created new file");
        }
        else
        {
            System.out.println("file already exist"+f.getName());
//            f.delete();

        }

    }
}
