import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        
        Map<String, Integer> periodMap = new HashMap<>();
        for (int i = 0; i < terms.length; i++) {
            String[] str = terms[i].split(" ");
            periodMap.put(str[0], Integer.parseInt(str[1]));
        }
        
        Calendar todayCal = toCalendar(today);
        String[][] privacy = new String[privacies.length][2];
        
        for (int i = 0; i < privacies.length; i++) {
            String[] str = privacies[i].split(" ");
            privacy[i][0] = str[0];
            privacy[i][1] = str[1];
            
            Calendar privacyCal = toCalendar(privacy[i][0]);
            privacyCal.add(Calendar.MONTH, periodMap.get(privacy[i][1]));
            privacyCal.add(Calendar.DATE, -1);
            
            if (privacyCal.before(todayCal)) {
                list.add(i + 1);
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
    
    public Calendar toCalendar(String dateStr) {
        String[] dateSplit = dateStr.split("\\.");
        int year = Integer.parseInt(dateSplit[0]);
        int month = Integer.parseInt(dateSplit[1]);
        int day = Integer.parseInt(dateSplit[2]);
        
        Calendar date = Calendar.getInstance();
        date.set(year, month + 1, day);
        
        return date;
    }
}