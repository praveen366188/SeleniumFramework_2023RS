package java_practice.linkedIn_programs;

import java.util.Scanner;

public class FactorialFibonacci {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number.. ");
        int n = s.nextInt();
        System.out.println("the factorial of the number is " + fact(n));
        System.out.println("the fibonacci series is ");
        for (int i = 0; i < n; i++) {
            System.out.println(fib(i));
        }
    }

    private static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    private static int fact(int n) {
        if (n == 0) {
            return 1;
        } else
            return n * fact(n - 1);
    }

}
