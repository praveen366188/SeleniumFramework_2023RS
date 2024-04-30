package java_practice.linkedIn_programs;

import io.cucumber.java.sl.In;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListIsOdd {

    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,5,3,9);
        System.out.println(l.stream().anyMatch(x->x%2==0));
    }
}
