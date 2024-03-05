package java_practice.linkedIn_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoArraysEqual {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5, 6, 8, 4, 5, 6};
        Integer[] brr = {1, 3, 5, 6, 8, 4, 5, 6};
        Set<Integer> set_1=new HashSet<>(Arrays.asList(arr));
        Set<Integer> set_2=new HashSet<>(Arrays.asList(brr));
        if(!(set_1.size()==set_2.size())){
            System.out.println("not equal");
        }
        for (Integer s:set_1) {
            if(!set_2.contains(s)){
                System.out.println("not equal");
                break;
            }
        }
    }
}
