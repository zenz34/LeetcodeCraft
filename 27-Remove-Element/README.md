Two pointers --> startIndex + endIndex
Put all the target value in the head of the array.
Then return array + x (x means number of the target value in the head)


*   {3,2,2,3}    3
*   {2, 2}  2
*   [0,4,4,0,4,4,4,0,2] 4
*   [4, 4] 3
*  {2} 2
* {2} 3
These are test cases that I failed.
It's hard to use the two pointers with head and tail.
It's more easy to use bubble sort thinking!
By initially using two pointers all point to the head and then use one to do iteration.
Whenever a val != val found, we change the val of another point and move it one step ahead.
We do not need to care the val of last elements since the length we return can let the callers ignore them.

