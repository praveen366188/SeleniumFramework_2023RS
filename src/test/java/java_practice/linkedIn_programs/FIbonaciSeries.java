package java_practice.linkedIn_programs;

public class FIbonaciSeries {
    public static int f_rec(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return f_rec(n - 1) + f_rec(n - 2);

    }

    public static void main(String[] args) {
        int n = 14;
        for (int i = 0; i < n; i++) {
            System.out.print(f_rec(i) + " ");
        }

    }
}
