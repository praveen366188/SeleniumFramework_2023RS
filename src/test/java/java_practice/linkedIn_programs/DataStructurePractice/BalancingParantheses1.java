package java_practice.linkedIn_programs.DataStructurePractice;

import java.util.Stack;

public class BalancingParantheses1 {

    public static boolean verifyBracket(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {


            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else if (str.charAt(i)==')' && !stack.isEmpty())
            {
                char c= stack.pop();
                if(c!='(')
                    return false;
            }
            else
                return false;
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String s = "()()()((()";
        System.out.println(verifyBracket(s));
    }

}
