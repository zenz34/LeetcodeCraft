/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        /*
        end condition:
        only single one return
        null return

        lHead = head;
        rHead = mid;

        ListNode lHead = softList(leftPart);
        ListNode rHead = softList(rightPart);
        return MergeSort(lHead, rHead);
        
        */
        
        
        /*  test case
        null  return null
        [1]  return 1
        [1, 2] return [1,2]
        [3, 2, 1, 5, 4]  
        [3, 2] & [1, 5, 4]

[3, 2]  [3] & [2] [2, 3]

[1, 5, 4] : [1] & [5, 4]
[1] return [1]
[5, 4] return [4, 5]
left [1] right [4, 5] to mergesort : [1, 4, 5]

left [2, 3] right [1, 4, 5] mergesort : [1, 2, 3, 4, 5]


        */
        
        //  end condition
        if (head == null || head.next == null) {
            return head;
        }
        
        //  cut into two halves  two pointer, fast and slow   remember to cut off the tail of left part
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        
        //  fast.next != null 为什么要这样写？ 走一遍  分为奇数 偶数  odds even
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;  //  原来如此，要保证这里不会因为fast.next 为null造成错误
        }
        
        prev.next = null;   //  cut off
        
        //  sort left and right seperatly    这里不是很明白递归的过程，跑一遍！
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        
        //  merge soft
        return mergeSort(left, right);
    }
    
    private ListNode mergeSort(ListNode l, ListNode r) {
        ListNode dumpHead = new ListNode(0);
        ListNode p = dumpHead;
        
        //  这段的写法很经典，记下来       merge two linked list, merge two array 
        while (l != null && r != null) {
            if (l.val <= r.val) {
                p.next = l;
                l = l.next;
            } else {
                p.next = r;
                r = r.next;
            }
            
            p = p.next;
        }
        
        if (l != null) {
            p.next = l;
        }
        
        if (r != null) {
            p.next = r;
        }
        
        return dumpHead.next;
    }
}
