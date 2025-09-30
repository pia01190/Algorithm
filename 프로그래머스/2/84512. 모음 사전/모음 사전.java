class Solution {
    
    private String alphabet = "AEIOU";
    private StringBuilder sb = new StringBuilder();
    private int count;
    private int answer;
    
    public int solution(String word) {
        count = 0;
        answer = 0;
        dfs(sb, word);
        return answer;
    }
    
    private void dfs(StringBuilder sb, String word) {
        if (sb.toString().equals(word)) {
            answer = count;
            return;
        }
        
        if (sb.length() >= 5) {
            return;
        }
        
        for (int i = 0; i < alphabet.length(); i++) {
            sb.append(alphabet.charAt(i));
            count++;
            dfs(sb, word);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}