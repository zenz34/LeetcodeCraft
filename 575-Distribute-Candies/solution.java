import java.util.*;



public class Solution {
    int max_kind = 0;

    /*
    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        Solution sl = new Solution();

        System.out.println(sl.distributeCandies(candies));
    }
    */
//  nums:   {1,1,2,2,3,3}
    public int distributeCandies(int[] nums) {
        permute(nums, 0);
        return max_kind;
    }
    public void permute(int[] nums, int l) {
        if (l == nums.length - 1) {
            HashSet < Integer > set = new HashSet < > ();
            for (int i = 0; i < nums.length / 2; i++) {
                set.add(nums[i]);
            }
            max_kind = Math.max(max_kind, set.size());
        }
        for (int i = l; i < nums.length; i++) {
            swap(nums, i, l);
            permute(nums, l + 1);
            swap(nums, i, l);
        }
    }
    public void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}