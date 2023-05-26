class Solution {
    public int subarraySum(int[] nums, int k) {
      int n=nums.length;
      Map<Integer,Integer> map= new HashMap<>();
      map.put(0,1);
      int sum=0;
      int ans=0;
      for(int i=0;i<n;i++){
        sum+=nums[i];
        if(map.containsKey(sum-k)){
          ans+=map.get(sum-k);
        }
        if(map.containskey(sum)){
          map.put(sum,map.get(sum)+1);
        }
        else{
          map.put(sum,1);
        }
      }
      return ans;
    }
}
        
    
