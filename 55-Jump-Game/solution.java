public class Solution {
        private boolean helper(int[] nums, int[] visited, int curStep, int goalStep) {
            if (curStep == goalStep) {
                System.out.println("  helper return true");
            
                return true;
            }
            
            for (int i = 1; i <= nums[curStep]; i++) {
            
                System.out.println("  helper in for loop i = " + i + " curStep " + curStep + " visited[curStep] = " + visited[curStep]);
            
                if (visited[curStep + i] == 0) {
                    if (helper(nums, visited, curStep + i, goalStep)) {
                        return true;
                    }
                }
            }
            
            System.out.println("  helper visited curStep " + curStep);
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
    
            for (int i : visited) {
                System.out.println("i  = " + i);
            }
    
            return flag;
        }
}