package java_practice.linkedIn_programs;

import java.util.Scanner;

public class RemoveLeadingTrailingSpace {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String ss=s.nextLine();
        System.out.println(ss.trim());
        System.out.println(ss.strip());
        System.out.println(ss.repeat(10));

        String string1 = '\u2003' + "Java";
        System.out.println("String: " + string1);
        System.out.println("String length: " + string1.length());

        String string2 = string1.trim();
        System.out.println("After using trim() function: " + string2);
        System.out.println("Length: " + string2.length());

        String string3 = string1.strip();
        System.out.println("After using strip() function: " + string3);
        System.out.println("Length: " + string3.length());
    }


}
