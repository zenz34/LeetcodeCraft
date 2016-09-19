/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        /*
        if (head == null || head.next == null) {
            return head;
        }
        */
        ListNode pre = null;
        
        /*
        ListNode cur = head;
        
        while (cur != null) {
            head = cur.next;
            cur.next = pre;
            pre = cur;
            cur = head;
        }
        */
        
        ListNode next = head;
        
        while (head != null) {
            next = next.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        
        return pre;
    }
}