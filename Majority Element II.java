class Solution {
    public List<Integer> majorityElement(int[] nums) {
      List<Integer> ans= new ArrayList();
      int c1=Integer.MIN_VALUE;
      int c2= Integer.MIN_VALUE;
      int l1=0;
      int l2=0;
      for(int i=0;i<nums.length;i++){
        if(nums[i]==c1) l1++;
        else if(nums[i]==c2) l2++;
        else if(l1==0){
          c1=nums[i];
          l1=1;
        }
        else if(l2==0){
          c2=nums[i];
          l2=1;
        }
        else{
          l1--;
          l2--;
        }
      }
      
      int count1=0;
      int count2=0;
      for(int i=0;i<nums.length;i++){
        if(c1==nums[i]) count1++;
         if(c2==nums[i]) count2++:
        }
        if(c1>(nums.length/3)) ans.add(c1);
        if(c2>(nums.length/3)) ans.add(c2);
        return ans;
    }
}
      
