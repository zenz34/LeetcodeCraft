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