package java_practice.april10;

public class MatrixOperation {
    public static void printMatrix(int[][] a, int[][] b){
        for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j <a[0].length ; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("]");
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j <a[0].length ; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("]");
        }
    }
    public static void addition(int[][] a, int[][] b){
        for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j <a[0].length ; j++) {
                System.out.print(a[i][j] + b[i][j]+" ");
            }
            System.out.println("]");
        }

    }
    public static void subtraction(int[][] a, int[][] b){
        for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j <a[0].length ; j++) {
                System.out.print(a[i][j] - b[i][j]+" ");
            }
            System.out.println("]");
        }

    }
    public static void multiple(int[][] a, int[][] b){
        for (int i = 0; i < a.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j <a[0].length ; j++) {
                int c=0;
                for (int k = 0; k < a.length; k++) {
                    c=c+(a[i][k]*a[k][j]);
                }
                System.out.print(c+" ");

            }
            System.out.println("]");
        }

    }

    public static void main(String[] args) {
        int[][] a={{1,2,3},{1,2,3},{1,2,3}};
        int[][] b={{1,2,3},{1,2,3},{1,2,3}};
printMatrix(a,b);
        System.out.println();
addition(a,b);
subtraction(a,b);
multiple(a,b);
    }
}
