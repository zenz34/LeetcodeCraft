public class Solution {
    private boolean helper(int[] nums, int curStep, int maxIncStep, int goalStep) {
        if (curStep + maxIncStep >= goalStep) {
            System.out.println("  helper return true");

            return true;
        }

        for (int i = 1; i < maxIncStep; i++) {

            System.out.println("  helper in for loop" + i + " curStep " + curStep + "maxIncStep " + maxIncStep);

            if (helper(nums, curStep + i, nums[curStep + i], goalStep)) {
                return true;
            }
        }

        return false;
    }

    public boolean canJump(int[] nums) {
        if (nums == null) {
            return false;
        }



        return helper(nums, 0, nums[0], nums.length - 1);
    }
}