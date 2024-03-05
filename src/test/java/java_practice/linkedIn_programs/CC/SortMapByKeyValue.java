package java_practice.linkedIn_programs.CC;

import java.util.*;

public class SortMapByKeyValue {
    public static void main(String[] args) {
        Map<String,Integer> map1= new HashMap<>();
        Map<String,Integer> map2= new LinkedHashMap<>();
        map1.put("Jayant",2);
        map1.put("Anushka",1);
        map1.put("Amit",4);
        map1.put("Abhishek",0);
        map1.put("Danish",8);
        System.out.println(map1);
        List<String> l1=new ArrayList<>();
        for(Map.Entry<String,Integer> entry: map1.entrySet()){
            l1.add(entry.getKey());
        }
        Collections.sort(l1);
        System.out.println(l1);
        for (String s:l1) {
            System.out.println(s);
            map2.put(s, map1.get(s));
        }
        System.out.println(map2);
    }
}

