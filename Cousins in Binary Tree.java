/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
      TreeNode xx= find(root,x);
      TreeNode yy= find(root,y);
      return ((level(root,xx,0)==level(root,yy,0)) && (!isSibling(root,xx,yy)));
    }
    public TreeNode find(TreeNode root, int x){
      if(root==null) return null;
      if(root.val==x){
        return root;
      }
      TreeNode l=find(root.left,x);
      if(l!=null){
        return l;
      }
      return find(root.right,x);
    }
  public boolean isSibling(TreeNode root, TreeNode x, Treenode y){
    if(root==null){
      return false;
    }
    if(root.left==x && root.right==y) return true;
    if(root.left==y && root.right==x) return true;
    return isSibling(root.left,x,y) || isSibling(root.right,x,y);
  }
  public int level(TreeNode root, TreeNode x, int lev){
    if(root==null) return 0;
    if(root==x){
      reyurn lev;
    }
    int l= level(root.left,x,lev+1);
    if(l!=0){
      return l;
    }
    return level(root.right,x,lev+1);
  }
  
}
