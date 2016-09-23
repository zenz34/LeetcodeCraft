/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 
 * rightDummy.next = null;
 * rightCur.next = null;
 * 
 */
public class Solution {
        public ListNode partition(ListNode head, int x) {
            if (null == head) {
                return head;
            }
            
            ListNode leftDummy = new ListNode(0);
            leftDummy.next = head;
            ListNode rightDummy = new ListNode(0);
            rightDummy.next = null;
            ListNode leftCur = leftDummy;
            ListNode rightCur = rightDummy;
            ListNode cur = head;
            
            while (cur != null) {
                if (cur < val) {
                    leftCur.next = cur;
                    leftCur = leftCur.next;
                }
                else {
                    rightCur.next = cur;
                    rightCur = rightCur.next;
                }
                
                cur = cur.next;
            }
            
            rightCur.next = null;
            leftCur.next = rightDummy.next;
            
            return leftDummy.next;
        }
}