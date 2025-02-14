class Solution {
    public int[] solution(int money) {
        int cups = money / 5500;
        int balance = money % 5500;
        
        int[] answer = {cups, balance};
        
        return answer;
    }
}