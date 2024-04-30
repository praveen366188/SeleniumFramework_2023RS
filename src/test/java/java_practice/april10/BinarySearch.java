package java_practice.april10;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr={1,28,29,38,44,45,65,77,79,99,101,112};
        System.out.println(binary_search(arr,0,arr.length,101));
    }

    private static int binary_search(int[] arr, int l, int r, int x) {
        while (l<r){
            int mid=(l+r)/2;
            if(x<arr[mid])
            {
                r=mid;
            }
            else if (x>arr[mid])
            {
                l=mid;
            }
            else if (arr[mid]==x)
                return mid;
        }
        return -1;

    }


}
