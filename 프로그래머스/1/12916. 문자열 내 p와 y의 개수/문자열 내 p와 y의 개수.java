class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        String[] str = s.split("");
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("p")) {
                countP++;
            } else if (str[i].equals("y")) {
                countY++;
            }
        }
        
        if (countP != countY) {
            answer = false;
        }
        
        return answer;
    }
}