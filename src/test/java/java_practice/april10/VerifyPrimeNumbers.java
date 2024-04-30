package java_practice.april10;

public class VerifyPrimeNumbers {
    public static void main(String[] args) {
        int n=55;
        boolean isprime=true;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
            isprime=false; }

        }
        if(isprime)
            System.out.println("its a prime number");
        else
            System.out.println("not a prime number");
    }
}
