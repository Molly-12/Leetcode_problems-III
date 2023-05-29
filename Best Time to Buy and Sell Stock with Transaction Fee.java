class Solution {
    public int maxProfit(int[] prices, int fee) {
      int n=prices.length;
      int buy=0;
      int sell=-(prices[0]);
      for(int i=1;i<n;i++){
        buy=Math.max(buy,sell+prices[i]-fee);
        sell=Math.max(sell,buy-prices[i]);
      }
      return buy;
    }
}
