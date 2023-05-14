class Solution {
    Integer[][] dp= new Integer[501][501];
    public boolean stoneGame(int[] piles) {
      return helper(0,piles.length-1,piles)>0;
    }
    public int helper(int i, int j, int[] piles){
      if(i>j) return 0;
      if(dp[i][j]!=null) return dp[i][j];
      int a=piles[i]+helper(i+1,j,piles);
      int b=piles[j]+helper(i,j-1,piles);
      return dp[i][j]=Math.max(a,b);
    }
}
