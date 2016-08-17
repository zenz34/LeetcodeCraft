public class Solution {
    public boolean isHappy(int n) {
        //corner case
        
        
        int Result = 0;
        int Digit = 0;
        HashSet<Integer> hSet = new HashSet<Integer>();

        while (n != 0) {
            Digit = n % 10;
            Result += Digit * Digit;
            n /= 10;
            
            if (n == 0) {
                if (Result == 1) {
                    return true;
                }
                
                if (false == hSet.add(Result)) {
                    return false;
                }
                
                n = Result;
                Result = 0;
            }
        }
        
        return false;
    }
}