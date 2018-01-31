class TwoSum {
    private static HashMap<Integer, Integer> map;
    /** Initialize your data structure here. */
    public TwoSum() {
        map = new HashMap<>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        //  hashset has no put() and no get(). it's not a key-value pair, so use add()
        map.put(number, map.getOrDefault(number, 0) + 1);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int curKey = (int) entry.getKey();
            int curValue = (int) entry.getValue();
            int target = value - curKey;
            
            // System.out.println("curKey: " + curKey);
            // System.out.println("curValue: " + curValue);
            // System.out.println("target: " + target);
            // System.out.println("containsKey?: " + map.containsKey(target));
            
            //  the target is the curkey and only have 1 curkey. it's not the answer
            if (map.containsKey(target)) {
                if (target == curKey && curValue <= 1) {
                    continue;
                }
                
                return true;
            }
        }
        
        return false;
    }
}

/*
Input:
["TwoSum","add","find"]
[[],[0],[0]]
Output:
[null,null,true]
Expected:
[null,null,false]
*/

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
