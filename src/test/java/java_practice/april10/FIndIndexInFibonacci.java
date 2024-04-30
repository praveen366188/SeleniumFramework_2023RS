package java_practice.april10;

public class FIndIndexInFibonacci {


    public static int get_fib_index(int a) {
        int flag = 0;
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                flag = i+1;
            }
        }
        if (flag == 0) {
            System.out.println("not in the list");
            return -1;
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(get_fib_index(3));
    }
}
