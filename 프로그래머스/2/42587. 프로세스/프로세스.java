import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {i, priorities[i]});
        }
        
        while (!queue.isEmpty()) {
            int[] index = queue.poll();
            boolean higher = false;
            
            for (int[] q : queue) {
                if (q[1] > index[1]) {
                    higher = true;
                    break;
                }
            }
            
            if (higher) {
                queue.add(index);
            } else {
                answer++;
                if (index[0] == location) {
                    return answer;
                }
            }
        }
        
        return answer;
    }
}