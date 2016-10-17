import java.lang.StringBuilder;
import java.util.Comparator;
import java.util.Arrays;

public class Solution_SB {
    public static String largestNumber(int[] nums) {
        String[] strArr = new String[nums.length];
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(strArr, new Comparator<String>() {
            //@Override
            public int compare(String left, String right) {
                return (right + left).compareTo(left + right);
            }
        });


        if (strArr[0].charAt(0) == '0') {
            return String.valueOf(0);
        }
        
        for (int i = 0; i < strArr.length; i++) {
            result.append(strArr[i]);
        }

        return result.toString();
    }

    public static void main(String argv[]) {
	int[] nums = {0, 0};
	System.out.println(largestNumber(nums));
    }
}
