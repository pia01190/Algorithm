class Solution {
    public int[] solution(int n, int m) {
        int max = 0;
        
        for (int i = n; i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                max = i;
                break;
            }
        }
        
        int[] answer = {max, n * m / max};
        
        return answer;
    }
}