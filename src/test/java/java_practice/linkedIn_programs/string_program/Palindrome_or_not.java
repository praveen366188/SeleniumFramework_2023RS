package java_practice.linkedIn_programs.string_program;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome_or_not {
    public static void main(String[] args) {
        String s = "malayalam";
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            l1.add(s.charAt(i));
        }
        for (int i = s.length()-1; i >=0; i--) {
            l2.add(s.charAt(i));
        }
        System.out.println(l1);
        System.out.println(l2);
        Assert.assertEquals(l1, l2);


    }


}
