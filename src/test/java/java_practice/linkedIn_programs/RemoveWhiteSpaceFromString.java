package java_practice.linkedIn_programs;

import java.util.Scanner;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
