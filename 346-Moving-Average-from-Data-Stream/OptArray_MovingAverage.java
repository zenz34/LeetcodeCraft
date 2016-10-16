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