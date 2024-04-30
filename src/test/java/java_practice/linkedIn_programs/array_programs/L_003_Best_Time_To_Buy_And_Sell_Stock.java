package java_practice.linkedIn_programs.array_programs;

public class L_003_Best_Time_To_Buy_And_Sell_Stock {
    public static void main(String[] args) {
        int[] prices={7, 1, 5, 3, 6, 4};
        int temp=0;
        int buy=0,sell=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if(prices[j]-prices[i]>temp)
                {  temp=prices[j]-prices[i];
                    buy=i+1;
                    sell=j+1;}
            }
        }
        System.out.println(temp);
        System.out.println(buy+" "+sell);
    }


}
