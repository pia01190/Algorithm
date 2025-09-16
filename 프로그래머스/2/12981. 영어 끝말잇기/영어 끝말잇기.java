import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);
        char last = words[0].charAt(words[0].length() - 1);
        
        for (int i = 1; i < words.length; i++) {
            char first = words[i].charAt(0);
            
            if (first != last || !wordSet.add(words[i])) {
                return new int[] {i % n + 1, i / n + 1};
            }
            
            last = words[i].charAt(words[i].length() - 1);
        }

        return new int[] {0, 0};
    }
}