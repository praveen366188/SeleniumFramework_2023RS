package java_practice.oct3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingAnArray {

    public static void main(String[] args) {

        int[] a={4,3,2,6,1,9,3,0};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        List<Integer> list=Arrays.asList(1, 2, 3);
        list.add(1);
        list.add(2);
        list.remove(1);
    }
}
