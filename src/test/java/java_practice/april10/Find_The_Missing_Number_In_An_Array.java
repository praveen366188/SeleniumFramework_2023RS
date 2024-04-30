package java_practice.april10;

import java.util.*;

public class Find_The_Missing_Number_In_An_Array {
    public static void main(String[] args) {
        Integer[] arr = {0, 1, 2, 3, 4, 5, 6, 8, 9, 10};
        Set<Integer> set=new HashSet<>(Arrays.asList(arr));
        for(int i=0;i<=arr.length;i++){
            if(!set.contains(i)){
                System.out.println(i+" is missing");
            }}
    }
}
