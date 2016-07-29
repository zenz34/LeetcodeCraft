/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }
    
    private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
        if (null == leftNode && null == rightNode) {
            return true;
        }
        
        if (null == leftNode || null == rightNode) {
            return false;
        }
        
        if (leftNode.val != rightNode.val) {
            return false;
        }
        
        return isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left);
    }
}