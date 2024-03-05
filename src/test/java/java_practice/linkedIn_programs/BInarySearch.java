package java_practice.linkedIn_programs;

public class BInarySearch {


    public static int binarySearch(int arr[],int l,int r,int x){
        while (l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==x)
                return mid;
            else if (x<arr[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9,10,11};
        int pos=binarySearch(arr,0,arr.length-1,10);
        System.out.println(pos);

    }


}
