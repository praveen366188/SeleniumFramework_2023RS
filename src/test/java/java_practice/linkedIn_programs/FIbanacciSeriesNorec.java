package java_practice.linkedIn_programs;

public class FIbanacciSeriesNorec {

    public static void main(String[] args) {

        int n=9;
        int a=0,b=1,c;
        for (int i = 0; i < n ; i++) {
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }


    }


}
