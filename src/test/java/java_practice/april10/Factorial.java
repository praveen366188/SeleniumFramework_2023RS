package java_practice.april10;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger factorial(int n){
        if(n==0)
            return BigInteger.ONE;
        else
            return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int fact=scanner.nextInt();
        BigInteger factorial_of_number= factorial(fact);
        System.out.println(factorial_of_number);

    }
}
