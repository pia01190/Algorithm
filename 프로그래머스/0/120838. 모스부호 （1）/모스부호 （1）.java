class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morseList = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String morse[];
        morse = letter.split(" ");
                
        for (String s : morse) {
            for (int i = 0; i < morseList.length; i++) {
                if (s.equals(morseList[i])) {
                    answer += (char) (i + 'a');
                }
            }
        }
        
        return answer;
    }
}