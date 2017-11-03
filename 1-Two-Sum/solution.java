

public class a.b {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};
        int secondValue = 0;

        if (0 == nums.length) {
            return result;
        }
        
        //  pick the first value
        for (int i = 0; i < nums.length; i++) {
            secondValue = target - nums[i];
            
            //  pick the second value
            for (int j = i + 1; j < nums.length; j++) {
                if (secondValue == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    
                    return result;
                }
            }
        }
        
        return result;
    }
}
