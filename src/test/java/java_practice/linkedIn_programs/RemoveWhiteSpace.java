package java_practice.linkedIn_programs;

public class RemoveWhiteSpace {

    public static void main(String[] args) {
        StringBuilder s1= new StringBuilder(" prints all pairs of numbers in the array arr whose sum equals the target value");
        StringBuilder s2= new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=' ')
                s2.append(s1.charAt(i));
        }
        System.out.println(s2);
        String s="P    r  avee   n  k   u  ma  r ";
        s=s.replaceAll("\\s","");
        System.out.println(s);


    }
}
