class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = i; j > 0; j--) {
                if (i %j == 0) {
                    count++;
                }
            }
            
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
}