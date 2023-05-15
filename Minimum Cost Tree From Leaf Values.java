class Solution {
    public int mctFromLeafValues(int[] arr) {
      int n=arr.length;
      int[][] dp= new int[n][n];
      return help(arr,dp,0,n-1);
    }
    int help(int[] arr, int[][] dp, int start, int end){
      if(start==end) rteurn 0;
      if(dp[start][end]>0) return dp[start][end];
      int ans=Integer.MAX_VALUE;
      for(int i=start;i<end;i++){
        int left=help(arr,dp,start,i);
        int right=help(arr,dp,i+1,end);
        int lleaf=-1;
        int rleaf=-1;
        for(int k=start;k<=i;k++){
          lleaf=Math.max(lleaf,arr[k]);
        }
        for(int k=i+1;k<=end;k++){
          rleaf=Math.max(rleaf,arr[k]);
        }
        ans=Math.max(ans,lleaf*rleaf+left+right);
        
      }
      dp[start][end]=ans;
      return ans;
    }
}
