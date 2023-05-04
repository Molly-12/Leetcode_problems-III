class Solution {
    public int countSquares(int[][] mat) {
      int res=0;
      int m=mat.length;
      int n=mat[0].length;
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
          if(mat[i][j]>0 && i>0 && j>0){
            int min=Math.min(mat[i-1][j],Math.min(mat[i][j-1],mat[i-1][j-1]));
            mat[i][j]=min+1;
          }
          res+=mat[i][j];
        }
      }
      return res;
    }
}
   
