import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] period = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            int target = prices[i];
            
            for (int j = i + 1; j < prices.length; j++) {
                period[i]++;

                if (prices[j] < target) {
                    break;
                }
            }
        }
        
        return period;
    }
}