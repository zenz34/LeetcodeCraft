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
    public List<List<Integer>> levelOrder(TreeNode root) {
        int i = 0;
        int currQSize = 0;
        List<List<Integer>> resultList = new ArrayList<>();
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        TreeNode head = null;
        
        //corner case
        if (null == root) {
            return resultList;    
        }
        
        //queue
        queue1.offer(root);
        
        //for loop add into queue
        while (queue1.isEmpty() != true) {
            List<Integer> level = new ArrayList<Integer>();
            currQSize = queue1.size();
            head = queue1.peek();
            
            for (i = 0; i < currQSize; i++) {
                head = queue1.poll();
                level.add(head.val);
                
                if (head.left != null) {
                    queue1.offer(head.left);
                }
                
                if (head.right != null) {
                    queue1.offer(head.right);
                }
            }
            
            resultList.add(level);
        }
        
        return resultList;
    }
}

