class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] lists = s.split(" ");
        
        for(int i = 0; i < lists.length; i++) {
            if(lists[i].equals("Z")) {
                answer -= Integer.parseInt(lists[i - 1]);
            } else {
                answer += Integer.parseInt(lists[i]);
            }
        }
        
        return answer;
    }
}