public class Solution {
    public int removeElement(int[] nums, int val) {
        int startIndex = 0;
        int endIndex = 0;
        int newLength = 0;
        int tmp = 0;

        //  corner case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        startIndex = 0;
        endIndex = nums.length - 1;



        //  process
        while (startIndex <= endIndex) {
            if (nums[startIndex] == val && nums[endIndex] != val) {
                tmp = nums[startIndex];
                nums[startIndex] = nums[endIndex];
                nums[endIndex] = tmp;

                startIndex++;
                endIndex--;
            }
            else if (nums[startIndex] == val && nums[endIndex] == val) {
                endIndex--;
            }
            else if (nums[startIndex] != val && nums[endIndex] == val) {
                startIndex++;
                endIndex--;
            }
            else {
                startIndex++;
            }
        }

        newLength = startIndex;

        return newLength;
    }
}