package java_practice.oct3;

public class PalindromeOrNot {
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

