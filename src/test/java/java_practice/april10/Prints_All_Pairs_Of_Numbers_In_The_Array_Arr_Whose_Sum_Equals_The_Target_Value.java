package java_practice.april10;

public class Prints_All_Pairs_Of_Numbers_In_The_Array_Arr_Whose_Sum_Equals_The_Target_Value {
    public static void main(String[] args) {
        int[] arr={3,2,4,5,7,8,6,1,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]+arr[j]==6){
                    System.out.println(arr[i] + " "+arr[j]);
                }
            }

        }



    }
}
