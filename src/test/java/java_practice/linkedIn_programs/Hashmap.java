package java_practice.linkedIn_programs;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

    //can constructor call functions?
    public Hashmap(){
        m1();
    }
    public void m1(){
        System.out.println("the m1 function..");
    }


    public static void main(String[] args) {


        Hashmap hashmap=new Hashmap();
        Map<String, Integer> scores = new HashMap<>();

        scores.put("David", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Lisa", 78);
        scores.put("Dino", 65);
        System.out.println(scores.entrySet());
        System.out.println(scores.values().getClass().getSimpleName());
        String s3 = "JournalDev";
        int start = 1;
        char end = 6;

        System.out.println(s3.substring(start, end));


    }
}
