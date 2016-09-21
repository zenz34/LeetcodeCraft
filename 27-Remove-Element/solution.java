public class Solution {
    public int removeElement(int[] nums, int val) {
        int startIndex = 0;
        int endIndex = 0;
        int newLength = 0;

        //  corner case
        if (nums == null || nums.length == 0) { //length == 0?
            return 0;
        }

        startIndex = 0;
        endIndex = nums.length - 1;

        for (; startIndex != endIndex; endIndex--) {  //  startIndex != endIndex   length == 0 optm
            if (nums[endIndex] == val) {
                
                while (nums[startIndex] != val) {
                    startIndex++;
                }
                
                nums[endIndex] = nums[startIndex];
                nums[startIndex] = val;
                startIndex++;
            }
        }
        
        //nums = nums + startIndex;
        newLength = nums.length - startIndex - 1;

        return newLength;
    }
}