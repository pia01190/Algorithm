class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char alphabet = s.charAt(i);
            int jump = 0;
            
            while (jump < index) {
                if (alphabet == 'z') {
                    alphabet = 'a';
                } else {
                    alphabet++;
                }
                
                if (!skip.contains(String.valueOf(alphabet))) {
                    jump++;
                }
            }
            
            sb.append(alphabet);
        }
        
        return sb.toString();
    }
}