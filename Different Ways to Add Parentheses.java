class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
      List<Integer> ans= new LinkedList();
      int n=expression.length();
      for(int i=0;i<n;i++){
        char c=expression.charAt(i);
        if(c=='-' || c=='+' || c=='*){
          List<Integer> left= diffWaysToCompute(expression.substring(0,i));
          List<Integer> right= diffWaysToCompute(expression.substring(i+1));
          for(int a:left){
            for(int b:right){
              if(c=='+'){
                res.add(a+b);
              }
              else if(c=='-'){
                res.add(a-b);
              }
              else{
                res.add(a*b);
              }
            }
          }
        }
      }
      if(res.isEmpty()){
        res.add(Integer.parseInt(expression));
      }
      return res;
    }
}
            
    
