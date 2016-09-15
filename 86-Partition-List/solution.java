/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (null == head) {
            return head;
        }
        
        ListNode dummy = ListNode(0);
        dummy.next = head;
        ListNode smallPoint = dummy;
        ListNode largePoint = dummy;
        ListNode cur = head;
        
        while (largePoint.next != null) {
            largePoint = largePoint.next;
        }
        
        while (cur.next != null) {
            if (cur.val >= x) {
                head = cur;
                
                if (cur.next != null) {
                    large.next = cur;
                    smallPoint.next = cur.next;
                    cur.next = null;
                    cur = head;
                }
                else {
                    return dummy.next;
                }
            }
            else {
                smallPoint = cur;
            }
            
            cur = cur.next;
        }
        
        return dummy.next;
    }
}