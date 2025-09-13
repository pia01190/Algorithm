import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int count = 0;
        String hamburger = "1231";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < ingredient.length; i++) {
            sb.append(ingredient[i]);
            
            if (sb.length() < hamburger.length()) {
                continue;
            }
            
            if (sb.substring(sb.length() - 4).equals(hamburger)) {
                sb.delete(sb.length() - 4, sb.length());
                count++;
            }
        }
        
        return count;
    }
}
