class Solution {
    public int minOperations(int[] nums, int x) {
        int target=-x;
        for(int i:nums) target+=i;
        if(target==0) return nums.length;
        if(target<0) return -1;
        int res=-1,sum=0,left=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>target){
                sum-=nums[left++];
            }
        
            if(sum==target){
                res=Math.max(res,j-left+1);
            }
        }

        return res==-1?-1:nums.length-res;
        
    }
}
