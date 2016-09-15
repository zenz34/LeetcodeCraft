/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (null == head) {
            return head;
        }
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slowPoint = dummy;
        ListNode fastPoint = dummy;
        
        while (n--) {
            fastPoint = fastPoint.next;
        }
        //ListNode prePoint = null;
        
        while (endPoint != null) {
            head = slowPoint;
            slowPoint = slowPoint.next;
            endPoint = endPoint.next;
        }
        
        prePoint.next = slowPoint.next;
        
        return dummy.next;
    }
}