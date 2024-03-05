package java_practice;

public class MatrixOperation {
    public static int[][] addition(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][] subtraction(int[][] matrix1, int[][] matrix2) {
        int[][] matrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix;
    }

    public static void print_matrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[j][j]);
            }
            System.out.print(" ]");
            System.out.println();

        }
        System.out.println("---------------------------------");

    }

    public static int[][] multiple(int[][] matrix1, int[][] matrix2) {
        int[][] c = new int[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < matrix1.length; k++) {
                    c[i][j] += matrix1[i][k] * matrix2[k][j];
                }

            }

        }


        return c;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] matrix2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        print_matrix(matrix1);
        print_matrix(matrix2);
        print_matrix(addition(matrix1, matrix2));
        print_matrix(subtraction(matrix1, matrix2));
        print_matrix(multiple(matrix1, matrix2));


    }
}
