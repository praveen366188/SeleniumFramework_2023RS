package java_practice.linkedIn_programs.CC;

import java.util.Comparator;

public class Price implements Comparator<VehicleCT> {
    @Override
    public int compare(VehicleCT o1, VehicleCT o2) {
       if(o1.getPrice()>o2.getPrice())
           return 1;
       else if (o1.getPrice()<o2.getPrice())
           return -1;
       else
           return 0;

    }
}
