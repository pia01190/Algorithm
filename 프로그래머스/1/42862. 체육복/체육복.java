class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int count = 0;
        
        int[] student = new int[n];
        for (int i = 0; i < n; i++) {
            student[i] = 1;
        }
        
        for (int i : lost) {
            student[i - 1]--;
        }
        
        for (int i : reserve) {
            student[i - 1]++;
        }
        
        for (int i = 0; i < n; i++) {
            if (student[i] == 0) {
                if (i > 0 && student[i - 1] == 2) {
                    student[i]++;
                    student[i - 1]--;
                } else if (i < n - 1 && student[i + 1] == 2) {
                    student[i]++;
                    student[i + 1]--;
                }
            }
            
            if (student[i] > 0) {
                count++;
            }
        }
        
        return count;
    }
}