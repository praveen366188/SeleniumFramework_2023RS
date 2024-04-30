package java_practice.april10;

import java.util.ArrayList;
import java.util.List;

public class CountNumbersAlphabetsAndSplCharInString {

    public static void main(String[] args) {
        String s = "abc789@123999rr99999-=0@$93322";
        StringBuilder alp= new StringBuilder();
        StringBuilder spl=new StringBuilder();
        StringBuilder digits=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i)))
                alp.append(s.charAt(i));
            else if (Character.isDigit(s.charAt(i)))
                digits.append(s.charAt(i));
            else
                spl.append(s.charAt(i));
        }
        System.out.println(spl);
        System.out.println(digits);
        System.out.println(alp);
    }
}
