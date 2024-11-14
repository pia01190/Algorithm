class Solution {
    public String solution(int num) {
        
        String answer = "";
        
        if (num % 2 == 0) { // 짝수일 경우
            answer = "Even";
        } else { // 홀수일 경우
            answer = "Odd";
        }
        
        System.out.print(answer);
        return answer;
    }
}