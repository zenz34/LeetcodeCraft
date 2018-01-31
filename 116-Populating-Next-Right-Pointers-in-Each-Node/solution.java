/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    private void helper(TreeLinkNode root, TreeLinkNode left, TreeLinkNode right) {
        if (root == null || left == null || right == null) {
            return;
        }
        
        left.next = right;
        
        if (root.next == null) {
            right.next = null;
        }
        else {
            right.next = root.next.left;
        }
        
        return;
    }
    
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return root;
        }
        
        root.next = null;
        
        helper(root, root.left, root.right);
        
        return;
    }
}