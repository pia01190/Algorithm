class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && n / i == i) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }
        
        return answer;
    }
}