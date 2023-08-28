package java_practice.linkedIn_programs.array_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class L_001_Find_The_Missing_Number_In_An_Array2 {

    public static void findMissing(int[] arr, int N)
    {
        int i;
        int[] temp = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 7, 5, 6, 2 };
        int n = arr.length;

        // Function call
        findMissing(arr, n);
        }

    }


