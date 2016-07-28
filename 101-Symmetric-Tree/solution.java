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
        boolean result = false;
        
        //  corner case
        if (null == root) {
            return false;
        }
        
        //  creat a queue and init it with a root
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        TreeNode head = root;
        int curQSize = 0;
        TreeNode nullNode = {Integer.MIN_VALUE, null, null};
        //  read next level node until size = 0
        while (q1.size() != 0) {
            curQSize = q1.size();
            
            for (int i = 0; i < q1.size(); i++) {
                head = q1.poll();
                
                if (head.left != null) {
                    q1.offer(head.left);
                }
                else {
                    q1.offer(nullNode);
                }
                
                if (head.right != null) {
                    q1.offer(head.right);
                }
                else {
                    q1.offer(nullNode);
                }
            }
            
            //  check if the queue is symmetric
            result = isQueueSymmetric(q1);
            
            if (false == result) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean isQueueSymmetric(Queue<TreeNode> queue) {
        int qSize = 0;
        List<TreeNode> l1 = (List) queue;
        // corner case
        if (queue == null) {
            return false;
        }
        
        // is balance?
        qSize = l1.size();
        if (qSize % 2 != 0) {
            return false;
        }
        
        // check every item
        for (int i = 0; i < qSize - 1; i++) {
            if (l1.get(i).val != l1.get(qSize - 1 - i).val) {
                return false;
            }
        }
        
        return true;
    }
}