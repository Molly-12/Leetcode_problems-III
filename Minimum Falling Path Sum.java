class Solution {
    public int minFallingPathSum(int[][] matrix) {
      int n=matrix.length;
      int minsum=Integer.MAX_VALUE;
      if(n==1) return matrix[0][0];
      for(int i=1;i<n;i++){
        for(int j=0;j<n;j++){
          int mintop=matrix[i-1][j];
          if(j>0){
            mintop=Math.min(mintop,matrix[i-1][j-1]);
          }
          if(j<n-1){
            mintop=Math.min(mintop,matrix[i-1][j+1]);
          }
          matrix[i][j]+=mintop;
          if(i==n-1){
            minsum=Math.min(minsum,matrix[i][j]);
          }
        }
      }
      return minsum;
       
    }
}
            
    
