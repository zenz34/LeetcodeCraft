// Forward declaration of the read4 API.
int read4(char *buf);

class Solution {
public:
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    int read(char *buf, int n) {
        if (buf == NULL) {
            return 0;
        }
        
        int result = 0;
        int readLen = 0;

        while(result < n) {
            readLen = read4(buf + result);
            result += readLen;
            
            if (readLen != 4) {
                break;
            }
        }
        
        return min(result, n);
    }
};