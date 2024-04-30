package java_practice.linkedIn_programs;

import java.util.Scanner;

public class Factorial_Of_Number {
    public static int rec(int n){
        if(n==0)
            return 1;
        else
            return n*rec(n-1);
    }
    public static void main(String[] args) {

        System.out.println("Enter the value you want to find the factorial: ");
        Scanner scanner=new Scanner(System.in);
        int fact=scanner.nextInt();
        System.out.println("The recursion of the value "+fact+" is "+rec(fact));

    }



}
