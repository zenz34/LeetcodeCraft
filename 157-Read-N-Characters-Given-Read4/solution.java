/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        int i = 0;
        int tmp = 0;
        
        while (i != n) {
            tmp = read4(buf);
            if (4 == tmp) {
                i += 4;
            }
            else {
                i += tmp
            }
        }
        
        return i;
    }
}