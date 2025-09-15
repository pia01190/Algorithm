import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
        }
        
        Queue<String> cacheQueue = new LinkedList<>();
        int time = 0;
        
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i];
            
            if (cacheQueue.contains(city)) {
                cacheQueue.remove(city);
                cacheQueue.add(city);
                time += 1;
            } else {
                if (cacheQueue.size() == cacheSize) {
                    cacheQueue.poll();
                }
                
                cacheQueue.add(city);
                time += 5;
            }
        }
        
        return time;
    }
}