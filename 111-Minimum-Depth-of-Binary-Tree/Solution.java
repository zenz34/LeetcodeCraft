/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int minDepth = 0;
        
        if (root != null) {
            q.offer(root);
        }
        
        while (!q.isEmpty()) {
            int k = q.size();
            minDepth++;
            
            for (int j = 0; j < k; j++) {
                //System.out.println("times: " + i++);

                TreeNode node = q.poll();

                //System.out.println("current node is " + node.val);

                //System.out.println("current depth is " + minDepth);

                if (node.left == null && node.right == null) {return minDepth;}
                if (node.left != null) {q.offer(node.left);}
                if (node.right != null) {q.offer(node.right);}                
            }
        }
        
        return minDepth;
    }
}
