class Solution {
    
    String alphabet = "AEIOU";
    StringBuilder sb = new StringBuilder();
    int count = 0;
    int answer = 0;
    
    public int solution(String word) {
        dfs(sb, word);
        return answer;
    }
    
    private void dfs(StringBuilder sb, String word) {
        if (sb.length() > 5) {
            return;
        }
        
        if (sb.length() > 0) {
            count++;
            
            if (sb.toString().equals(word)) {
                answer = count;
                return;
            }
        }
        
        for (int i = 0; i < alphabet.length(); i++) {
            sb.append(alphabet.charAt(i));
            dfs(sb, word);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}