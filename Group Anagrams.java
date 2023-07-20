class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> ans= new ArrayList();
      Map<String,List<String>> map= new HashMap();
      for(String curr:strs){
        char[] ch= curr.toCharArray();
        Arrays.sort(ch);
        String s=new String(ch);
        if(!map.containsKey(ch)){
          map.put(s,new ArrayList());
        }
        map.get(s).add(curr);
      }
      ans.addAll(map.values());
      return ans;
    }
}
      
   
