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
    public List<Integer> preorderTraversal(TreeNode root) {		
		//	push root.right into stack then push root.left into associate stack
		
		
		//	push root into main stack
		
		
		//	pop x then push x.right into stack  push x.left into associate stack 
		
		
		//  push x into main stack	

		
		Stack<TreeNode> stackAssociate = new Stack<TreeNode>();
		//Stack<TreeNode> stackMain = new Stack<TreeNode>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); 
		TreeNode p = root;
		
		if (root == null) {
			return arrayList;
		}
		
		while (p != null) {
			arrayList.add(p.val);
			
			if (p.right != null) {
				stackAssociate.push(p.right);
			}
			
			if (p.left != null) {
				stackAssociate.push(p.left);
			}
			
			if (true != stackAssociate.isEmpty()) {
			    p = stackAssociate.pop();
			}
			else {
			    p = null;
			}
		}
		
		return arrayList;
	}
}