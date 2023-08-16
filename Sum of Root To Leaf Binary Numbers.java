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
    public int sum=0;
    public int sumRootToLeaf(TreeNode root) {
      if(root==null) return 0;
      postOrder(root,0);
      return sum;
    }
    public void postOrder(TreeNode root,int curr){
      if(root==null) return;
      curr+=root.val;
      if(root.left==null && root.right==null){
        sum+=curr;
        return;
      }
      postOrder(root.left,curr*2);
      postOrder(root.right,curr*2);
    }
}

