import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        List<String> list = new LinkedList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }
        
        list.sort((a, b) -> (b + a).compareTo(a + b));
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        
        if (sb.charAt(0) == '0') {
            return "0";
        }
        
        return sb.toString();
    }
}