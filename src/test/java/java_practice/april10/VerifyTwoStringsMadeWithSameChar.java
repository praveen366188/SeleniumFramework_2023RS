package java_practice.april10;

import java.util.HashSet;
import java.util.Set;

public class VerifyTwoStringsMadeWithSameChar {
    public static void main(String[] args) {
        
        String s1="aeiou";
        String s2="aaeeoeiiuiii";
        int flag=1;
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        for (char c:s1.toCharArray()) {
            set1.add(c);
        }
        for (char c:s2.toCharArray()) {
            set2.add(c);
        }
        for (char c:set1) {
            if (!set1.contains(c))
            { flag=0;
                System.out.println("not created with same set of chars");}
        }
        if(flag==1)
            System.out.println("created with same set of chars");

    }
    
    
}
