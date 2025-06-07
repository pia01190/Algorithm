class Solution {
    public int solution(int order) {
        int answer = 0;
        String o = Integer.toString(order);
        String[] array = o.split("");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("3") || array[i].equals("6") || array[i].equals("9")) {
                answer++;
            }
        }
        
        return answer;
    }
}