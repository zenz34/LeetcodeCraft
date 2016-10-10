public class Solution {
        public boolean canJump(int[] nums) {
            if (nums == null) {
                return false;
            }

            int maxReachableStep = 0;
    
            for (int curStep = 0; curStep < nums.length; curStep++) {
                if (maxReachableStep < curStep) {
                    return false;
                }
    
                maxReachableStep = Math.max(curStep + nums[curStep], maxReachableStep);
    
                if (maxReachableStep >= nums.length - 1) {
                    break;
                }
            }
    
            return true;
        }
}