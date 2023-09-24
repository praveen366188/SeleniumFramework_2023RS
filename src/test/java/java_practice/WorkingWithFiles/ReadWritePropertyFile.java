package java_practice.WorkingWithFiles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertyFile {


    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\SeleniumFrameword\\src\\main\\resources\\configuration\\config_practice.properties");
        Properties properties=new Properties();
        properties.load(fileInputStream);
        //Reading property file
        System.out.println(properties.getProperty("browser"));
        //Writing property file
        properties.setProperty("name1","praveenkumar");
        properties.setProperty("name2","tejal ughade");
        properties.put("name3","praveenkumar ughade");
//        updating the file
        properties.setProperty("browser","ff");
        FileWriter fileWriter=new FileWriter("C:\\Users\\Admin\\IdeaProjects\\SeleniumFrameword\\src\\main\\resources\\configuration\\config_practice.properties");
        properties.store(fileWriter,"adding values to prop file");

    }
}
