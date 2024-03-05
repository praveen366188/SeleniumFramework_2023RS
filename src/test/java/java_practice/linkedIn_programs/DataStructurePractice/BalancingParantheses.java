package java_practice.linkedIn_programs.DataStructurePractice;

import java.util.Stack;

public class BalancingParantheses {

    public static boolean verifyBracket(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.length()-1+"->"+i);
            if(i==str.length()-1){
                if(stack.isEmpty())
                    return false;
            }
            char c = str.charAt(i);
            if (i == 0 && (c == '}' || c == ']' || c == ')')) {
                return false;
            }

            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                char c1 = stack.pop();
                if (c1 == '{' && c == '}') {
                    continue;
                } else if (c1 == '[' && c == ']') {
                    continue;
                } else if (c1 == '(' && c == ')') {
                    continue;
                }
                else
                    return false;

            }



        }

return true;
    }

    public static void main(String[] args) {
        String s = "[][]][]";
        System.out.println(verifyBracket(s));
    }

}
