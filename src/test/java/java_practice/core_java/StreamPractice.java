package java_practice.core_java;

import java.util.Arrays;
import java.util.List;

public class StreamPractice {


    public static void main(String[] args) {


        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(values.stream().count());
        values.stream().forEach(System.out::println);
        values.stream().filter(s->s>4).forEach(s-> System.out.println(s));
Arrays.asList(1,4,6,7);
    }
}
