package java_practice.linkedIn_programs.array_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class L_001_Find_The_Missing_Number_In_An_Array {


    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,8,9,10};
        Set<Integer> s=new LinkedHashSet<>();
        for(int a:arr)
            s.add(a);
        int i=0;
        for (int a:s) {
            if (i==a)
                i++;
            else
                System.out.println(i);
        }

    }

}
