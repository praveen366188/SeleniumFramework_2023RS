package java_practice;


import java.util.ArrayList;
import java.util.List;

public class FIndNumber {
    public static void main(String[] args) {
        int citycode = 14;
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();


        List<String> list = new ArrayList<>();
        for (int i = 0; i < 9999; i++) {
            for (int j = 0; j < 51; j++) {

                    list.add("MH" + j + " " + i);

            }
        }
        System.out.println(list.size());

    }
}
