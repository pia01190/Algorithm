class Solution {
    public int[] solution(int[] num_list) {
        int x = 0, y = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                x++;
            } else {
                y++;
            }
        }
        
        int[] answer = {x, y};
        
        return answer;
    }
}