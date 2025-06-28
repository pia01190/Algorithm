class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int sign = 1;
        
        for (int i = 0; i < absolutes.length; i++) {
            sign = signs[i] ? 1 : -1;            
            answer += absolutes[i] * sign;
        }
        
        return answer;
    }
}