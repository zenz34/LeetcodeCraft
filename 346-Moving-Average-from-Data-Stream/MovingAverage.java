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

public class MovingAverage {
    private int[] a;
    private int cur;
    private double sum;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.a = new int[size];
        this.cur = 0;
        this.sum = 0;
    }
    
    public double next(int val) {
        this.sum -= a[cur % a.length];
        a[cur % a.length] = val;
        cur++;
        this.sum += val;
        
        return this.sum / Math.min(a.length, cur);
    }
}
**/
/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */


/*
   Queue Version  
public class MovingAverage {
    private Queue<Integer> q;
    private int size;
    private double sum;
    // Initialize your data structure here.
    public MovingAverage(int size) {
        this.q = new LinkedList<Integer>();
        this.size = size;
        this.sum = 0;
    }
    
    public double next(int val) {
        q.offer(val);
        sum += val;
        
        if (q.size() > size) {
            sum -= q.poll();
        }
        
        return sum / q.size();
    }
}
*/

