class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a > b) { // a가 b보다 크면 두 값을 교환
            int temp = 0;
            temp = a;
            a = b;
            b = temp;
        }
        
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        
        return answer;
    }
}