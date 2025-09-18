import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] talks = {"aya", "ye", "woo", "ma"};
        List<String> talk = new ArrayList<>();
        for (String s: talks) {
            talk.add(s);
        }
        
        int count = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            StringBuilder sb = new StringBuilder();
            StringBuilder last = new StringBuilder();
            
            for (int j = 0; j < babbling[i].length(); j++) {
                sb.append(babbling[i].charAt(j));
                
                if (talk.contains(sb.toString())) {
                    if (last.toString().equals(sb.toString())) {
                        break;
                    } else {
                        last = new StringBuilder(sb.toString());
                        sb.setLength(0);
                    }
                }
            }
            
            if (sb.length() == 0) {
                count++;
            }
        }
        
        return count;
    }
}