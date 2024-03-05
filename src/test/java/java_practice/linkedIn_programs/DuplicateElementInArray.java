package java_practice.linkedIn_programs;

import io.cucumber.java.sl.In;

import java.util.*;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,2,4,5,6,7,2,2,4,5,7,8,7};
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if((arr[i]==arr[j])&&(i!=j))
                    count=count+1;
            }
            map.put(arr[i],count);

        }
        List<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
                    if(entry.getValue()>0)
                        list.add(entry.getKey());
        }
        System.out.println(list);


    }


}
