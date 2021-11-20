class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int min = prices[0];
        for(int price : prices){
            if(ans < price - min)
                ans = price - min;
            if(min > price)
                min = price;
        }
        return ans;
    }
}
// Brute-force - O(n)