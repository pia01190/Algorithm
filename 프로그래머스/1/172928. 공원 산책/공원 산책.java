class Solution {
    public int[] solution(String[] park, String[] routes) {
        int w = park[0].length();
        int h = park.length;
        int[] start = new int[2];
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            int direction = routes[i].charAt(0);
            int num = routes[i].charAt(2) - '0';
            
            if(direction == 'N') {
                if (start[0] - num < 0) {
                    continue;
                }
                
                start[0] -= num;
                
                for (int j = start[0]; j < start[0] + num; j++) {
                    if (park[j].charAt(start[1]) == 'X') {
                        start[0] += num;
                        break;
                    }
                }
            } else if (direction == 'S') {
                if (start[0] + num >= h) {
                    continue;
                }
                
                start[0] += num;
                
                for (int j = start[0] - num + 1; j <= start[0]; j++) {
                    if (park[j].charAt(start[1]) == 'X') {
                        start[0] -= num;
                        break;
                    }
                }
                
            } else if (direction == 'W') {
                if (start[1] - num < 0) {
                    continue;
                }
                
                start[1] -= num;
                
                for (int j = start[1]; j < start[1] + num; j++) {
                    if (park[start[0]].charAt(j) == 'X') {
                        start[1] += num;
                        break;
                    }
                }
            } else {
                if (start[1] + num >= w) {
                    continue;
                }
                
                start[1] += num;
                
                for (int j = start[1] - num + 1; j <= start[1]; j++) {
                    if (park[start[0]].charAt(j) == 'X') {
                        start[1] -= num;
                        break;
                    }
                }
            }
        }
        
        return start;
    }
}