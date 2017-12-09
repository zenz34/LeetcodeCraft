class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        
        for (int i = 0; i < nums.length; i++) {
            actual += nums[i];
        }
        
        return expected - actual;
    }
}
