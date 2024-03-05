package java_practice.linkedIn_programs;

import java.util.Scanner;
import java.util.Stack;

public class VerifyBracketsUsingStack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int flag = 1;
        System.out.print("Enter the expression");
        String string = s.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }
        int openBracket = 0;
        int closeBracket = 0;
        for (int i = 0; i < string.length(); i++) {
            if (stack.get(i) == '(') {
                openBracket = openBracket + 1;
                closeBracket = closeBracket - 1;
                if (openBracket >= 0 && closeBracket <= 0)
                    flag = 0;
                else {
                    flag = 1;
                    System.out.println("not balanced");
                    break;
                }

            } else {
                closeBracket = closeBracket + 1;
                openBracket = openBracket - 1;
                if (openBracket >= 0 && closeBracket <= 0)
                    flag = 0;
                else {
                    flag = 1;
                    System.out.println("not balanced");
                    break;
                }
            }

        }


        if (flag == 0) {
            System.out.println("balanced");

        }
    }

}
