class Solution {
  List<List<Integer>> ans= new ArrayList<>();
   public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
     List<Integer> path= new ArrayList<>();
     dfs(graph,0,path);
     return ans;
   }
   public void dfs(int[][] graph, int curr, List<Integer> path){
     path.add(curr);
     if(curr==graph.length-1){
       ans.add(new ArrayList<>(path));
     }
     for(int c:graph[curr]){
       dfs(graph,c,path);
       path.remove(path.size()-1);
     }
     return;
   }
}
