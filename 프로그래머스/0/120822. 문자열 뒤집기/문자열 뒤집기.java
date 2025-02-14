class Solution {
    public String solution(String my_string) {
        StringBuilder str = new StringBuilder(my_string);
        String answer = str.reverse().toString();
        
        return answer;
    }
}