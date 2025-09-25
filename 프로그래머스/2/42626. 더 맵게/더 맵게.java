import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> score = new PriorityQueue<>();
        for (int i : scoville) {
            score.add(i);
        }
        
        int count = 0;
        while (score.peek() < K && score.size() > 1) {
            int min = score.poll();
            int second = score.poll();
            score.add(min + second * 2);
            count++;
        }
        
        if (score.poll() < K) {
            return -1;
        }
        
        return count;
    }
}