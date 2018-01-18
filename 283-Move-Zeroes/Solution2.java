class Solution {
  public void moveZeroes(int[] nums) {
    
    for (int i = 0, j = 1; j < nums.length; j++) {
      if (nums[i] != 0) {
        i++;
      }
      
      if (nums[i] == 0 && nums[j] != 0) {
        nums[i] = nums[j];
        nums[j] = 0;
      }
    }
    
//     System.out.println("start");
//     for (int a : nums) {
//       System.out.printf(" %d \t", a);
//     }
//     System.out.println("end");
  }  
    
}
