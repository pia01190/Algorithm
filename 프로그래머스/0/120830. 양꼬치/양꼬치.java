class Solution {
    public int solution(int n, int k) {
        int answer = n * 12000;
        int i = 0;
        
        while (n >= 10) {
            i += 1;
            n -= 10;
        }
        
        answer += (k - i) * 2000;
        
        return answer;
    }
}