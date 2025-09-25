import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();
        int totalDay = calculateDays(progresses[0], speeds[0]);
        int count = 1;
        
        for (int i = 1; i < progresses.length; i++) {
            int day = calculateDays(progresses[i], speeds[i]);
            
            if (day > totalDay) {
                days.add(count);
                totalDay = day;
                count = 1;
            } else {
                count++;
            }
            
            if (i == progresses.length - 1) {
                days.add(count);
            }
        }
        
        int[] result = new int[days.size()];
        for (int i = 0; i < days.size(); i++) {
            result[i] = days.get(i);
        }
        
        return result;
    }
    
    private int calculateDays(int progresses, int speeds) {
        return ((100 - progresses) % speeds == 0) ?
            (100 - progresses) / speeds :
            (100 - progresses) / speeds + 1;
    }
}
