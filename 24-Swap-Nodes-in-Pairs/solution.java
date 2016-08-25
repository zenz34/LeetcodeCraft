/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        //  corner case
        if (head == null) {
            return null;
        }
        
        if (head != null && head.next == null) {
            return head;    
        }
        
        //
        ListNode newHead = head->next;
        ListNode prev = head;
        ListNode cur;
        
        while (prev != null && prev.next != null) {
            cur = prev.next;
            prev.next = cur.next;
            cur.next = prev;
            prev = prev.next;
        }

        return newHead;
    }
}