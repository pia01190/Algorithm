import java.util.*;

class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[A-z]", "");
        String[] arr = my_string.split("");
        int answerArr[] = new int[arr.length];
        int answer = 0;
        
        for (int i = 0; i < arr.length; i++) {
            answerArr[i] = Integer.parseInt(arr[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            answer += answerArr[i];
        }
        
        return answer;
    }
}