package java_practice.cc.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Movie m11=new Movie(3.4F,150,"Billa");
        Movie m22=new Movie(4.2F,200,"Tupaki");
        Movie m33=new Movie(4.4F,170,"Gilli");
        List<Movie> movies=new ArrayList<>();
        movies.add(m11);
        movies.add(m22);
        movies.add(m33);
        Collections.sort(movies,new Price());
        for (Movie m:movies
             ) {
            System.out.println(m);
        }
    }
}
