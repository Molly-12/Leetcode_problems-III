class Solution {
  int ans=Integer.MAX_VALUE;
  public int distributeCookies(int[] cookies, int k) {
    backtrack(cookies,k,0,new int[k]);
    return ans;
  }
  void backtrack(int[] cookies, int k, int start, int[] arr){
    if(start==cookies.length){
      int max=0;
      for(int i:arr){
        max=Math.max(max,i);
      }
      ans=Math.min(ans,max);
      return;
    }
    for(int i=0;i<k;i++){
      arr[i]+=cookies[start];
      backtrack(cookies,k,start+1,arr);
      arr[i]-=cookies[start];
    }
  }
}
      
