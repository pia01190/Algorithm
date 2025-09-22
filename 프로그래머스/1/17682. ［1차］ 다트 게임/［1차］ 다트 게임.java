class Solution {
    public int solution(String dartResult) {
        int[] result = new int[3];
        int index = -1;
        int num = 0;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char score = dartResult.charAt(i);
            
            if (score == 'S' || score == 'D' || score == 'T') {
                index = area(result, index, num, score);
            } else if (score == '*' || score == '#') {
                award(result, index, score);
            } else if (i > 0 && dartResult.charAt(i) == '0' && dartResult.charAt(i - 1) == '1') {
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
    
    private static int area(int[] result, int index, int num, char score) {
        if (score == 'S') {
            result[++index] = num;
        } else if (score == 'D') {
            num *= num;
            result[++index] = num;
        } else if (score == 'T') {
            num = num * num * num;
            result[++index] = num;
        }
        
        return index;
    }
    
    private static void award(int[] result, int index, char score) {
        if (score == '*') {
            result[index] *= 2;
                
            if (index > 0) {
                result[index - 1] *= 2;
            }
        } else if (score == '#') {
            result[index] *= -1;
        }
    }
}