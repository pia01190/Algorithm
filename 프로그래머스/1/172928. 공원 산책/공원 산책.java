import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();
        int[] answer = new int[2];
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        Map<Character, int[]> map = new HashMap<>();
        map.put('N', new int[]{-1, 0});
        map.put('S', new int[]{1, 0});
        map.put('W', new int[]{0, -1});
        map.put('E', new int[]{0, 1});
        
        for (int i = 0; i < routes.length; i++) {
            char direction = routes[i].charAt(0);
            int num = routes[i].charAt(2) - '0';
            int[] move = map.get(direction);
            
            int nextH = answer[0];
            int nextW = answer[1];
            boolean ok = true;
            
            for (int j = 0; j < num; j++) {
                nextH += move[0];
                nextW += move[1];
                
                if (!canMove(nextH, nextW, park, h, w)) {
                    ok = false;
                    break;
                }
            }
            
            if (ok) {
                answer[0] = nextH;
                answer[1] = nextW;
            }
        }
        
        return answer;
    }
    
    private static boolean canMove(int nextH, int nextW, String[] park, int h, int w) {
        return (nextH >= 0 && nextH < h && nextW >= 0 && nextW < w && park[nextH].charAt(nextW) != 'X');
    }
}