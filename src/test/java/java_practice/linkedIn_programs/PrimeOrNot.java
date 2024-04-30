package java_practice.linkedIn_programs;

public class PrimeOrNot {
    public static void primeornot(int n){
int flag=0;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                System.out.println("not prime");
                flag=1;
                break;
            }


        }
        if(flag==0){
            System.out.println("prime");
        }
    }

    public static void main(String[] args) {

        int a=19;
        int b=49;
        primeornot(a);
        primeornot(b);



    }
}
