package java_practice.april10;

import java.util.HashMap;
import java.util.Map;

public class CountCharInString {
    public static void main(String[] args) {
        String s="praveen kumar elangovan";
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int count=1;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j) && i!=j && s.charAt(i)!=' ')
                {
                    count++;

                }
                if(s.charAt(i)!=' ')
                    map.put(s.charAt(i),count);

            }

        }
        System.out.println(map);



    }
}
