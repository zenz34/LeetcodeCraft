public class MovingAverage {
    private int[] a;
    //private int size;
    private int cur;
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.a = new int[size];
        //this.size = size;
        this.cur = 0;
    }
    
    public double next(int val) {
        double sum = 0;
        int length = 0;
        
        a[cur % a.length] = val;
        cur++;
        length = Math.min(a.length, cur);
        
        for (int i = 0; i < length; i++) {
            sum += a[i];
        }
        
        return sum / length;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
