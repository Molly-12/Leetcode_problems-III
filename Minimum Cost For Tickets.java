class Solution {
    public int mincostTickets(int[] days, int[] costs) {
      int n=days[days.length-1];
      int[] dp= new int[n+1];
      Set<Integer> set= new HashSet();
      for(int i:days){
        set.add(i);
      }
      for(int i=1;i<dp.length;i++){
        int c1=dp[i-1];
        int c2=(i-7)>0?dp[i-7]:0;
        int c3=(i-30)>0?dp[i-30]:0;
        if(set.contains(i)){
          dp[i]=Math.min(c1+costs[0],Math.min(c2+costs[1],c3+costs[2]));
        }
        else{
          dp[i]=dp[i-1];
        }
      }
      return dp[dp.length-1];
    }
}

    
