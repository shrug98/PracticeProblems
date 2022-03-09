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
    public int maxDepth(TreeNode root) {
        int countl = 0; 
        int countr = 0; 
        if(root == null) return 0; 
        if(root.left != null){
            countl += maxDepth(root.left); 
            
        }
        if(root.right != null){
            countr += maxDepth(root.right);
        }
        return 1+Math.max(countl, countr); 
        
    }
}
