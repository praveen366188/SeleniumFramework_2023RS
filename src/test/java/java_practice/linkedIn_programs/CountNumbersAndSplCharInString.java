package java_practice.linkedIn_programs;

import java.util.ArrayList;
import java.util.List;

public class CountNumbersAndSplCharInString {
    public static String[] fun1(String s){
        int SumOfDigits=0;
        String[] strArr=new String[2];
        List<Character> SplChar=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int asc=s.charAt(i);
            if (Character.isDigit(s.charAt(i))) {
                SumOfDigits=SumOfDigits+Integer.parseInt(String.valueOf(s.charAt(i)));

            } else if (!Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)) ) {
                SplChar.add(s.charAt(i));
            }
        }
        String sumstring= String.valueOf(SumOfDigits);
        System.out.println(sumstring);
        while (sumstring.length()>1){
            int s1=0;
            for (int i = 0; i < sumstring.length(); i++) {
                s1=s1+Integer.parseInt(String.valueOf(sumstring.charAt(i)));
            }
            sumstring=String.valueOf(s1);

        }



        strArr[0]= SplChar.toString();
        strArr[1]=sumstring;
        return strArr;
    }


    public static void main(String[] args) {
        String s = "abc789@1239999999993322";
        String[] dd=fun1(s);
        System.out.println(dd[0]);  //[@]
        System.out.println(dd[1]);  //30
    }
}
