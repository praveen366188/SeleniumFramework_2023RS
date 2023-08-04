package Java_Practicr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
//        List<Integer> l2 = Arrays.asList(new Integer[4]);
        List<Integer> l2 = l;
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(5);
        System.out.println(l);
        int count = 0;
        System.out.println(l.get(1));
        for (int i = 3; i >= 0; i--) {
            int temp = l.get(i);
            l2.set(count,temp);
            count++;
        }
        System.out.println("List after revers" + l2);
    }
}
