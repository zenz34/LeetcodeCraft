public class Solution {
        public boolean canJump(int[] nums) {
            if (nums == null) {
                return false;
            }

            int maxStep = 0;
    
            for (int curStep = 0; curStep < nums.length - 1; curStep++) {
                if (maxStep <= curStep && nums[curStep] == 0) {
                    return false;
                }
    
                if (maxStep < curStep + nums[curStep]) {
                    maxStep = curStep + nums[curStep];
                }
    
                if (nums[curStep] + curStep >= nums.length - 1) {
                    return true;
                }
            }
    
            return true;
        }
}