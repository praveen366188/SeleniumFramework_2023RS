package java_practice.cc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Laptop> laptops=new ArrayList<>();

        Laptop l=new Laptop(8,2222,"lap1");
        Laptop l1=new Laptop(6,4444,"lap1");
        Laptop l2=new Laptop(1,1111,"lap1");
        Laptop l3=new Laptop(2,9999,"lap1");
        laptops.add(l);
        laptops.add(l1);
        laptops.add(l2);
        laptops.add(l3);
        Collections.sort(laptops);
        for (Laptop t:laptops
             ) {
            System.out.println(t);

        }

    }
}
