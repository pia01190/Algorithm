class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 1;
        
        while (count < k) {
            answer = (answer + 2) % numbers.length;
            count++;
        }
        
        return numbers[answer];
    }
}