import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        String hamburger = "1231";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);
            sb.append(ingredient[i]);
            
            if (sb.length() < hamburger.length()) {
                continue;
            }
            
            if (sb.substring(sb.length() - 4).equals(hamburger)) {
                for (int j = 0; j < hamburger.length(); j++) {
                    stack.pop();
                    sb.deleteCharAt(sb.length() - 1);
                }
                count++;
            }
        }
        
        return count;
    }
}