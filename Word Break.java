class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
      int n=s.length();
      boolean[] dp= new boolean[n];
      for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
          if((j==0 || dp[j-1]==true) && wordDict.contains(s.substring(j,i+1))){
            dp[i]=true;
            break;
          }
        }
      }
      return dp[n-1];
    }
}
      
   
