class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      return helper(nums,target,0,0);
    }
    public int helper(int[] nums, int target, int a, int i){
      if(i==nums.length){
        if(a==target) return 1;
        else return 0;
      }
      int z=0;
      z+=helper(nums,target,a+ nums[i],i+1);
      z+=helper(nums,target,a-nums[i],i+1);
      return z;
    }
}

