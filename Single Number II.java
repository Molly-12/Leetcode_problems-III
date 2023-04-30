class Solution {
    public int singleNumber(int[] nums) {
      Map<Integer,Integer> map= new HashMap();
      for(int i:nums){
        if(map.containsKey(i)){
          map.put(i,map.get(i)+1);
        }
        else{
          map.put(i,1);
        }
      }
      for(int i:map.keySet()){
        if(map.get(j)==1) return j;
      }
      return 0;
    }
}
    
