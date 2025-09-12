class Solution {
    public int[] solution(int brown, int yellow) {
        int row = 0;
        int col = 0;
        int carpet = brown + yellow;
        
        for (int i = 1; i <= carpet; i++) {
            row = i;
            col = carpet / row;
            
            if (row > col) {
                continue;
            }
            
            if ((row - 2) * (col - 2) == yellow && row * col == carpet) {
                break;
            }
        }
        
        return new int[] {col, row};
    }
}
