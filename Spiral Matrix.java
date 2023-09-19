class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
      List<Integer> ans= new ArrayList();
      int colS=0;
      int colE=mat[0].length;
      int rowS=0;
      int rowE=mat.length;

      while(rowS<= rowE && colS<=colE){
        //traverse right
        for(int i=colS;i<=colE;i++){
          ans.add(mat[rowS][i]);
        }
        rowS++;
        //traverse down
        for(int i=rowS;i<=rowE;i++){
          ans.add(mat[i][colE]);
        }
        colE--;
        //traverse left
        if(rowS<=rowE){
          for(int i=colE;i>=colS;i--){
            ans.add(mat[rowE][i]);
          }
        }
        rowE--;
        //traverse up
        if(colS<=colE){
          for(int i=rowE;i>=rowS;i--){
            ans.add(mat[i][colS]);
          }
        }
        colS++;
      }
      return ans;
    }
}

    
