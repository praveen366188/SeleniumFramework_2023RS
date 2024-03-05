package java_practice.linkedIn_programs;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int count=0;
        int n=s.nextInt();
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                count = 1;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Not a Prime number");
        }
        else
            System.out.println("Prime Number");
    }

}
