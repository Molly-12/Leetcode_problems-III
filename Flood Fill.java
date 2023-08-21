class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      if(image[sr][sc]==color){
        return image;
      }
      helper(image,sr,sc,image[sr][sc],color);
      return image;
    }
    public void helper(int[][] image, int i, int j,int idx, int color){
      if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=idx) return;
      image[i][j]=color;
      helper(image,i+1,j,idx,color);
      helper(image,i-1,j,idx,color);
      helper(image,i,j-1,idx,color);
      helper(image,i,j+1,idx,color);
    }
  
}
