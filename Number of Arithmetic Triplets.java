class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
      int res=0;
      Set<Integer> set= new HashSet();
      for(int i:nums){
        if(set.contains(i-diff) && set.contains(i-2*diff)){
          res++;
        }
        set.add(i);
      }
      return res;
    }
}

    
