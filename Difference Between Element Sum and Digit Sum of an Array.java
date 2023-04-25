class Solution {
    public int differenceOfSum(int[] nums) {
      int ans=sumele(nums)-digitsum(nums);
      return Math.abs(ans);
    }
    public int sumele(int[] nums){
      int sum=0;
      for(int i=0;i<nums.length;i++){
        sum+=nums[i];
      }
      return sum;
    }
    public int digitsum(int[] nums){
      int sum=0;
      int temp=0;
      for(int i=0;i<nums.length;i++){
        while(nums[i]!=0){
          temp=nums[i]%10;
          sum+=temp;
          nums[i]=nums[i]/10;
        }
      }
      return sum;
    }
}
  
