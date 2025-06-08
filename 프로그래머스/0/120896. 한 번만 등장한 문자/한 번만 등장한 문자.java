import java.util.*;

class Solution {
    public String solution(String s) {
        String[] array = s.split("");
        Arrays.sort(array);
        String answer = "";
        
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    count++;
                }
            }
            if (count == 1) {
                answer += array[i];
            }
        }
        
        return answer;
    }
}