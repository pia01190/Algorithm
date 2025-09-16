import java.util.*;

class Solution {
    public int solution(String s) {
        int count = 0;
        int same = 0;
        int different = 0;
        
        char first = s.charAt(0);
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            
            if (c == first) {
                same++;
            } else {
                different++;
            }
            
            if (same == different) {
                count++;
                same = 0;
                different = 0;
                first = s.charAt(i + 1);
            }
        }
        
        return count + 1;
    }
}