class Solution {
    public int[] asteroidCollision(int[] arr) {
      Stack<Integer> st= new Stack();
      for(int i=0;i<arr.length;i++){
        boolean flag=true;
        while(!st.empty() && i<0 && st.peek()>0){
          if(-i>st.peek()){
            st.pop();
          }
          if(-i<st.peek()){
            flag=false;
            break;
          }
          else{
            st.pop();
            flag=false;
            break;
          }
        }
        if(flag){
          st.push(i);
        }
      }
      int[] res= new int[st.size()];
      for(int i=res.length-1;i>=0;i--){
        res[i]=st.pop();
      }
      return res;
    }
}
       
    
