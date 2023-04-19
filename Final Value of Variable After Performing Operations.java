class Solution {
    public int finalValueAfterOperations(String[] operations) {
      int total=0;
      for(int i=0;i<operations.length;i++){
        if(operations[i].charAt(1)=='-'){
          total--;
        }
        else{
          total++;
        }
        
      }
      return total;
    }
}
    
