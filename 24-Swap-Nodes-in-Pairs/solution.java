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
        else if (head.next == null) {
            return head;    
        }

        ListNode newHead = head.next;
        ListNode prev = head;
        ListNode cur = prev.next;
        
        for (; prev != null && prev.next != null; cur.next.next = prev.next) {
            prev.next = cur.next;
            cur.next = prev;
            prev = prev.next;
        }

        return newHead;
    }
}
