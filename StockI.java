public class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int profit=0;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<min){
                min=prices[i];
                max=min;
            }else if (prices[i]>=max){
                max=prices[i];
                profit=Math.max(max-min,profit);
            }
        }
        return profit;
    }
}
