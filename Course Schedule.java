class Solution {
  List<Integer>[] adj;
  boolean[] vis;
  boolean[] exp;
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    adj= new ArrayList[numCourses];
    for(int i=0;i<numCourses;i++){
      adj[i]=new ArrayList();
    }
    vis= new boolean[numCourses];
    exp= new boolean[numCourses];
    for(int i=0;i<prerequisites;i++){
      adj.[prerequisites[i][0]].add(prerequisites[i][1]);
    }
    for(int i=0;i<numCourses;i++){
      if(!vis[i]){
        if(isCyclic(i)){
          return false;
        }
      }
    }
    return true;
  }
  public boolean isCyclic(int i){
    vis[i]=true;
    for(Integer j:adj[i]){
      if(!vis[j]){
        if(isCyclic(j)){
          return true;
        }
      }
      else if(!exp[j]){
        return true;
    }
    exp[i]=true;
    return false;
  }
  
}
