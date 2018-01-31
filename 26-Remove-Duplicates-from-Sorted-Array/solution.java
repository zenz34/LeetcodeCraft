public class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 0;
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[size] != nums[j]) {
                nums[++size] = nums[j];
            }
        }
        
        return size + 1;
    }
}