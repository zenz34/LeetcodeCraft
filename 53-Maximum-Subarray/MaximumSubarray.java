public class MaximumSubarray {
    
    //[-2,1,-3,4,-1,2,1,-5,4]
    public static int maxSubArray(int[] nums) {
        //ArrayList<Integer> indexArray = new ArrayList<Integer>();
        int curSumMax = Integer.MIN_VALUE;
        int maxPreNumber = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            curSumMax = Math.max(maxPreNumber + nums[i], nums[i]);
            maxPreNumber = curSumMax;
        }
        
        return curSumMax;
    }

    public static void main(String[] args) {
	int a = 0xffffffff + 0x80000002;
	System.out.println(a);


	return;


    }
}
