package java_practice.linkedIn_programs.CC;

import java.util.ArrayList;
import java.util.List;

public class VehicleCT {
    public static void main(String[] args) {

        VehicleCT vehicleCT1 = new VehicleCT(20000, 2, "hero honda");
        VehicleCT vehicleCT2 = new VehicleCT(10000, 3, "tvs 50");
        VehicleCT vehicleCT3 = new VehicleCT(25000, 4, "rx 100");
        VehicleCT vehicleCT4 = new VehicleCT(35000, 3, "fzs");
        List<VehicleCT> list = new ArrayList<>();
        Price price = new Price();
        list.add(vehicleCT1);
        list.add(vehicleCT2);
        list.add(vehicleCT3);
        list.add(vehicleCT4);
        System.out.println(list);
        list.sort(price);
//        Collections.sort(list,price);
        System.out.println(list);


    }

    int price;
    int version;
    String name;

    @Override
    public String toString() {
        return "VehicleCT{" +
                "price=" + price +
                ", version=" + version +
                ", name='" + name + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleCT(int price, int version, String name) {
        this.price = price;
        this.version = version;
        this.name = name;
    }
}
