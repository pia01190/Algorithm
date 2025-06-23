import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        int min = sides[0];
        int max = sides[1];
        
        for (int i = max - min + 1; i <= min + max - 1; i++) {
            answer++;
        }
        
        return answer;
    }
}