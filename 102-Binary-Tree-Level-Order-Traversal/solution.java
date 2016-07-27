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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        int i = 0;
        int queueSize = 0;
        int currQSize = 0;
        ArrayList<Integer> level = new ArrayList<Integer>();
        ArrayList resultList = new ArrayList();
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
       
        //corner case
        if (null == root) {
            return resultList;    
        }
        
        //queue
        queue1.offer(root);
        
        //for loop add into queue
        while (queue1.isEmpty() != true) {
            currQSize = queue1.size();
            TreeNode head = queue1.element();
            
            for (i = 0; i < currQSize; i++) {
                level.add(head.val);
                queue1.poll();
                
                if (head.left != null) {
                    queue1.offer(head.left);
                }
                
                if (head.right != null) {
                    queue1.offer(head.right);
                }
                
                head = queue1.element();
            }
            
            resultList.add(level);
        }
        
        return resultList;
    }
}

