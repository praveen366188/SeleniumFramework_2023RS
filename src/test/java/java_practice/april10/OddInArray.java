package java_practice.april10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};
        List<Integer> lst = Arrays.asList(1,2,3,4,5,6,7,8);
        lst.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));

    }
}
