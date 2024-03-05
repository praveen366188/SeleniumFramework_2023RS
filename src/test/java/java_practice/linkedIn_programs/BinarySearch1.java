package java_practice.linkedIn_programs;

import java.util.Arrays;

public class BinarySearch1 {

    public static void main(String[] args) {
        int[] a = {1, 12, 33, 45, 59, 65, 74, 93};
        Arrays.sort(a);
        int numberToFind = 45;
        int size = a.length;
        int m = size / 2;
        int start = 0;
        int last = size - 1;
        boolean flag = true;

        while (flag && m!=last) {
            if (a[m] == numberToFind) {
                System.out.println("found at position " + m);
                flag = false;
            } else if (a[m] > numberToFind) {
                last = m;
                m = last / 2;
            } else {
                start = m;
                last = size - 1;
                m = (start + last) / 2;
            }
        }


    }
}