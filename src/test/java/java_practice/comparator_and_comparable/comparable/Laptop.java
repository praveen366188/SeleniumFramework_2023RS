package java_practice.comparator_and_comparable.comparable;

public class Laptop implements Comparable<Laptop> {
    int ram;
    int price;
    String name;

    @Override
    public int compareTo(Laptop laptop) {
        if (ram == laptop.ram)
            return 0;
        else if (ram > laptop.ram)
            return 1;
        else
            return -1;


    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public Laptop(String name, int ram, int price) {
        this.ram = ram;
        this.price = price;
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
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


}
