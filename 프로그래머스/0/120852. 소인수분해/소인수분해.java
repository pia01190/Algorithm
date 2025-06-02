import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answerArr = new ArrayList<>();
        
        for (int i = 2; i <= n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                answerArr.add(i);
            }
        }
        
        int[] answer = new int[answerArr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerArr.get(i);
        }
        
        return answer;
    }
}