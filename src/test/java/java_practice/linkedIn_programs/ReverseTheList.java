package java_practice.linkedIn_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseTheList {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(l);
        List<Integer> rev=new ArrayList<>();
//        Collections.reverse(l);
//        System.out.println(l);
        for (int i = l.size()-1; i >=0; i--) {
            rev.add(l.get(i));
        }
        System.out.println(rev);
    }
}
