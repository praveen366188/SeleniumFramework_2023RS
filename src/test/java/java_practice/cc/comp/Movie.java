package java_practice.cc.comp;

public class Movie {
    float rating;
    int price;
    String name;

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public Movie(float rating, int price, String name) {
        this.rating = rating;
        this.price = price;
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
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
