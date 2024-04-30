package java_practice.april10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,3,2,4,5,6,7,2,2,4,5,7,8,7};
        int count;
       Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            count=1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j] && i!=j)
                {
                    count=count+1;
                }
                    map.put(arr[i],count);
            }
        }
        System.out.println(map);



    }


}
