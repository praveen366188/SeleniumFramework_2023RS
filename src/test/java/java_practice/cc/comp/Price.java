package java_practice.cc.comp;

import java.util.Comparator;

public class Price implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        if(m1.price==m2.price)
            return 0;
        else if (m1.price>m2.price)
            return 1;
        else
            return -1;

    }
}
