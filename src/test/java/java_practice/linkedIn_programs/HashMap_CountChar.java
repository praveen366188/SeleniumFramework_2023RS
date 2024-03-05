package java_practice.linkedIn_programs;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            if (s.charAt(i) != ' ')
                map.put(s.charAt(i), count);

        }
        System.out.println(map);


    }
}
