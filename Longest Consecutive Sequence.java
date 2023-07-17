class Solution {
    public int longestConsecutive(int[] nums) {
      int ans=0;
      Map<Integer,Boolean> map= new HashMap();
      for(int num:nums){
        map.put(num,Boolean.FALSE);
      }
      for(int num:nums){
        int curr=1;
        int next=num+1;
        while(map.containsKey(next) && map.get(next)==false){
          curr++;
          map.put(next,Boolean.TRUE);
          next++;
        }
        int prev=num-1;
        while(map.containsKey(prev) && map.get(prev)==false){
          curr++;
          map.put(prev,Boolean.TRUE);
          prev--;
        }
        ans=Math.max(ans,curr);
      }
      return ans;
    }
}
    
