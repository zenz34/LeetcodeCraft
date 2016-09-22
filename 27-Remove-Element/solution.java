public class Solution {
    public int removeElement(int[] nums, int val) {
        int startIndex = 0;
        int endIndex = 0;
        int newLength = 0;
        boolean flag = false;

        //  corner case
        if (nums == null || nums.length == 0) { //length == 0?
            return startIndex;
        }

        //startIndex = 0;
        endIndex = nums.length - 1;

        //  for [3, 3] target 3
        
        for (; startIndex < endIndex; startIndex++) {  //  startIndex != endIndex   length == 0 optm
            if (nums[startIndex] == val) {

                //  find end index not equals to target
                while (nums[endIndex] == val) {
                    endIndex--;

                    //  end condition
                    if (startIndex >= endIndex) {
                        flag = true;
                        break;
                    }
                }

                if (true == flag) {
                    break;
                }

                nums[startIndex] = nums[endIndex];
                nums[endIndex] = val;
                endIndex--;
            }
        }

        //if (startIndex == 0 && endIndex == nums.length - 1) {
            //  for [2]  target = 3
        if (nums[startIndex] != val) {
            newLength = startIndex + 1;
        }
        else {
            newLength = startIndex;
        }

        return newLength;
    }
}