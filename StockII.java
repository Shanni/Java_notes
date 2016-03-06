public class Solution {
    public int maxProfit(int[] prices) {
        int profit=0, sum=0;
        for(int i=0;i<prices.length-1;i++){
            profit=prices[i+1]-prices[i];
            if(profit>0)
                sum+=profit;
        }

        return sum;
    }
}
