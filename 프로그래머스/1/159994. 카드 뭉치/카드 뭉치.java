import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cards1Queue = new LinkedList<>();
        for (String s : cards1) {
            cards1Queue.add(s);
        }
        
        Queue<String> cards2Queue = new LinkedList<>();
        for (String s : cards2) {
            cards2Queue.add(s);
        }
        
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cards1Queue.peek())) {
                cards1Queue.poll();
            } else if (goal[i].equals(cards2Queue.peek())) {
                cards2Queue.poll();
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}