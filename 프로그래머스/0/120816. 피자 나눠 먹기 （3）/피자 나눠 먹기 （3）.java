class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        for (int i = 1; i < slice * n; i++) {
            if (n % slice == 0) {
                answer = n / slice;
            } else {
                answer = n / slice + 1;
            }
        }
        
        return answer;
    }
}