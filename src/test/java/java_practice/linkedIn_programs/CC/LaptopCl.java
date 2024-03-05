package java_practice.linkedIn_programs.CC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopCl implements Comparable<LaptopCl>{
    int version;
    int price;
    String name;
    int ram;

    public static void main(String[] args) {
        LaptopCl l1=new LaptopCl(3,20000,"hp",8);
        LaptopCl l2=new LaptopCl(3,15000,"mi",4);
        LaptopCl l3=new LaptopCl(3,25000,"lg",10);
        LaptopCl l4=new LaptopCl(3,50000,"mac",12);
        List<LaptopCl> list=new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }



    public LaptopCl(int version, int price, String name, int ram) {
        this.version = version;
        this.price = price;
        this.name = name;
        this.ram = ram;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "LaptopCl{" +
                "version=" + version +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                '}';
    }

    @Override
    public int compareTo(LaptopCl laptop) {
      if(this.ram>laptop.ram)
          return 1;
      else if (this.ram< laptop.ram)
          return -1;
      else
          return 0;


    }
}
