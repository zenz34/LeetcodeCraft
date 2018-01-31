偷金子3

状态转移

F(int front, int remaining);

Left

if (front < 2)

nums[n - remaining] + F(front + 1, remaining - 1);



else

只能走右树啊



Right

F(0, remaining - 1);



DP

mem[3][remaining];

因为只有0,1,2三种状态  所以是[3]









