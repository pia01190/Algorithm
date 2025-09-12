import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int count = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int i = 0; i < enemy.length; i++) {
            if (n - enemy[i] < 0) {
                if (k > 0) {
                    n -= enemy[i];
                    k--;
                    pq.add(enemy[i]);
                    n += pq.poll();
                    count++;
                } else {
                    break;
                }
            } else {
                pq.add(enemy[i]);
                n -= enemy[i];
                count++;
            }
        }
        
        return count;
    }
}