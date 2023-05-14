class Solution {
    public int numSplits(String s) {
      Map<Character,Integer> left= new HashMap();
      Map<Charcater,Integer>right= new HashMap();
      for(int i=0;i<s.length();i++){
        right.put(s.charAt(i),right.getOrDefault(s.charAt(i),0)+1);
      }
      int count=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        left.put(c,left.getOrDefault(c,0)+1);
        right.put(c,right.getOrDefault(c,0)-1);
        if(right.get(c)<=0) right.remove(c);
      }
      if(left.size()==right.size()){
        count++;
      }
      return count;
        
    }
}
      
