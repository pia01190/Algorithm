class Solution {
    public int solution(int n, int m, int[] section) {
        int first = section[0];
        int count = 1;
        
        for (int i = 1; i < section.length; i++) {
            if (section[i] < first + m) {
                continue;
            } else {
                first = section[i];
                count++;
            }
        }
        
        return count;
    }
}