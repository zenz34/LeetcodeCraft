TwoPointers总结

TwoPointers目前遇到过的几种方式

## head tail 

1每次把头尾重新加入到前列 	链表

143.   Reorder List

     ​

## small large

把小于某一val的放在前面，大于等于的放在后面，形成新链表。Partition List

做法：small链表，large链表，把原有元素分别加入俩链表，最后首尾一链接



## head cur

​	cur不停向前移动，有符合元素，swap（head，cur）或者改值a[head] = val

RemoveElements、Move0Elements  【Array】



## pre cur

​	链表常用，题目24. Swap Nodes in Pairs







## 甚至三指针

## pre cur next

206 Reverse Linked List