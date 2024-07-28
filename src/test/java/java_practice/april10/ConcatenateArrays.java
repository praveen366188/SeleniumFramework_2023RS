package java_practice.april10;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] concatenatedArray = concatenateArrays(array1, array2);

        // Print the concatenated array
        for (int num : concatenatedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
        // Create a new array with length equal to the sum of lengths of arr1 and arr2
        int[] result = new int[arr1.length + arr2.length];
        // Copy elements of arr1 into result
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        // Copy elements of arr2 into result, starting from index arr1.length
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return result;
    }
}