class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
      int n=nums.length;
      if(n<3) return 0;
      int sum=0;
      int diff=0;
      for(int i=0;i<n-2;i++){
        int a=nums[i];
        int b=nums[i+1];
        int c=nums[i+2];
        if(a-b==b-c){
          diff++;
          sum+=diff;
        }
        else{
          diff=0;
        }
      }
      return sum;
    }
}
