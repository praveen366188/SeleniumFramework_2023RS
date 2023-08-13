package java_practice.comparator_and_comparable.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C_Demo1 {


    public static void main(String[] args) {
//        ArrayList<Integer> arrayList=new ArrayList<>();
//        arrayList.add(99);
//        arrayList.add(55);
//        arrayList.add(87);
//        arrayList.add(37);
//        arrayList.add(43);
//        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);

        List<Laptop> laptops=new ArrayList<>();
        laptops.add(new Laptop("hp",4,30000));
        laptops.add(new Laptop("think_pad",16,38000));
        laptops.add(new Laptop("mac_m1",32,55000));
        laptops.add(new Laptop("mi",8,25000));
//        System.out.println(laptops);

        Collections.sort(laptops);
        for (Laptop l:laptops
             ) {
            System.out.println(l);
        }
    }


}
