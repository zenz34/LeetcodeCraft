import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int winningLotteryTicket(String[] tickets) {
        // Complete this function
        int ret = 0;
        List<HashSet<Integer>> list = new ArrayList<>();
        
        for (int i = 0; i < tickets.length; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = 0; j <= 9; j++) {
                if (-1 == tickets[i].indexOf('0' + j)) {
                    set.add(j);
                }
            }
            
            list.add(set);
        }
        
        for (int j = 0; j < list.size(); j++) {
            HashSet<Integer> set1 = list.get(j);
            Iterator it = set1.iterator();
            
            for (int k = j + 1; k < list.size(); k++) {
                HashSet<Integer> set2 = list.get(k);
                boolean flag = true;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ret++;
                }
            }
        }
        
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for(int tickets_i = 0; tickets_i < n; tickets_i++){
            tickets[tickets_i] = in.next();
        }
        int result = winningLotteryTicket(tickets);
        System.out.println(result);
        in.close();
    }
}
