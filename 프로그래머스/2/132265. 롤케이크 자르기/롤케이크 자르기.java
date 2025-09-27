import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int count = 0;
        Map<Integer, Integer> toppingMap = new HashMap<>();
        Set<Integer> toppingSet = new HashSet<>();
        
        for (int i : topping) {
            toppingMap.put(i, toppingMap.getOrDefault(i, 0) + 1);
        }

        for (int i : topping) {
            toppingSet.add(i);
            toppingMap.put(i, toppingMap.getOrDefault(i, 0) - 1);
            
            if (toppingMap.get(i) == 0) {
                toppingMap.remove(i);
            }
            
            if (toppingMap.size() == toppingSet.size()) {
                count++;
            }
        }

        return count;
    }
}