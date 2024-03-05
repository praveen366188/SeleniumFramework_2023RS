package java_practice.linkedIn_programs;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String s = "ILoveYou";
        String s1 = "MALAYALAM";
        checkPalindrome(s);
        checkPalindrome(s1);
    }

    private static void checkPalindrome(String s) {
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                System.out.println("Not Palindrome");
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Palindrome");
    }
}
