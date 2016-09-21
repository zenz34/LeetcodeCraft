public class RemoveElement {
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

        for (; startIndex < endIndex; startIndex++) {  //  startIndex != endIndex   length == 0 optm
            if (nums[startIndex] == val) {

                while (nums[endIndex] == val) {
                    endIndex--;

                    if (startIndex >= endIndex) {
                        break;
                    }
                }

                nums[startIndex] = nums[endIndex];
                nums[endIndex] = val;
                endIndex--;
            }
        }


        //nums = nums + startIndex;
        newLength = nums.length - startIndex - 1;

        return newLength;
    }
}
