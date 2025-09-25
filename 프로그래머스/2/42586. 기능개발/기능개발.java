import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int totalDay = ((100 - progresses[0]) % speeds[0] == 0) ? (100 - progresses[0]) / speeds[0] : (100 - progresses[0]) / speeds[0] + 1;
        int count = 1;
        
        for (int i = 1; i < progresses.length; i++) {
            int day = ((100 - progresses[i]) % speeds[i] == 0) ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
            if (day > totalDay) {
                totalDay = day;
                result.add(count);
                count = 1;
            } else {
                count++;
            }
            
            if (i == progresses.length - 1) {
                result.add(count);
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}