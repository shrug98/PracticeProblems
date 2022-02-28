class Solution {
    public int maxProfit(int[] prices) {
        int max = 0; //variable for max profit
        for (int i = 0; i < prices.length - 1; i++){  
            for(int j = i+1; j < prices.length; j++){
                int profit = prices[j] - prices[i]; //checks the profit between days 
                if (profit > max) //if this profit is greater than max, then profit is new max
                    max = profit;
            }
        }
        return max; 
    }
}
