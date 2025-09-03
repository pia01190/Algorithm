import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] count = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i % 5]) {
                count[0]++;
            }
            
            if (answers[i] == person2[i % 8]) {
                count[1]++;
            }
            
            if (answers[i] == person3[i % 10]) {
                count[2]++;
            }
        }
        
        int maxCount = 0;
        for (int i : count) {
            maxCount = Math.max(i, maxCount);
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (maxCount == count[i]) {
                list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}