package java_practice.linkedIn_programs;

import java.util.Scanner;

public class CountVowelsInString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string.. ");
       String ss= scanner.nextLine();
       int count=0;
        for (int i = 0; i <ss.length() ; i++) {
            if(ss.charAt(i)=='a'||ss.charAt(i)=='e'||ss.charAt(i)=='i'||ss.charAt(i)=='o'||ss.charAt(i)=='u'){
                count++;
                System.out.println("the vowel ->"+ ss.charAt(i)+" present in the string at the position of "+i);
            }
        }
        System.out.println("the number of vowels present in the string is "+count);


    }


}
