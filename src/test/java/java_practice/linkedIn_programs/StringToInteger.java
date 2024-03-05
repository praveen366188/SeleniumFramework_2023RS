package java_practice.linkedIn_programs;

public class StringToInteger {

    public static void main(String[] args) {
        String s="1234";
        int i=Integer.parseInt(s);
        System.out.println(i+1);

        char c='d';
        String ss=String.valueOf(c);
        System.out.println(ss);

        char c1='2';
        int ii=Integer.parseInt(String.valueOf(c1));
        System.out.println(ii);
    }
}
