package java_practice.linkedIn_programs;

import java.util.Arrays;
import java.util.List;
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

    public static class PalindromeOrNot {
        public static boolean palindrome_or_not(String s1){
            for (int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i)!=s1.charAt(s1.length()-i-1))
                    return false;

            }
            return true;
        }
        public static void main(String[] args) {
            String s1="malayalam";
            System.out.println(palindrome_or_not(s1));


            }


        }

    public static class SortingAnArray {

        public static void main(String[] args) {

            int[] a={4,3,2,6,1,9,3,0};
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
            List<Integer> list=Arrays.asList(1, 2, 3);
            list.add(1);
            list.add(2);
            list.remove(1);
        }
    }
}
