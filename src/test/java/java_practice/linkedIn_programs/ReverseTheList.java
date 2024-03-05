package java_practice.linkedIn_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheList {
    public static void main(String[] args) {
        List l= Arrays.asList(1,2,3,4,5,6,7);
        Collections.reverse(l);
        System.out.println(l);
    }
}
