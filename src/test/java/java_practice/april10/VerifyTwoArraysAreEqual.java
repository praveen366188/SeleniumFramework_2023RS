package java_practice.april10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VerifyTwoArraysAreEqual {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,7,8,3,5};
        Integer[] brr={1,2,3,5,4,5,6,7,8,3};
//        Arrays.sort(arr);Arrays.sort(brr);
//        System.out.println(Arrays.equals(arr,brr));
        Set<Integer> set1=new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2=new HashSet<>(Arrays.asList(brr));
        int flag=0;
       if(set1.size()!=set2.size()){
           System.out.println("unmatched");flag=1;}
       else{
           for (Integer a:set1) {
               if(!set2.contains(a)){
                   flag=1;
                   System.out.println("unmatched");
                   break;
               }

           }
       }
       if(flag==0){
           System.out.println("matched");}
    }
}
