package java_practice.linkedIn_programs.array_programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class L_004_Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        int[] arr={10, 3, 5, 6, 2};

        Set<Integer> a= new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int m=1;
            for (int j =0; j < arr.length; j++) {
                if(!(i==j))
                    m=m*arr[j];
            }
            a.add(m);
        }
        System.out.println(a);



    }
}
