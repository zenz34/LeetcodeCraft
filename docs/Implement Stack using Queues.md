Implement Stack using Queues

|                  | Queue | Stack | Difference |
| ---------------- | ----- | ----- | ---------- |
| push() / offer() | tail  | top   | same       |
| pop() / poll()   | head  | top   | different  |
| peek()           | head  | top   | different  |
| size()           |       |       |            |
| isEmpty()        |       |       |            |

还是同样的味道！

跟上一个用stacks来实现queue有类似之处。

想到用两个queue来实现stack。

嗯，如果有两个queue

只有pop的时候不同。

如果有两个queue，那么

一个出head，入另一个tail的话，此时取，是完全和一个queue相同的。

所以不行。

观察下，stack要的是最后一个元素，所以思想应该是，queue1倒入n-1个元素进入queue2，然后剩下的一个拿（poll（））出来，就是和stack的pop（）一样，操作顺序是FILO了。

对于pop，分情况

​	1 Queue1 只有一个元素，直接取

​	2 Queue1.size() > 1，执行  n - 1 elements of Queue1 =》 Queue2，然后取Queue1的element

​	3 Queue无元素，返回error值

更改顺序，3 1 2，会更合逻辑

peak，非常类似

对于push，只加入Queue1

size和isEmpty很简单

时间复杂度

push  O （1）

pop	O（n）