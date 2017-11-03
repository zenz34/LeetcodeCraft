/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        /*
            find the mid
            cut into two halves
                if it's odd, we choose to drop the mid one for both parts
            reverse the second half then compare it one by one
        */
        ListNode slow = head;
        ListNode fast = head;
        
        /*
        1 2 3 4     slow stop at 3
        1 2 3 4 5   slow stop at 3
        */
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //  head   and   slow  are seperatly two heads of the two list 
        
        slow = reverseList(slow);
        
        while (slow != null && head != null) {
            if (slow.val != head.val) {
                return false;
            }
            
            slow = slow.next;
            head = head.next;
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode head) {
        //  if null? if len == 1
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode cur = head;
        ListNode next = cur.next;
        
        /*
        test case :
        null
        1->null
        1->2


        1->2->3->4->5->null
        
        prev(null)->1->2  
    prev:null
    cur:1
    next:2
    cur.next = prev;  prev = cur;  cur = next.next (move to 3); next.next = prev; next = cur.next;
    
    <-2 3->4
    prev:2
    cur:3    
    next:4
    
    cur.next = prev; prev = cur; cur = next.next (5); next.next = prev; next = cur.next;
    
    
    4->5->null
    
    
    cur.next = prev; prev = cur; cur = if (next == null) {break};
    
******************* too complicated 

I choose to do it the easy way: only moves two pointer at a time
dump->1
1->2
2->3
3->4
4->null  end!




    
    
    dump->1->2->3->4
    dump->1
    prev: dump
    cur: 1
    
    {
        next = cur.next;
        cur.next = prev; 
        
        prev = cur;
        cur = next;
    }
    
    1->2   1>null 2>1
    prev 1  cur: 2 
    {
        next = cur.next;     
        cur.next = prev;
        if (prev == head) {
            prev.next == null;
        }
        prev = cur;
        cur = next;
    }
    
    1<-2  no releation  3
    prev:2  cur:3
    {
        next = cur.next;     // 4
        cur.next = prev;
        if (prev != head) {
            nothing
        }
        prev = cur;
        cur = next;
    }
    2<-3  no relation  4
    prev:3, cur:4
    same code
    
    3<-4 no link  null
    cur == null     end!!
    
    
    test case:
    1->2
    
    
    dump -> 1
    prev: dump, cur : 1
    next = cur.next;  //2
    cur.next = prev;
    prev=cur;
    cur = next;
    
    1->2
    prev:1, cur:2
    same code  except  1 == head, prev.next = null
    
    2->null
    prev: 2, cur:null   end!!
    
    
    
    
    
        */
        
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            if (prev == head) {
                prev.next = null;
            }
            prev = cur;
            cur = next;
        }
        
        return prev;
    }
}
