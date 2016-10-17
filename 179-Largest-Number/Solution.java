public class Solution {
    public String largestNumber(int[] nums) {
        List<String> list = new ArrayList<String>();
        String result = new String();
        
        for (int i : nums) {
            list.add(String.valueOf(i));
        }
        
        Collections.sort(list, new Comparator<String> (){
            //@Override
            public int compare (String left, String right){
                int ret = 0;
                int i = 0;
                Integer leftFirst = new Integer(0);
                Integer rightFirst = new Integer(0);
                
                for (i = 0; i < left.length() && i < right.length(); i++) {
                    ret = (int) right.charAt(i) - (int) left.charAt(i);
                    
                    if (ret != 0) {
                        return ret;
                    }
                }
                
                if (i != left.length() || i != right.length()) {
                    leftFirst = Integer.parseInt(left + right);
                    rightFirst = Integer.parseInt(right + left);
                }
    
                return rightFirst.compareTo(leftFirst);
            }
        });
        
        for (String s : list) {
            result += s;
        }
        
        return result.charAt(0) == '0' ? String.valueOf(0) : result;
        //return result.compareTo("00") == 0 ? String.valueOf(0) : result;
    }
}