import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> temp = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp.add(arr[i]);
            }
        }
        
        if (temp.isEmpty()) {
            int[] answer = {-1};
            return answer;
        }
            
        int[] answer = new int[temp.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = temp.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}