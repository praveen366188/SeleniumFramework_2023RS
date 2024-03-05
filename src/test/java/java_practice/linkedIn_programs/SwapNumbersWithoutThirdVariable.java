package java_practice.linkedIn_programs;

public class SwapNumbersWithoutThirdVariable {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        System.out.println("A ->"+a+"\nB->"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A ->"+a+"\nB->"+b);
    }
}
