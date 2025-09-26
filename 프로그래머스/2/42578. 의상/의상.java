import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> clothesMap = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            clothesMap.put(type, clothesMap.getOrDefault(type, 1) + 1);
        }
        
        int answer = 1;
        for (int i : clothesMap.values()) {
            answer *= i;
        }
        
        return answer - 1;
    }
}