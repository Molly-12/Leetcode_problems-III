class Solution {
    public int minFlipsMonoIncr(String s) {
      int i=0;
      int zcount=0;
      int ocount=0;
      while(i<s.length() && s.charAt(i)=='0'){
        i++;
      }
      for(;i<s.length();i++){
        if(s.charAt(i)=='0'){
          zcount++;
        }
        else{
          ocount++;
        }
        if(zcount>ocount){
          zcount=ocount;
        }
      }
      return zcount;
    }
}
   
