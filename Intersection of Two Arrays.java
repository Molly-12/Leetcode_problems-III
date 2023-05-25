class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      int m=nums1.length;
      int n=nums2.length;
      Set<Integer> set1= new HashSet();
      for(int i=0;i<m;i++){
        set1.add(nums1[i]);
      }
      Set<Integer> set2= new HashSet<>();
      for(int j=0;j<n;j++){
        if(set1.contains(nums[j])){
          set2.add(nums[j]);
        }
      }
      int[] res= new int[set2.size()];
      Iterator<Integer> iterator= set2.iterator();
      for(int i=0;i<res.length;i++){
        res[i]=iteartor.next();
      }
    }
  return res;
      
    }
}
        
          
    
