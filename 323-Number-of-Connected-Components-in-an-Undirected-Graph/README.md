Brute Force
Array
int[n] a = {0}

[0, 1]
a[0]=1 a[1]=1

[1, 2]
a[1] exist
a[2] = a[1]

[3, 4]
a[3] a[4] all not exist (val == 0)
a[3] = a[4] = 2

Then find the largest value in the array, that is the number of the connected components. Return it.

T C O(n^2)   the search in the array is O(n)
S C O(n)

2 To speed up
Use HashTable to find the duplicate and store the value.
T C O(n*lgn) ?  or O(n^2)    cause the lookup is also O(n)
test case:
[0, 1] [3, 4] [4, 1]
we should find the element whose value equals 4 then update it's value.



