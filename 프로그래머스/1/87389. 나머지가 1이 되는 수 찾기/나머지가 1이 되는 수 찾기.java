class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                answer = x;
                break;
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(15));
    }
}