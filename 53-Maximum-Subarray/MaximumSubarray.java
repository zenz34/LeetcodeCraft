import java.lang.Integer;

public class Solution {
    public int maxSubArray(int[] nums) {
        int curSumMax = 0;
        int maxPreNumber = 0;
        int sum = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            curSumMax = Math.max(maxPreNumber + nums[i], nums[i]);
            maxPreNumber = curSumMax;
            
            if (curSumMax > sum) {
                sum = curSumMax;
            }
        }
        
        return sum;
    }
}