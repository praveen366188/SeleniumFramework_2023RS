package java_practice.april10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class verifyListContainsOdd {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        for(Integer i:list){
            if(i%2!=0)
                System.out.println("It contains odd value");

        }
    }

}
