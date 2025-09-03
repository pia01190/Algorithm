import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < completion.length; i++) {
            String name = completion[i];
            
            if (map.containsKey(name)) {
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }
        
        for (int i = 0; i < participant.length; i++) {
            String name = participant[i];
            
            if (!map.containsKey(name)) {
                answer = name;
            } else if (map.containsKey(name) && map.get(name) == 1) {
                map.remove(name);
            } else if (map.containsKey(name) && map.get(name) > 1) {
                map.put(name, map.get(name) - 1);
            }
        }
        
        return answer;
    }
}