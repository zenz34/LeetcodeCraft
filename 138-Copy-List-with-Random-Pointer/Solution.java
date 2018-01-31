/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */

/*
test case:
1->2->3->4->5

and random point:
2->5
3 ->1


testcase:
1

1->2







*/


public class Solution {
    /*
    My version: 一开始，想的就是用hashset  error在于hashset无法取出
    2，要边存边查，会存在问题  就是加入set后，再改了其中的random  next  就不再是之前set中的元素了
    3， 
    
    不如一开始扫描一遍 将所有元素加入hashmap 再进行一轮
    

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        HashSet<RandomListNode> set = new HashSet();
        RandomListNode originP = head;
        RandomListNode newListHead = new RandomListNode(0);
        RandomListNode newListP = new RandomListNode(head.label);
        set.add(newListP);
        newListHead.next = newListP;
        
        while (originP != null) {
            //newListP = new RandomListNode(originP.label);
            
            if (originP.next != null) {
                if (set.contains(originP.next) == true) {
                    RandomListNode nextNode = set.get();
                    newListP.next = new RandomListNode(originP.next.label);
                }
            }
            
            if (originP.random != null) {
                newListP.random = new RandomListNode(originP.random.label);
            }
            
            originP = originP.next;
            newListP = newListP.next;
        }
        
        return newListHead.next;
    }
    
        */
    
    /*
    //hashmap version  
    public RandomListNode copyRandomList(RandomListNode head) {
      if (head == null) return null;

      Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();

      // loop 1. copy all the nodes
      RandomListNode node = head;
      while (node != null) {
        map.put(node, new RandomListNode(node.label));
        node = node.next;
      }

    //用了一个很巧妙的结构  <Node, Node>  1st 是原本的  2nd是新的  一次查询就可以取出
    // loop 2. assign next and random pointers
      node = head;
      while (node != null) {
        map.get(node).next = map.get(node.next);
        map.get(node).random = map.get(node.random);
        node = node.next;
      }

      return map.get(head);
    }    
    */
    
    
    /*  amazing version  */
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode iter = head, next;

        // First round: make copy of each node,
        // and link them together side-by-side in a single list.
        while (iter != null) {
            next = iter.next;

            RandomListNode copy = new RandomListNode(iter.label);
            iter.next = copy;
            copy.next = next;

            iter = next;
        }

        // Second round: assign random pointers for the copy nodes.
        iter = head;
        while (iter != null) {
            if (iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }

        // Third round: restore the original list, and extract the copy list.
        iter = head;
        RandomListNode pseudoHead = new RandomListNode(0);
        RandomListNode copy, copyIter = pseudoHead;

        while (iter != null) {
            next = iter.next.next;

            // extract the copy
            copy = iter.next;
            copyIter.next = copy;
            copyIter = copy;

            // restore the original list
            iter.next = next;

            iter = next;
        }

        return pseudoHead.next;
    }
}
