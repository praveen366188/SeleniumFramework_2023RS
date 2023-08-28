package java_practice.linkedIn_programs.string_program;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram_or_not {
    public static void main(String[] args) {
        String s = "malayalam";
        String s1 = "mllamyaaa";
        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            l1.add(s.charAt(i));
            l2.add(s1.charAt(i));
        }
        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1);
        System.out.println(l2);
        Assert.assertEquals(l1, l2);


    }


}
