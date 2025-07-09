class Solution {
    public int solution(int n) {
        int answer = 0;
        String answerStr = "";
        
        while (n != 0) {
            answerStr += n % 3;
            n /= 3;
        }
        
        answer = Integer.parseInt(answerStr, 3);
        
        return answer;
    }
}