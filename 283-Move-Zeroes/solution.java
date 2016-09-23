public class Solution {
    public void moveZeroes(int[] nums) {
        int lazy = 0;
        int cur = 0;
        
        if (nums == null) {
            return;
        }
        
        for (; cur < nums.length; cur++) {
            if (nums[cur] != 0) {
                nums[lazy++] = nums[cur];
            }
        }
        
        if (lazy != 0) {
            while (lazy != nums.length) {
                nums[lazy] = 0;
            }
        }
        
        return;
    }
}