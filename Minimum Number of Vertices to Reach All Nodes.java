class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
      List<Integer> res= new ArrayList();
      boolean[] ind= new boolean[n];
      for(List<Integer> l:edges){
        ind[l.get(1)]=true;
      }
      for(int i=0;i<n;i++){
        if(!ind[i]){
          res.add(i);
        }
      }
      return res;
    }
}
