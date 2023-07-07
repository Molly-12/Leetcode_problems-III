class Solution {
  int ans=0;
  public int fun(int n, int[] cost,int i){
    if(i>n) return 0;
    int left=fun(n,cost,2*i);
    int right=fun(n,cost,2*i+1);
    ans+=math.abs(left-right);
    return cost[i-1]+Math.max(left,right);
  
  public int minIncrements(int n, int[] cost) {
    fun(n,cost,1);
    return ans;
  }
}
