class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                num += j;
                
                if (num > n) {
                    num = 0;
                    break;
                } else if (num == n) {
                    answer++;
                    num = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}