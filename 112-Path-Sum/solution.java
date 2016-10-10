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
    private boolean dfsHelper(TreeNode root, int preSum, int sum) {
        if (root.left == null && root.right == null) {
            if (sum == preSum + root.val) {
                return true;
            }

            return false;
        }

        if (root.left != null) {
            if (dfsHelper(root.left, preSum + root.val, sum)) {
                return true;
            }
        }

        if (root.right != null) {
            if (dfsHelper(root.right, preSum + root.val, sum)) {
                return true;
            }
        }
        
        return false;
    }
    
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        
        return dfsHelper(root, 0, sum);
    }
}