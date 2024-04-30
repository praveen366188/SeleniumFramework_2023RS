package java_practice.april10;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String pa="malayalam";
        String npa="praveenkumar";
        String rev="";
        for (int i = pa.length()-1; i>=0; i--) {
            rev=rev+pa.charAt(i);
        }
        if(rev.equals(pa))
            System.out.println(" pa is a palindrome");
        else
            System.out.println("pa is not a palindrome");


        for (int i = npa.length()-1; i>=0; i--) {
            rev=rev+npa.charAt(i);
        }
        if(rev.equals(npa))
            System.out.println(" npa is a palindrome");
        else
            System.out.println("npa is not a palindrome");


    }
}
