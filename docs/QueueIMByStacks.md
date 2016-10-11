|                  | Queue | Stack | Difference |
| ---------------- | ----- | ----- | ---------- |
| push() / offer() | tail  | top   | same       |
| pop() / poll()   | head  | top   | different  |
| peek()           | head  | top   | different  |
| size()           |       |       |            |
| isEmpty()        |       |       |            |



题目中提到用stacks实现，请注意这个s

哈哈哈

想到两个stack，再拿这些要实现的函数做对比。

发现只是pop() /poll() 和 peek() 不一样罢了。

对于pop() / poll（）来说，一个是取头，一个是取尾。

如果把栈1的元素，全部挪入栈2，那么，其实栈1中原来的bottom到top的所有元素，都掉了个个儿，顺序颠倒了，如果此时再执行栈2的pop（），实际在外部看来，就是FIFO的顺序。先入先出

那么每次调用pop的时候，就要从栈1倒到栈2

那么又分情况，

如果栈2已经有元素，说明上次已经倒过来了，那么直接弹出就好了。

如果栈2还没有元素，再执行倒过来的操作，然后pop。   加上栈1不为空

如果栈1此时没有元素，这样执行就报错了，所以还要加上栈1不为空

栈1为空呢？返回error值



peek和pop这里的操作基本是一样的，只是不remove元素。



其他push  size  isEmpty 都是一样的操作，对于push来说，只push入栈1就好了，等到pop时候再操作栈2.



时间复杂度

push  O （1）

pop	O（n）