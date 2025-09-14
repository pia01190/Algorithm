import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            list.add(players[i]);
            map.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            String player = callings[i];
            int rank = map.get(player);
            String frontPlayer = list.get(rank - 1);
            
            list.set(rank - 1, player);
            list.set(rank, frontPlayer); 

            map.put(player, rank - 1);
            map.put(frontPlayer, rank);
        }
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}