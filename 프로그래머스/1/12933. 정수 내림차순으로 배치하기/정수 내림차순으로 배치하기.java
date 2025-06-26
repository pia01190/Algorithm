import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}