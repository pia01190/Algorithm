class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        String[] array = str.split("");
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            answer += Integer.parseInt(array[i]);
        }
        
        return answer;
    }
}