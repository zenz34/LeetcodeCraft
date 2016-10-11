LinkedList

## Feature

size灵活，可扩展，可缩小

O（1）时间插入删除





| add/del | get  | sort     | create |
| ------- | ---- | -------- | ------ |
| O(1)    | O(n) | O(nlogn) | O(n)   |



## 删除一个节点的三种方法

dummy node

将此节点放到头，return 接下来的1个节点，

copy to a new list?

​	更优化的方案，新建一个dummy头，用头指向各个其他节点，跳过此节点。







## 常用解题技巧

two pointers

dummy node

pre cur next指针，移动时，请注意，要删除一个元素，

只需要找到它前一个节点。

小心null指针

记得反转完之后，原来的head指针，next要指向空。

22反转或k个反转后，前2个的第二个node的next，需要指向后面，反转后2个node的第一个。







## ReverseLinkedList

### Iterative Method

pre cur head

1->2->3

如果用head作为cur来使用，可以省掉判断head为null的语句



### Recursive Method

递归的传递性，最后一次递归，返回值会是最后一个Node。

所以反过来做。最后一个已经拿到，当前的也有，反过来执行



## ReorderList

Two pointer

柏杨的方法，把后面一半convert过来



## Reverse Nodes in K Group





## CopyLinkedListWithRandomPointers





