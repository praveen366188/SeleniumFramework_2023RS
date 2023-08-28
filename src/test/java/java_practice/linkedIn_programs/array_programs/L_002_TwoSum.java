package java_practice.linkedIn_programs.array_programs;

import java.util.ArrayList;
import java.util.List;

public class L_002_TwoSum {

    public static void main(String[] args) {
        int[] arr={3,2,4,5,7,8,6,1,9};
        ArrayList<List<Integer>> l=new ArrayList<>();
        int target=10;
        for (int i = 0; i < arr.length; i++) {
            List<Integer> l1=new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    l1.add(arr[i]);
                    l1.add(arr[j]);
                    l.add(l1);
                }
            }
        }
        System.out.println(l);
    }


}
