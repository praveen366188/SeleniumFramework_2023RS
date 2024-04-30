package java_practice.linkedIn_programs;

public class FibonacciSeries {
    public static void main(String[] args) {
long n=50;

        long a=0;
        long b=1;
        long c=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }


    }
}
