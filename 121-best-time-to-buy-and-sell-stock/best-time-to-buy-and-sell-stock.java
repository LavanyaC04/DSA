class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;
        for( int i = 0 ; i <prices.length ; i++ ){
            int sell = prices[i];
            if( buy < sell ){
                int profit = sell - buy;
                if( profit > maxProfit ){
                    maxProfit = profit;
                }
            }
            else{
                buy = sell;
            }
        }
        return maxProfit;
    }
}