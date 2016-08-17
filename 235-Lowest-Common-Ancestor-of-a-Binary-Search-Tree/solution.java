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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root) {
            return root;
        }
        else if (root == p) {
            return p;
        }
        else if (root = q) {
            return q;
        }
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if (left != null && right != null) {
            return root;
        }
        else if (left == null && right != null) {
            return right;
        }
        else if (left != null && right == null) {
            return left;
        }
        else {
            return null;
        }
    }
}