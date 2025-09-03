import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < completion.length; i++) {
            String name = completion[i];
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for (int i = 0; i < participant.length; i++) {
            String name = participant[i];
            int count = map.getOrDefault(name, 0);
            
            if (count == 0) {
                return name;
            } else if (count == 1) {
                map.remove(name);
            } else if (count > 1) {
                map.put(name, count - 1);
            }
        }
        
        return "";
    }
}
