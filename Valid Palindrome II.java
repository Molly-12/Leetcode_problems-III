class Solution {
    public boolean validPalindrome(String s) {
      int i=0;
      int j=s.length()-1;
      while(i<=j){
        if(s.charAt(i)!=s.charAt(j)){
          return helper(s,i+1,j) || helper(s,i,j-1);
        }
        i++;
        j--;
      }
      return true;
    }
    public boolean helper(String s, int i, int j){
       int start=i;
      int end=j;
      while(start<=end){
        if(s.charAt(start)!=s.charAt(end)){
          return false;
        }
        start++;
        end--;
      }
      return true;
    }
}
      
