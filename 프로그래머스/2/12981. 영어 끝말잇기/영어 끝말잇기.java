import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        Queue<String> wordQueue = new LinkedList<>();
        wordQueue.add(words[0]);
        char last = words[0].charAt(words[0].length() - 1);
        
        int num = 1; // 가장 먼저 탈락하는 사람의 번호
        int turn = 1; // 그 사람이 자신의 몇 번째 차례에 탈락하는지
        boolean fail = false;
        
        for (int i = 1; i < words.length; i++) {
            char first = words[i].charAt(0);
            
            if (first != last) {
                num++;
                fail = true;
                break;
            }
            
            if (wordQueue.contains(words[i])) {
                num++;
                fail = true;
                break;
            }
            
            wordQueue.add(words[i]);
            num++;
            last = words[i].charAt(words[i].length() - 1);
            
            if (num == n) {
                num = 0;
                turn++;
            }
        }
        
        if (fail == false) {
            return new int[] {0, 0};
        }

        return new int[] {num, turn};
    }
}