package java_practice.linkedIn_programs;

import java.util.Arrays;
import java.util.List;

public class VerifyListContainsOddNumber {


    public static void main(String[] args) {

        List<Integer> l= Arrays.asList(1,2,3,4,5,6);
        l.stream().filter(s->s%2!=0).forEach(s-> System.out.println(s));


    }
}
