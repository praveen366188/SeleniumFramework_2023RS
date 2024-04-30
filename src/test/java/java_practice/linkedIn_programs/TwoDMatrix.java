package java_practice.linkedIn_programs;

public class TwoDMatrix {
    //    Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

    public static void main(String[] args) {

        int prices[]={7,1,5,3,6,4};
        int s=0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if(prices[i]-prices[j]>s){
                    System.out.println(i+""+j);

                }

            }

        }


    }



}

