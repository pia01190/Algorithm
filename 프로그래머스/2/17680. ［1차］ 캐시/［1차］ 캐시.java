import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();
        }
        
        List<String> cacheList = new LinkedList<>();
        int time = 0;
        
        for (int i = 0; i < cities.length; i++) {
            // cacheList가 비어있지않고 다 차지않은 경우
            if (cacheList.size() < cacheSize && !cacheList.isEmpty()) {
                if (cacheList.contains(cities[i])) {
                    time += 1;
                    cacheList.remove(cities[i]);
                    cacheList.add(cities[i]);
                } else {
                    time += 5;
                    cacheList.add(cities[i]);
                }
            } else if (cacheList.isEmpty()) { // cacheList가 비어있는 경우
                time += 5;
                cacheList.add(cities[i]);
            } else if (cacheList.size() == cacheSize) { // cacheList가 다 찬 경우
                if (cacheList.contains(cities[i])) {
                    time += 1;
                    cacheList.remove(cities[i]);
                    cacheList.add(cities[i]);
                } else {
                    time += 5;
                    cacheList.remove(0);
                    cacheList.add(cities[i]);
                }
            }
        }
        
        return time;
    }
}