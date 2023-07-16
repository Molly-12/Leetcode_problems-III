class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> ans= new ArrayList();
      backtrack(nums,new ArrayList(), ans,0);
      return ans;
    }
    public void backtrack(int[] nums,List<Integer> res, List<List<Integer>> ans, int start){
      ans.add(new ArrayList(res));
      for(int i=start;i<nums.length;i++){
        res.add(nums[i]);
        backtrack(nums,res,ans,i+1);
        res.remove(res.size()-1);
      }
    }
}
