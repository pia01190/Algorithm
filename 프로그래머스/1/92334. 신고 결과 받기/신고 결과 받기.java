import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        // 유저 id와 유저 id가 신고한 id 저장
        Map<String, Set<String>> map = new HashMap<>();
        for (String id : id_list) {
            map.put(id, new HashSet<>());
        }
        
        for (String r : report) {
            String[] reports = r.split(" ");
            String reporter = reports[0];
            String reported = reports[1];
    
            map.get(reporter).add(reported);
        }
        
        // 유저 id와 신고당한 횟수 저장
        Map<String, Integer> idMap = new HashMap<>();
        for (String id : id_list) {
            idMap.put(id, 0);
        }
        
        for (Set<String> reportedSet : map.values()) {
            for (String reported : reportedSet) {
                idMap.put(reported, idMap.get(reported) + 1);
            }
        }
        
        // 정지된 id 리스트
        List<String> reportedList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : idMap.entrySet()) {
            if (entry.getValue() >= k) {
                reportedList.add(entry.getKey());
            }
        }
        
        // 유저 id와 메일 받은 횟수 저장
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String id = id_list[i];
            int count = 0;
            
            for (String reported : map.get(id)) {
                if (reportedList.contains(reported)) {
                    count++;
                }
            }
            
            answer[i] = count;
        }
        
        return answer;
    }
}