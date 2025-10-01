class Solution {
    public String solution(String new_id) {
        StringBuilder sb = new StringBuilder();
        sb.append(new_id.toLowerCase());
        
        for (int i = 0; i < sb.length(); i++) {
            char alphabet = sb.charAt(i);
            
            if (!((alphabet >= 'a' && alphabet <= 'z') ||
                (alphabet >= '0' && alphabet <= '9') ||
                alphabet == '-' || alphabet == '_' || alphabet == '.')) {
                sb.deleteCharAt(i--);
            }
        }
        
        if (sb.length() == 0) {
            sb.append('a');
        }
        
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == '.' && sb.charAt(i - 1) == '.') {
                sb.deleteCharAt(i--);
            }
        }
        
        while (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if (sb.length() >= 16) {
            sb.setLength(15);
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if (sb.length() == 0) {
            sb.append('a');
        }
        
        while (sb.length() < 3) {
            sb.append(sb.charAt(sb.length() - 1));
        }
        
        return sb.toString();
    }
}