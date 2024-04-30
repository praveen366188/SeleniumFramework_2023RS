package java_practice.cc;

public class Laptop implements Comparable<Laptop>{
    int ram;
    int price;


    @Override
    public int compareTo(Laptop laptop) {
    if(this.ram==laptop.ram)
        return 0;
    else if (this.ram<laptop.ram)
        return -1;
    else
        return 1;

    }
    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", price=" + price +
                ", model_name='" + model_name + '\'' +
                '}';
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

    public String getModel_name() {
        return model_name;
    }

    public void setModel_name(String model_name) {
        this.model_name = model_name;
    }

    public Laptop(int ram, int price, String model_name) {
        this.ram = ram;
        this.price = price;
        this.model_name = model_name;
    }

    String model_name;

}
