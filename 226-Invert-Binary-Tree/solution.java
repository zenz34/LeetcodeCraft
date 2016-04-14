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
    public TreeNode invertTree(TreeNode root) {
        TreeNode tmpNode = null;
        
        if (root == null){
            return null;
        }
        
        //  end
        if (root.left == null && root.right == null){
            return root;
        }
        
        //  exchange
        tmpNode = root.left;
        root.left = root.right;
        root.right = tmpNode;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}