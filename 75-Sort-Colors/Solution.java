public class Solution {
    private void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
    
    public void sortColors(int[] nums) {
        int head = 0;
        int tail = nums.length - 1;
        int cur = 0;
        
        while (cur <= tail) {
            if (nums[cur] == 1) {
                cur++;
            } else if (nums[cur] == 2) {
                swap(nums, cur, tail);
                tail--;
            } else {        // for if (nums[cur] == 0) {
                swap(nums, cur, head);
                cur++;
                head++;
            }
        }
    }
}