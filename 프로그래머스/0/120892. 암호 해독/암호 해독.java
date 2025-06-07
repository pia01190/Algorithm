class Solution {
    public String solution(String cipher, int code) {
        String[] array = cipher.split("");
        String answer = "";
        
        for (int i = code - 1; i < array.length; i += code) {
            answer += array[i];
        }
        
        return answer;
    }
}