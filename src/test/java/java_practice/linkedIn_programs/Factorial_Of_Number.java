package java_practice.linkedIn_programs;

import java.util.Scanner;

public class Factorial_Of_Number {
    public static int rec(int n){

        if (n == 0) {
            return 1;

        }
        else{
            return n*rec(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=1;
        for (int i = 1; i < n ; i++) {
            f=rec(n);
        }
        System.out.println(f);

    }



}
