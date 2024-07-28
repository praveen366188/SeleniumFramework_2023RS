package rest_assured.ra_4_Pojo.deserial;

import java.util.List;

public class AllCoffees {
   private List<Coffee> coffees;

    public List<Coffee> getCoffee() {
        return coffees;
    }

    public void setCoffee(List<Coffee> coffee) {
        this.coffees = coffee;
    }
}
