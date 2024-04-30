package java_practice.april10;

public class CountvowelsInString {
    public static void main(String[] args) {

        String s="praveenkumarelangoaaavan";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
count++;

        }
        System.out.println("there are "+count+" number of vowel char in the string");



    }


}
