Binary Tree Preorder Traversal

使用stack实现

可视化确实太好用了。

多画几个图，看顺序，观察发现，是先根节点，再左子树，再右子树的顺序。

返回的是一个ArrayList，所以Stack只是辅助一下。

多观察几次，发现，是

push(root)



Loop START  (stack not empty)

p = pop

add p.val into ArrayList

push(p.right)

push(p.left)

Loop END



就解决了一道medium题目



corner case

​	1 nll

​	2 only root

一开始使用两个stack，1个arraylist，其中一个暂存node节点，最后一次性加入arraylist。

其实冗余，每次pop以后直接加进arraylist就好了



Get✅

arraylist.add(int index, int val);	可以加index啊啊啊



时间复杂度

O (n)

空间复杂度

O (2n)  =  O (n)



