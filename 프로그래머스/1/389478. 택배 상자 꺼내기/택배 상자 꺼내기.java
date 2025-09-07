class Solution {
    public int solution(int n, int w, int num) {
        int height = (n + w - 1) / w;
        int[][] box = new int[height][w];
        int boxNum = 1;
        int row = 0;
        int col = 0;
        
        // box 배열에 boxNum 넣기
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < w; j++) {
                if (boxNum > n) {
                    break;
                }
                
                if (i % 2 == 0) {
                    box[i][j] = boxNum++;
                } else {
                    box[i][w - 1 - j] = boxNum++;
                }
            }
        }
        
        // num 상자가 위치한 좌표 구하기
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < w; j++) {
                if (box[i][j] == num) {
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        
        // 꺼내야 하는 상자의 총 개수 구하기
        int count = 0;
        for(int i = row; i < height; i++) {
            if(box[i][col] != 0) {
                count++;
            }
        }
        
        return count;
    }
}