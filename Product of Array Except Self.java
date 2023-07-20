class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] ans= new int[nums.length];
      int[] left= new int[nums.length];
      int[] right=new int[nums.length];
      int temp1=1;
      for(int i=0;i<nums.length;i++){
        temp1*=nums[i];
        left[i]=temp;
      }
      int temp2=1;
      for(int i=nums.length-1;i>=0;i--){
        temp2*=nums[i];
        right[i]=temp2;
      }
      for(int i=0;i<nums.length;i++){
        int lans=i>=1? left[i-1]:1;
        int rans=i<nums.length-1?right[i+1]:1;
        ans[i]=lans*rans;
      }
      return ans;
    }
}
