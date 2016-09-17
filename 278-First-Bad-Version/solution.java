/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        
        for (mid = (start + end) / 2; start != end; mid = (start + end) / 2) {
            if (isBadVersion(mid) == true) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        
        return isBadVersion(mid) ? mid : -1;
    }
}