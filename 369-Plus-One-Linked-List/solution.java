/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
         //  1 reverse linked list
        //  2 convert into a Integer , calculate then convert into linkedlist again
        //  3 n th two pointer  9 9 8, 9 8 9
        //  4 recursion
 
 
public class Solution {
    private int helper(ListNode root, int value) {
        int tmp = 0;
        
        if (root.next == null) {
            root.val = (root.val + value) % 10;
            return (root.val + value) > 10 ? 1 : 0;
        }
        
        tmp = helper(root.next, value);
        root.val += tmp % 10;
        
        return (tmp + root.val) > 10 ? 1 : 0;
    }
    
    public ListNode plusOne(ListNode head) {
        if (null == head) {
            return head;
        }
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        if (1 == helper(head, 1)) {
            dummy.next = new ListNode(1);
            dummy.next.next = head;
        }
        
        return dummy.next;
    }
}