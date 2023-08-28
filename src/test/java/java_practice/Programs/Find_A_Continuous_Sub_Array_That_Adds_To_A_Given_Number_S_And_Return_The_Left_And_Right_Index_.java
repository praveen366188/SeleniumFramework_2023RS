package java_practice.Programs;

import java.util.ArrayList;

public class Find_A_Continuous_Sub_Array_That_Adds_To_A_Given_Number_S_And_Return_The_Left_And_Right_Index_ {
    /*Given an unsorted array A of size N that contains only positive integers, find a continuous sub-array that adds to a given number S and return the left and right index(1-based indexing) of that subarray.

    In case of multiple subarrays, return the subarray indexes which come first on moving from left to right.*/
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> a = new ArrayList<>();
        int m = 0, flag = 1;
        outerloop:
        for (int i = 0; i < n; i++) {
            m = 0;
            for (int j = i; j < n; j++) {

                m = m + arr[j];
                if (m == s) {
                    flag = 0;
                    a.add(i + 1);
                    a.add(j + 1);
                    break outerloop;
                }
            }
        }
        if (flag == 1) {
            a.add(-1);
        }
        return a;
    }
}



