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
    int maxlength=0;
    public int longestZigZag(TreeNode root) {
      help(root,0,0);
      help(root,1,0);
      return maxlength;
    }
    int help(TreeNode root, int dir, int curr){
      if(root==null) return 0;
      maxlength=Math.max(curr,maxlength);
      if(dir==1){
        help(root.left,0,curr+1);
        help(root.right,1,1);
      }
      else{
        help(root.right,0,curr+1);
        help(root.left,1,1);
      }
      return maxlength;
    }
}
        
      
