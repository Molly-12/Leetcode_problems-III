class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      int count=0;
      Set<Character>  set= new HashSet();
      for(int i=0;i<allowed.length;i++){
        set.add(allowed.charAt(i));
      
      }
      
      for(String s:words){
        boolean flag=true;
        for(int i=0;i<s.length();i++){
          if(!set.contains(s.charAt(i))){
            flag=false;
          }
        }
        if(flag) count++;
      }
      return count;
    }
}
          
             
             
             
    
