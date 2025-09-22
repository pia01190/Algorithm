class Solution {
    public int solution(String dartResult) {
        int[] result = new int[3];
        int index = -1;
        int num = 0;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char score = dartResult.charAt(i);
            
            if (score == 'S') {
                result[++index] = num;
            } else if (score == 'D') {
                num *= num;
                result[++index] = num;
            } else if (score == 'T') {
                num = num * num * num;
                result[++index] = num;
            } else if (score == '*') {
                result[index] *= 2;
                
                if (index > 0) {
                    result[index - 1] *= 2;
                }
            } else if (score == '#') {
                result[index] *= -1;
            } else if (score == '0') {
                num = (num == 1) ? 10 : 0;
            } else if (dartResult.charAt(i) == '0' && dartResult.charAt(i - 1) == '1' && i > 0) {
                num = 10;
            } else {
                num = Integer.parseInt(String.valueOf(score));
            }
        }
        
        int answer = 0;
        for (int i : result) {
            answer += i;
        }
        
        return answer;
    }
}