import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int days = 0;
        
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for (int i = 0; i < discount.length; i++) {
            Map<String, Integer> map = new HashMap<>();
            
            for (int j = i; j < (i + 10 > discount.length ? discount.length : i + 10); j++) {
                map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
            }
            
            if (map.equals(wantMap)) {
                days++;
            }
        }
        
        return days;
    }
}