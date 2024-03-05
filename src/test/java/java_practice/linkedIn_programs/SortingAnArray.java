package java_practice.linkedIn_programs;

import java.util.Arrays;

public class SortingAnArray {
    public static void main(String[] args) {
        int[] a = {11, 2, 1, 4, 51, 6, 17};
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));


    }
}
