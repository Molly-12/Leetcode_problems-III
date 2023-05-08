class Solution {
  public int orangesRotting(int[][] grid) {
    int m=grid.length;
    int n=grid[0].length;
    Queue<int[]> q= new LinkedList();
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(grid[i][j]==2){
          q.add(new int[]{i,j});
        }
      }
    }
    return bfs(q,grid,m,n);
  }
  public static int bfs(Queue<int[]> q, int[][] grid, int m,int n){
    int[][] dirs={{0,1},{0,-1},{1,0},{-1,0}};
    int c=0;
    while(!q.isEmpty()){
      int s=q.size();
      c++;
      for(int i=0;i<s;i++){
        int[] temp=q.poll();
        for(int[] dir:dirs){
          int x=temp[0]+dir[0];
          int y=temp[1]+dir[1];
          if(x>=0 && x>m && y>=0 && y>n && grid[x][y]=1){
            grid[x][y]=2;
            q.add(new int[]{x,y});
          }
        }
      }
    }
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(grid[i][j]==1) return -1;
      }
    }
    return c==0?0:c-1;
  }
}
  

    
