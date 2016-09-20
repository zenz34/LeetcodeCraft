/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode startPre = dummy;
        ListNode endPre = dummy;
        ListNode startCur = null;
        ListNode endCur = null;
        ListNode tmp = null;
        
        m--;
        n--;
        
        while (m-- > 0) {
            startPre = startPre.next;
        }
        
        //startCur = startPre.next;
        
        while (n-- > 0) {
            endPre = endPre.next;
        }
        
        //endCur = endPre.next;
        head = endPre;
        
        while (startPre != head) {
            startCur = startPre.next;
            endCur = endPre.next;
            
            startPre.next = endCur;
            tmp = startCur.next;
            startCur.next = endCur.next;
            
            endPre.next = startCur;
            endCur.next = tmp;

            startPre = startPre.next;
            endPre = endPre.next;
        }
        
        return dummy.next;
    }
}