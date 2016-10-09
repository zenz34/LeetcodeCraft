public class Solution {
        private boolean helper(int[] nums, int[] visited, int curStep, int goalStep) {
            if (curStep == goalStep) {
                return true;
            }
            
            for (int i = 1; i <= nums[curStep]; i++) {
                if (visited[curStep + i] == 0) {
                    if (helper(nums, visited, curStep + i, goalStep)) {
                        return true;
                    }
                }
            }
            
            visited[curStep] = 1;
            
            return false;
        }

        public boolean canJump(int[] nums) {
            if (nums == null) {
                return false;
            }
    
            int[] visited = new int[nums.length];
    
            for (int i = 0; i < nums.length; i++) {
                visited[i] = 0;
            }
    
    
            boolean flag =  helper(nums, visited, 0, nums.length - 1);
    
            return flag;
        }
}